<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>N�meros Aleat�rios</title>
</head>
<body>
	<s:form action="NumeroAleatorio">
		<s:label value="N�mero M�ximo" />
		<s:textfield name="maximo" />
		<s:submit value="Gera n�mero aleat�rio"/>
	</s:form>
</body>
</html>