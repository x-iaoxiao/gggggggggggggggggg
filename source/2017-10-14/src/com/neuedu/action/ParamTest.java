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
		//1.getParameter:ͨ����ȡ��ֵ,�ó�����ֵ��һ���ַ���
//		String username = req.getParameter("username");
//		String password = req.getParameter("password");
//		System.out.println(username);
//		System.out.println(password);
		//2.getParameterValues�ó�ֵ������
//		String[] usernames = req.getParameterValues("username");
//		for (String string : usernames) {
//			System.out.println(string);
//		}
		//3.getParameterMap�ó����в����ļ���
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
//		System.out.println("���ı�"+req.getParameter("dawenben"));
//		System.out.println(req.getParameter("address"));
//		System.out.println(req.getParameter("test"));
		//ת����distest.do��
//		System.out.println(1);
//		RequestDispatcher rd = req.getRequestDispatcher("distest.do");
//		rd.forward(req, resp);
		//�ض���distest.do��
		System.out.println(1);
		resp.sendRedirect("https://www.baidu.com");
	}
}
