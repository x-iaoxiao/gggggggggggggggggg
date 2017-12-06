package com.neuedu.jdbctest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcTest {
	public static void main(String[] args) throws Exception {
		//new Driver();
//		Class.forName("com.mysql.jdbc.Driver");
//		//jdbc:mysql://ip:port/database
//		Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test1",
//				"root","1234");
//		//设置提交方式
//		conn.setAutoCommit(false);
//		PreparedStatement psta = conn.prepareStatement("select * from emp");
//		ResultSet rs = psta.executeQuery();
//		while(rs.next()){
//			System.out.println(rs.getInt("empno"));
//			System.out.println(rs.getString("ename"));
//		}
//		
//		Connection conn1 = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test1",
//				"root","1234");
//		PreparedStatement psta1 = conn1.prepareStatement("select * from emp");
//		ResultSet rs1 = psta.executeQuery();
//		while(rs1.next()){
//			System.out.println(rs1.getInt("empno"));
//			System.out.println(rs1.getString("ename"));
//		}
//		PreparedStatement psta = conn.prepareStatement("delete from emp where empno = 1005");
//		int i = psta.executeUpdate();
//		System.out.println(i);
		//提交事务
//		conn.commit();
//		conn.close();
//		psta.close();
//		rs.close();
		
		a();
		a();
	}
	
	public static void a() throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		//jdbc:mysql://ip:port/database
		Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test1",
				"root","1234");
		//设置提交方式
		conn.setAutoCommit(false);
		PreparedStatement psta = conn.prepareStatement("select * from emp");
		ResultSet rs = psta.executeQuery();
		while(rs.next()){
			System.out.println(rs.getInt("empno"));
			System.out.println(rs.getString("ename"));
		}
	}
	
}
