<%@ page contentType="text/html; charset=GBK" %>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
	<body>
		<center>
			<br>
			<br>
			<table border="1">
				<tr>

					<td>
						���׽��
					</td>
					<td>
						����ʱ��
					</td>
					<td>
						�ʻ����
					</td>
				</tr>
				<s:iterator value="list">
					<tr>
						<td>
							<s:property value="trade" />
						</td>
						<td>
							<s:property value="money" />
						</td>
						<td>
					    <s:property value="datatime" />
						</td>
						<td>
							<s:property value="balance" />
						</td>
					</tr>
				</s:iterator>
			</table>
		</center>
	</body>
</html>
