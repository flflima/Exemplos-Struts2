<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Números Aleatórios</title>
</head>
<body>
	<s:form action="NumeroAleatorio">
		<s:label value="Número Máximo" />
		<s:textfield name="maximo" />
		<s:submit value="Gera número aleatório"/>
	</s:form>
</body>
</html>