package jdbc.warp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import jdbc.model.Stu;
import utils.JdbcUtils;

public class 封装 {

	private static String URL="jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private static String NAME="xx";
	private static String PSW="123";
	
	public static void main(String[] args) {
	
//		Stu stu=new Stu(11,"周",22);
//		saveStu2(stu);
//		removeStu(10);
//		queryStu();
//		queryStu2();
		
		
	}
	
	//使用工具封装插入数据的操作
	public static void saveStu2(Stu stu) {
		
		JdbcUtils jdbcutils=new JdbcUtils();
		String sql="INSERT INTO STU(SID,SNAME,SAGE) VALUES(?,?,?)";
		Object[] params= {stu.getSid(),stu.getSname(),stu.getSage()};
		int row=jdbcutils.executeUpdate(sql, params);
		
		System.out.println(row+"行受影响");
		
	}
	//使用工具封装删除数据的操作
	public static void removeStu(int id) {
		JdbcUtils jdbcutils=new JdbcUtils();
		String sql="DELETE FROM STU WHERE SID=?";
		Object[] params= {id};
		int row=jdbcutils.executeUpdate(sql, params);
		
		System.out.println(row+"行受影响");
	}
	////////////////////////////////////////////////
	////////////////////////////////////////////////
	//使用工具封装修改数据的操作
	public static void alertStu() {
		JdbcUtils jdbcutils=new JdbcUtils();
		String sql="ALERT STU ? where ?=?";
		Object[] params= {};
		int row=jdbcutils.executeUpdate(sql, params);
		
		System.out.println(row+"行受影响");
	} 
	/////////////////////////////////////////////////
	/////////////////////////////////////////////////
	
	//使用工具封装查询数据的操作1.1
	public static void queryStu() {
		JdbcUtils jdbcutils=new JdbcUtils();
		ResultSet rs=null;
		ResultSetMetaData rsmd=null;
		String sql="SELECT * FROM STU ";
		Object[] params= {};
		rs=jdbcutils.executeQuery(sql, params);
		try {
			rsmd=rs.getMetaData();
//			System.out.println("1");
			while(rs.next()) {
		        for(int i=1;i<=rsmd.getColumnCount();i++){
		    	   System.out.print(rsmd.getColumnName(i)+"\t"+rs.getObject(i)+"\t");
		        }
		        System.out.println();
//		        int i=1;
//		        while(rs.next()) {
//		        	System.out.println(rs.getObject(i));
//		        }
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	} 
	////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////
	//使用工具封装查询数据的操作1.2
		public static void queryStu1() {
			JdbcUtils jdbcutils=new JdbcUtils();
			ResultSet rs=null;
			ResultSetMetaData rsmd=null;
			String sql="SELECT S1.SNAME,S2.SNAME FROM STU S1,STU S2 WHERE S1.SAGE=S2.SAGE AND S1.SNAME!=S2.SNAME";
			Object[] params= {};
			rs=jdbcutils.executeQuery(sql, params);
			try {
				rsmd=rs.getMetaData();
				while(rs.next()) {
			        for(int i=1;i<=rsmd.getColumnCount();i++){
			    	   System.out.print(rsmd.getColumnName(i)+"\t"+rs.getObject(i)+"\t");
			        }
			        System.out.println();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

		} 
      ////////////////////////////////////////////////////////////////////
      ////////////////////////////////////////////////////////////////////
	//使用工具封装查询数据的操作2（将结果存入bean）
//		public static void queryStu2() {
//			JdbcUtils jdbcutils=new JdbcUtils();
//			List stus=new ArrayList();
//			String sql="SELECT * FROM STU";
//			Object[] params= {};
//			stus=jdbcutils.findByType(sql, Stu.class, params);
//			for(Object o:stus) {
//				System.out.println(o);
//			}
//		} 
//		
    //
	public static void saveStu(Stu stu) {
		Connection conn=null;
		PreparedStatement ps=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection(URL,NAME,PSW);
		
			String sql="INSERT INTO STU(SID,SNAME,SAGE) VALUES(?,?,?)";
			
			ps=conn.prepareStatement(sql);

			ps.setInt(1, stu.getSid());
			System.out.println(stu.getSname());
			ps.setString(2,stu.getSname());
			
			ps.setInt(3, stu.getSage());
	
			ps.executeUpdate();
		
		}catch(SQLException e){
			e.printStackTrace();
		}catch(Exception a) {
			a.printStackTrace();
		}

	}
	
}

