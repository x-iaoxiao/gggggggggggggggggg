<%@ page contentType="text/html; charset=GBK"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
<%@include file="check.jsp"%>
<body>
<center>
<br><br><br><br><br>
	<s:form action="fmoneyValidate" validate="true">
	<s:token/>
	<s:textfield name="money" label="����ȡ����"/>
	<s:submit value="ȷ��"/>
	<s:reset value="����"/>
	</s:form>
</center>
</body>
</html>