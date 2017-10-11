package jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Jdbc1Á¬½Ó {

	private static String URL="jdbc.demo:oracle:thin:@127.0.0.1:1521:xe";
	private static String NAME="XX";
	private static String PWD="040340";
	public static void main(String[] args) throws Exception {
	
		Class.forName("oracle:jdbc.demo:driver:OracleDriver");
		Connection conn=DriverManager.getConnection(URL,NAME,PWD);
		Statement stmt=conn.createStatement();
		
	}
}
