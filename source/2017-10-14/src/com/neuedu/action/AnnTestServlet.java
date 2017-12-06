package com.neuedu.action;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/anntest.do",initParams={
		@WebInitParam(name="Encoding",value="UTF-8")
		},loadOnStartup=1
)
public class AnnTestServlet extends HttpServlet{

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println(config.getInitParameter("Encoding"));
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("zhixing le ");
	}
	
}
