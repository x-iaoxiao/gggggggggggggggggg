package com.neuedu.testservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MyFirstServlet extends HttpServlet{
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("servlet����");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		StringBuffer url = req.getRequestURL();
		System.out.println(url.toString());
		PrintWriter out = resp.getWriter();
		HttpSession session = req.getSession();
		session.setAttribute("", "");
		out.println("my test servlet");
		out.close();
	}
	
	@Override
	public void destroy() {
		System.out.println("servlet������");
	}
	
}
