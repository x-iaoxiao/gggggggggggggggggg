package jdbc.warp;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;

import jdbc.model.Stu;
import utils.JdbcUtils;

public class Test {

	public static void main(String[] args) {
		JdbcUtils jdbcutils=new JdbcUtils();
		String sql="SELECT * FROM STU";
		Object[] params= {};
		List stus=new ArrayList();
		stus=jdbcutils.findByType(sql, Stu.class, params);
		for(Object o:stus) {
			System.out.println(o);
		}
	}
}
