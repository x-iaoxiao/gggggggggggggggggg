<%@ page contentType="text/html; charset=GBK"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
    <title>�����˻�����ϵͳ Powered by �ư���</title>
	<body>
	<div align="center">
    <p>&nbsp;</p>
    <p><img src="image/bar_ebanking.jpg" width="744" height="70"></p>
    <p>&nbsp;</p>
    <p><img src="image/welcome.gif" width="337" height="45"></p>
    <p>&nbsp;</p>
    <p><img src="image/perlog1.gif" width="488" height="26"></p>
    <p>&nbsp;</p>
    </div>
	<div>
		<center>
			<s:form action="loginValidate">
				<s:textfield name="userNO" label="�ʺ�" />
				<s:password name="password" label="����" />
				<s:submit value="ȷ��"/>
				<s:reset value="����"/>
			</s:form>
			<a href="regist.jsp">ע�����ʻ�</a>
		</center>
	</div>
	</body>
</html>
