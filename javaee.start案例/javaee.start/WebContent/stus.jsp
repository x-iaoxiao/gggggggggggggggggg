<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8" import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	

	<table border=1>
		<tr>
			<td>SID</td>
			<td>Sname</td>
			<td>age</td>
			<td>hire</td>
			<td>操作</td>
		</tr>
	<c:forEach var="stu" items="${stus}">
		<tr>
			<td>${stu.sid }</td>
			<td>${stu.sname }</td>
			<td>${stu.age }</td>
			<td>${stu.hire }</td>
			<td><a href="javascript:removeStu(${stu.sid })" >remove</a> | <a>modify</a></td>
		</tr>
	
	</c:forEach>
	</table>

</body>
</html>
<script>

	function removeStu(sid ) {
		if(confirm("删除")) {
			location.href = "http://localhost:8080/javaee.start/StuServlet?action=removeStuById&sid="+sid;
		} else {
			return ;
		}
	}
	
</script>













<%--

		
	<c:if test="${3<2 }">
		<p id      title    class >${1+1 }</p>
	</c:if>
	
	<hr>
	
	<c:forEach begin="${start }" end="${end }" varStatus="i">
			<a href="#">${ i.index }</a>
	</c:forEach>

 --%>









<%-- 

<%
		for(int i = 0 ; i < 5 ; i++) {
			
			out.println("<a href='#' >baidu</a>");
		}
		out.println("<br>");
	
	%>  
	
	<%=new Date() %>

--%>