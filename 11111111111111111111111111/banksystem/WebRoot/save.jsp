<%@ page contentType="text/html; charset=GBK"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
<title>�����˻�����ϵͳ Powered by �ư���</title>
<body>
<center>
<br><br><br><br><br>
	<s:form action="smoneyValidate" validate="true">
	<s:token/>
	<s:textfield name="money" label="��������"/>
	<s:submit value="ȷ��"/>
	<s:reset value="����"/>
	</s:form>
</center>
</body>
</html>