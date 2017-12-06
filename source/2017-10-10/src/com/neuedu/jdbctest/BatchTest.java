package com.neuedu.jdbctest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BatchTest {
	public static void main(String[] args) throws Exception {
		//批处理
		//10条sql语句
		Class.forName("com.mysql.jdbc.Driver");
		//jdbc:mysql://ip:port/database
		Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test1",
				"root","1234");
		PreparedStatement psta = conn.prepareStatement("insert into emp values(?,?,?,?,?)");
		psta.setInt(1, 1005);
		psta.setString(2, "newemp");
		psta.setInt(3, 1000);
		psta.setString(4, "战士");
		psta.setInt(5, 10);
		//将sql添加到批处理中
		//443 224 216 179 219
		//1510 1680
		//2105 1847
		
		long start = System.currentTimeMillis();
		for (int i = 0; i < 100; i++) {
			psta.addBatch("insert into emp (empno) values("+i+")");
		}
		//执行批处理任务
		psta.executeBatch();
//		for (int i = 0; i < 100; i++) {
//			psta.executeUpdate("insert into emp (empno) values("+i+")");
//		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}
}
