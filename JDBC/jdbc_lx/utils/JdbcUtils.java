package utils;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;

//import org.apache.commons.beanutils.BeanUtils;

public class JdbcUtils {
	
	private static String URL="jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private static String NAME="xx";
	private static String PSW="123";
	//创建连接
	private Connection conn;
	public void openConnection(){
	
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection(URL,NAME,PSW);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	//增删改
	public int executeUpdate(String sql,Object[]params) {
		int row=0;
		openConnection();
		PreparedStatement ps;
		try {
			ps=conn.prepareStatement(sql);
			if(params!=null&&params.length>0) {
				for(int i=0;i<params.length;i++) {
				ps.setObject(i+1, params[i]);	
				}
			}
			row=ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return row;
	}

	//查询
	public ResultSet executeQuery(String sql,Object[] params) {
	
		openConnection();
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			ps=conn.prepareStatement(sql);
			if(params!=null&&params.length>0) {
				for(int i=0;i<params.length;i++) {
				ps.setObject(i+1, params[i]);	
				}
			}
			rs=ps.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
	
	//表结构与模型一致的查询
	public List<?> findByType(String sql,Class<?> c,Object[] params){
		
		openConnection();
		PreparedStatement ps=null;
		ResultSet rs=null;
		List<Object> result=new ArrayList<Object>();
		
		try {
			
			ps=conn.prepareStatement(sql);
			
			if(params!=null&&params.length>0) {
				for(int i=0;i<params.length;i++) {
				ps.setObject(i+1, params[i]);	
				}
			}
			
			rs=ps.executeQuery();
			
			ResultSetMetaData rsmd=rs.getMetaData();
			
			while(rs.next()) {
				Object o=c.newInstance();
				Map<String,Object> maps=new HashMap<String,Object>();
				for(int i=1;i<=rsmd.getColumnCount();i++) {
					maps.put(rsmd.getColumnName(i).toLowerCase(),rs.getObject(i));
//					System.out.println();
				}

				BeanUtils.populate(o, maps);
				result.add(o);
//				System.out.println();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
}
