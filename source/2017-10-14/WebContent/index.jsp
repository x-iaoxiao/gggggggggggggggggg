<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="paramtest.do" method="post">
		用户名:<input type="text" name="username"><br>
		密码:<input type="password" name="password"><br>
		爱好:抽烟<input type="checkbox" name="like" value="chouyan">
		喝酒:<input type="checkbox" name="like" value="jejiu">
		
		<textarea rows="20" cols="20" name="dawenben"></textarea>
		
		<select name="address">
			<option value="tianjin">天津</option>
			<option value="beijing">北京</option>
		</select>
		<input type="hidden" value="测试值" name="test">
		
		<input type="submit">
	</form>
</body>
</html>