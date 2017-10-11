package jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import jdbc.model.Stu;

public class Test {

	private static String URL="jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private static String NAME="xx";
	private static String PSW="123";
	
	public static void main(String[] args) {
	
		Stu stu=new Stu(3,"Íõ",10);
		saveStu(stu);
		
		
	}
	
	public static void saveStu(Stu stu) {
		Connection conn=null;
		Statement stmt=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection(URL,NAME,PSW);
			stmt =conn.createStatement();
			String sql="INSERT INTO STU(SID,SNAME,SAGE) VALUES('"+stu.getSid()+"','"+stu.getSname()+"','"+stu.getSage()+"')";
//		    String sql="delete stu where sid='3'";
			stmt.execute(sql);
		    System.out.println("OK");
//			stmt.close();
//			conn.close();
			System.out .println("OKOK");
		}catch(SQLException e){
			e.printStackTrace();
		}catch(Exception a) {
			a.printStackTrace();
		}

	}
	
}
