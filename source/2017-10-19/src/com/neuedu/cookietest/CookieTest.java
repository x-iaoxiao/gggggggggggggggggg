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
		//创建一个cookie
		Cookie cookie = new Cookie("username", "sdf");
		//设置cookie的保存时间,默认值为浏览器关闭
		cookie.setMaxAge(60 * 60 *24);
		//设置cookie的保存路径
		cookie.setPath("/2017-10-19/");
		//通知浏览器保存cookie,使用响应对象
		System.out.println(1);
		resp.addCookie(cookie);
		resp.sendRedirect("/2017-10-19/cookie.jsp");
	}
	
}
