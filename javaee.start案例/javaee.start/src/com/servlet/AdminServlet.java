package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.octo.captcha.service.CaptchaServiceException;
import com.utils.security.web.CaptchaServiceSingleton;

@WebServlet("/AdminServlet")
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
			throws ServletException, IOException {
		
		Boolean isResponseCorrect = Boolean.FALSE;

		String captchaId = httpServletRequest.getSession().getId();

		String response = httpServletRequest.getParameter("j_captcha_response");

		try {
			isResponseCorrect = CaptchaServiceSingleton.getInstance().validateResponseForID(captchaId, response);

			if (isResponseCorrect) {
				System.out.println("checkcode ok..........");
				String name = httpServletRequest.getParameter("name");
				String pwd = httpServletRequest.getParameter("pwd");
//				
				if("admin".equalsIgnoreCase(name) && "admin".equalsIgnoreCase(pwd)) {
					httpServletResponse.sendRedirect("/javaee.start/index.html");
				} else {
					httpServletResponse.sendRedirect("#");
				}
				
			} else {
				System.out.println("error");
			}
			
			String name = httpServletRequest.getParameter("name");
			String pwd = httpServletRequest.getParameter("pwd"); 
			
		
		} catch (CaptchaServiceException e) {
			e.printStackTrace();
		}
	}

}
