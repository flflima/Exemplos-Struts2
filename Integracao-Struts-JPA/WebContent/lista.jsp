<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Integração Struts Com JPA</title>
</head>
<body>
	<ul>
		<s:iterator value="carros">
			<li><s:property value="marca"/> - <s:property value="modelo"/></li>
		</s:iterator>
	</ul>
</body>
</html>