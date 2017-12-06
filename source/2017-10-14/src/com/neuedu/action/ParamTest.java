package com.neuedu.action;

import java.io.IOException;
import java.util.Map;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/paramtest.do")
public class ParamTest extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//1.getParameter:通过键取拿值,拿出来的值是一个字符串
//		String username = req.getParameter("username");
//		String password = req.getParameter("password");
//		System.out.println(username);
//		System.out.println(password);
		//2.getParameterValues拿出值得数组
//		String[] usernames = req.getParameterValues("username");
//		for (String string : usernames) {
//			System.out.println(string);
//		}
		//3.getParameterMap拿出所有参数的集合
//		Map<String, String[]> parammap = req.getParameterMap();
//		Set<String> set = parammap.keySet();
//		for (String key : set) {
//			String[] values = parammap.get(key);
//			for (String value : values) {
//				System.out.println(value);
//			}
//		}
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		req.setCharacterEncoding("UTF-8");
//		System.out.println(req.getParameter("username"));
////		System.out.println(req.getParameter("like"));
//		System.out.println(req.getParameterValues("like")[0]);
//		System.out.println("大文本"+req.getParameter("dawenben"));
//		System.out.println(req.getParameter("address"));
//		System.out.println(req.getParameter("test"));
		//转发到distest.do里
//		System.out.println(1);
//		RequestDispatcher rd = req.getRequestDispatcher("distest.do");
//		rd.forward(req, resp);
		//重定向到distest.do里
		System.out.println(1);
		resp.sendRedirect("https://www.baidu.com");
	}
}
