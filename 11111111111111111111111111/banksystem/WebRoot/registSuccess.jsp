<%@ page contentType="text/html; charset=GBK"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
<title>�����˻�����ϵͳ Powered by �ư���</title>
	<body>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<center>
			ע��ɹ������ĸ�����Ϣ���£�<br>
			<table border="1">
				<tr>
					<td>
						�û��ʺ�
					</td>
					<td>
						<s:property value="userInfo.userNO" />
					</td>
				</tr>
				<tr>
					<td>
						�ʻ����
					</td>
					<td>
						<s:property value="userInfo.balance" />
					</td>
				</tr>
				<tr>
					<td>
						�û�����
					</td>
					<td>
						<s:property value="userInfo.userName" />
					</td>
				</tr>
				<tr>
					<td>
						�û��Ա�
					</td>
					<td>
						<s:property value="userInfo.userSex" />
					</td>
				</tr>
				<tr>
					<td>
						�û�����
					</td>
					<td>
						<s:property value="userInfo.userAge" />
					</td>
				</tr>
				<tr>
					<td>
						���֤
					</td>
					<td>
						<s:property value="userInfo.idCard" />
					</td>
				</tr>
				<tr>
					<td>
						��ϵ�绰
					</td>
					<td>
						<s:property value="userInfo.tel" />
					</td>
				</tr>
				<tr>
					<td>
						����
					</td>
					<td>
						<s:property value="userInfo.city" />
					</td>
				</tr>
				<tr>
					<td>
						��ϸ��ַ
					</td>
					<td>
						<s:property value="userInfo.address" />
					</td>
				</tr>
			</table><br>
			���μǲ����ܺ������ʺź����룡
			<a href="login.jsp">���ص�¼ҳ��</a>
		</center>
	</body>
</html>
