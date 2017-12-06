<%@page import="java.util.ArrayList"%>
<%@page import="com.neuedu.action.Emp"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="com.neuedu.util.DataSourceUtil"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>emplist</title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" type="text/css" href="css/style2.css" />
	</head>
	<body>
		<div id="wrap">
			<div id="top_content"> 
				<div id="header">
					<div id="rightheader">
						<p>
							2009/11/20
							<br />
						</p>
					</div>
					<div id="topheader">
						<h1 id="title">
							<a href="#">main</a>
						</h1>
					</div>
					<div id="navigation">
					</div>
				</div>
				<div id="content">
					<p id="whereami">
					</p>
					<h1>
						Welcome!
					</h1>
					<table class="table">
						<tr class="table_header">
							<td>
								ID
							</td>
							<td>
								Name
							</td>
							<td>
								Salary
							</td>
							<td>
								Job
							</td>
							<td>
								Operation
							</td>
						</tr>
						
						
						<%
							List<Emp> emplist = (List<Emp>)request.getAttribute("emplist");
						%>
						<%
							for(int i = 0;i < emplist.size();i++){
						%>
								<tr class="row1">
								<td>
									<%
										out.print(emplist.get(i).getEmpno());
									%>
								</td>
								<td>
									<%
										out.print(emplist.get(i).getEname());
									%>
								</td>
								<td>
									<%
										out.print(emplist.get(i).getSalary());
									%>
								</td>
								<td>
									<%
										out.print(emplist.get(i).getJob());
									%>
								</td>
								<td>
									<a href="emplist.html">delete emp</a>&nbsp;<a href="updateEmp.html">update emp</a>
								</td>
							</tr>
						<% 
							}
						%>
						
					</table>
					<p>
						<input type="button" class="button" value="Add Employee" onclick="location='addEmp.html'"/>
					</p>
				</div>
			</div>
			<div id="footer">
				<div id="footer_bg">
				ABC@126.com
				</div>
			</div>
		</div>
	</body>
</html>
