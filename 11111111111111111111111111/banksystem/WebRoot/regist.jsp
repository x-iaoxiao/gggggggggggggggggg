<%@ page contentType="text/html; charset=GBK"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
<title>�����˻�����ϵͳ Powered by �ư���</title>
	<body>
		<div align="center"></div>
		<p align="center">
			<img src="image/login_02.gif" width="763" height="65">
		</p>
		<p align="center">
			<img src="image/perlog1.gif" width="488" height="26">
		</p>
		<p align="center">
			<img src="image/welcome.gif" width="303" height="41" align="middle">
		</p>
		<br>
		<center>
			<%-- ����regValidate���Action�����д�����������ִ�пͻ���У��--%>
			<s:form action="regValidate" validate="true">
				<%--����token��ǩ�������ظ��ύ--%>
				<s:token />
				<%--�ı����ǩ������name����ָ����ֵ������label����ָ�����ı����ǩ��--%>
				<s:textfield name="userInfo.userName" label="����" />
				<s:password name="userInfo.password" label="����" />
				<s:textfield name="userInfo.userAge" label="����" />
				<s:textfield name="userInfo.idCard" label="���֤" />
				<s:textfield name="userInfo.userSex" label="�Ա�" />
				<s:textfield name="userInfo.tel" label="�绰" />
				<s:textfield name="userInfo.city" label="����" />
				<s:textfield name="userInfo.address" label="��ַ" />
				<s:submit value="ȷ��" />
				<s:reset value="����" />
			</s:form>
		</center>
	</body>
</html>
