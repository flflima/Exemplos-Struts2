<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Autenticação</title>
</head>
<body>
	<div style="color: red">
		<s:property value="mensagem" />
	</div>

	<s:form action="Login">
		<s:label value="Usuário: " />
		<s:textfield name="usuario" />
		<s:label value="Senha: " />
		<s:password name="senha" />
		<s:submit value="Enviar" />
	</s:form>
</body>
</html>