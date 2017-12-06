package com.neuedu.cookietest;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/admin/cookietest.do")
public class CookieTest extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//����һ��cookie
		Cookie cookie = new Cookie("username", "sdf");
		//����cookie�ı���ʱ��,Ĭ��ֵΪ������ر�
		cookie.setMaxAge(60 * 60 *24);
		//����cookie�ı���·��
		cookie.setPath("/2017-10-19/");
		//֪ͨ���������cookie,ʹ����Ӧ����
		System.out.println(1);
		resp.addCookie(cookie);
		resp.sendRedirect("/2017-10-19/cookie.jsp");
	}
	
}
