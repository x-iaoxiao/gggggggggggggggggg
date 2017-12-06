package com.neuedu.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBUtil {
	
	private static List<Connection> connectionlist;
	
	static{
		connectionlist = new ArrayList<Connection>();
		for (int i = 0; i < 30; i++) {
			try {
				Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test1",
						"root","1234");
				connectionlist.add(conn);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static Connection getConnection(){
		
		return connectionlist.remove(0);
	}
	
}
