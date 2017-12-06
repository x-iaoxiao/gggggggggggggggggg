package com.neuedu.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.neuedu.util.DataSourceUtil;

@WebServlet(urlPatterns="/emplist.do")
public class EmplistAction extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Connection conn = DataSourceUtil.getConnection();
		Statement sta;
		List<Emp> emplist = new ArrayList<Emp>();
		try {
			sta = conn.createStatement();
			ResultSet rs = sta.executeQuery("select * from emp");
			while(rs.next()){
				emplist.add(new Emp(rs.getInt("empno"), rs.getString("ename"),
						rs.getInt("salary"), rs.getString("job"), rs.getInt("deptno")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//request对象可以调用关于Parameter的方法,拿参数
		//request对象还可以当作map集合用
		req.setAttribute("emplist", emplist);
		req.getRequestDispatcher("emplist.jsp").forward(req, resp);
	}
	
}
