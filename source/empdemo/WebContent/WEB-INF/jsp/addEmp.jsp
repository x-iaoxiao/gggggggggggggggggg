<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>add Emp</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css"
	href="css/style2.css" />
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
							<a href="#">Main</a>
						</h1>
					</div>
					<div id="navigation">
					</div>
				</div>
			<div id="content">
				<p id="whereami">
				</p>
				<h1>
					add Emp info:
				</h1>
				<form action="emplist.html" method="post">
					<table cellpadding="0" cellspacing="0" border="0"
						class="form_table">
						<tr>
							<td valign="middle" align="right">
								Name:
							</td>
							<td valign="middle" align="left">
								<input type="text" class="inputgri" name="name" />
							</td>
						</tr>
						<tr>
							<td valign="middle" align="right">
								Salary:
							</td>
							<td valign="middle" align="left">
								<input type="text" class="inputgri" name="salary" />
							</td>
						</tr>
						<tr>
							<td valign="middle" align="right">
								Job:
							</td>
							<td valign="middle" align="left">
								<input type="text" class="inputgri" name="age" />
							</td>
						</tr>
					</table>
					<p>
						<input type="submit" class="button" value="Confirm" />
					</p>
				</form>
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