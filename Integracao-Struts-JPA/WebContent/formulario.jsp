<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Integração Struts Com JPA</title>
</head>
<body>
	<s:form action="AdicionaCarro">
		<s:label value="Marca: " />
		<s:textfield name="carro.marca" />
		<s:label value="Modelo: " />
		<s:textfield name="carro.modelo" />
		<s:submit value="Enviar" />
	</s:form>
</body>
</html>