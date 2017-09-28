package lianxi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbc_test {
	private static String URL="jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private static String NAME="xx";
	private static String PSW="123";
	public static void main(String [] args) throws Exception{
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn=DriverManager.getConnection(URL,NAME,PSW);
		Statement stmt =conn.createStatement();
		ResultSet rs=stmt.executeQuery("select empno,ename,job from emp");
		String sql_insert="";
		String sql_undate="";
	    String sql_remove="";		
		stmt.execute(sql_insert);
		while(rs.next()) {
			System.out.println(rs.getInt("empno")+"\t"+rs.getString("ename")+"\t"+rs.getString("job"));
		}
	} 
}
