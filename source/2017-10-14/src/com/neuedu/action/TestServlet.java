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
		//config�����ܻ��servlet��ʼ������
		System.out.println(config.getInitParameter("Encoding"));
		System.out.println(config.getInitParameter("testkey"));
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
	
}
