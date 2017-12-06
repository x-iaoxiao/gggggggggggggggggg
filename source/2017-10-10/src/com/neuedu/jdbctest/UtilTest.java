package com.neuedu.jdbctest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.neuedu.util.DBUtil;

public class UtilTest {
	public static void main(String[] args) throws Exception {
		a();
		a();
	}
	
	public static void a() throws Exception{
		Connection conn = DBUtil.getConnection();
		conn.setAutoCommit(false);
		PreparedStatement psta = conn.prepareStatement("select * from emp");
		ResultSet rs = psta.executeQuery();
		while(rs.next()){
			System.out.println(rs.getInt("empno"));
			System.out.println(rs.getString("ename"));
		}
	}
}
