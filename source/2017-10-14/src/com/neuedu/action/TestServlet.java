package com.neuedu.action;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet extends HttpServlet{

	
	@Override
	public void init(ServletConfig config) throws ServletException {
		//config对象能获得servlet初始化参数
		System.out.println(config.getInitParameter("Encoding"));
		System.out.println(config.getInitParameter("testkey"));
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
	
}
