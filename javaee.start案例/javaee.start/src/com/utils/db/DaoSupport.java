package com.utils.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;

import com.config.AppConfig;

public class DaoSupport {

	private static DaoSupport support = new DaoSupport();

	private LinkedList<Connection> pool = null;
	private int poolSize = 10;

	private DaoSupport() {
		init();
	}

	public static DaoSupport getInstance() {
		return support;
	}

	public void init() {
		pool = new LinkedList<Connection>();
		try {
			for (int i = 0; i < poolSize; i++) {
				Class.forName(AppConfig.DRIVER_CLASS);
				Connection conn = DriverManager.getConnection(AppConfig.URL, AppConfig.USERNAME, AppConfig.PASSWORD);
				pool.add(conn);
			}
		} catch (Exception e) {
//			throw new RuntimeException("连接池初始化错误");
			e.printStackTrace();
		}

	}

	public Connection getConnection() {
		Connection conn = pool.removeLast();
		System.out.println("pool size : " + pool.size());
		return conn;
	}

	// 专门 用于 执行 增删改
	public int executeUpdate(String sql, Object... params) {
		
		Connection conn = getConnection();
		PreparedStatement ps = null;
		
		System.out.println("SQL> " + sql);
		int affectRows = 0;

		try {
			// 问号不确定 , 但可以根据 参数数量来推测 问号的 数量 并 赋值
			ps = conn.prepareStatement(sql);
			for (int i = 0; i < params.length; i++) {
				ps.setObject(i + 1, params[i]);
			}
			affectRows = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		releaseConnection(conn);

		return affectRows;
	}

	// 专门 用于 执行 查询
	public ResultSet executeQuery(String sql, Object... params) {

		Connection conn = getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		System.out.println("SQL> " + sql);
		
		try {
			ps = conn.prepareStatement(sql);
			if (params != null) {
				for (int i = 0; i < params.length; i++) {
					ps.setObject(i + 1, params[i]);
				}
			}
			rs = ps.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return rs;
	}

	public List queryForList(String sql, Class clazz, Object... params) {
		Connection conn = null;
		synchronized (this) {
			conn = getConnection();
		}
		PreparedStatement ps = null;
		ResultSet rs = null;

		List datas = new ArrayList();

		System.out.println("SQL> " + sql);
		
		try {
			ps = conn.prepareStatement(sql);
			if (params != null) {
				for (int i = 0; i < params.length; i++) {
					ps.setObject(i + 1, params[i]);
				}
			}
			rs = ps.executeQuery();
			ResultSetMetaData meta = rs.getMetaData();
			while (rs.next()) {

				Map<String, Object> values = new HashMap<String, Object>();
				Object o = clazz.newInstance(); // o > Teacher

				for (int i = 0; i < meta.getColumnCount(); i++) {
					values.put(meta.getColumnLabel(i + 1).toLowerCase(), rs.getObject(i + 1));
				}

				BeanUtils.populate(o, values); // 将 map 内容 赋值到 o , 通过反射机制 , 避免写
												// setter

				datas.add(o);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			releaseResouce(ps,rs);
			releaseConnection(conn);
		}

		return datas;
	}
	
	public void releaseConnection(Connection conn) {
		try {
			System.out.println("conn status : " + conn.isClosed() );
		} catch (Exception e) {
			System.err.println("----------------------------------------------------------------");
			e.printStackTrace();
			System.err.println("----------------------------------------------------------------");
		}
		pool.addLast(conn);
	}
	
	

	public void releaseResouce(PreparedStatement ps , ResultSet rs) {
		try {
			if (!rs.isClosed()) {
				rs.close();
			} 
			if( !ps.isClosed()) {
				ps.close();
			}
				
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
