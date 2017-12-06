package com.neuedu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.neuedu.entity.Emp;
import com.neuedu.util.DataSourceUtil;

public class EmpDao {
	
	/**
	 * 根据empno查询emp
	 */
	public Emp getEmpByEmpno(int empno){
		Connection conn = null;
		PreparedStatement psta = null;
		ResultSet rs = null;
		Emp emp = null;
		try {
			conn = DataSourceUtil.getConnection();
			String sql = "select * from emp where empno = ?";
			psta = conn.prepareStatement(sql);
			psta.setInt(1, empno);
			rs = psta.executeQuery();
			while(rs.next()){
				emp = new Emp(rs.getInt("empno"), rs.getString("ename"), rs.getInt("salary"), 
						rs.getString("job"), rs.getInt("deptno"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return emp;
	}
	
	/**
	 * 插入数据
	 */
	public int addEmp(Emp emp){
		Connection conn = null;
		PreparedStatement psta = null;
		int is = 0;
		try {
			conn = DataSourceUtil.getConnection();
			String sql = "insert into emp values(?,?,?,?,?)";
			psta = conn.prepareStatement(sql);
			psta.setInt(1, emp.getEmpno());
			psta.setString(2, emp.getEname());
			psta.setInt(3, emp.getSalary());
			psta.setString(4, emp.getJob());
			psta.setInt(5, emp.getDeptno());
			is = psta.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return is;
	}
	
}
