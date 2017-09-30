package com.servlet;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.domain.Stu;
import com.service.StuService;

@WebServlet("/StuServlet")
public class StuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
			String action  = request.getParameter("action");
			
			if("saveStu".equalsIgnoreCase(action)) {
				saveStu(request , response);
			} else if ("findAll".equalsIgnoreCase(action)) {
				findAll(request, response);
			} else if("removeStuById".equalsIgnoreCase(action)) {
				removeStuById(request  ,response);
			}
			
	}

	protected void saveStu(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 接收页面中的数据
		Stu stu = new Stu();

		String sid = request.getParameter("sid");
		String sname = request.getParameter("sname");
		String age = request.getParameter("age");

		stu.setSid(Integer.parseInt(sid));
		stu.setSname(sname);
		stu.setAge(Integer.parseInt(age));
		stu.setHire(new Timestamp(System.currentTimeMillis()));

		StuService service = new StuService();
		service.saveStu(stu);

		findAll(request , response);

	}

	protected void findAll(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 把数据 从数据库 全查出来
		StuService service = new StuService();
		List datas = service.getStus();
		request.setAttribute("stus", datas);

		request.getRequestDispatcher("/stus.jsp").forward(request, response);

	}

	protected void removeStuById(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 获取被删除数据的ID
		String sid = request.getParameter("sid");

		int id = Integer.parseInt(sid);

		StuService service = new StuService();

		service.removeStuById(id);

		findAll(request , response);
	}

}
