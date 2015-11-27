<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>CRUD</title>
</head>
<body>
	<s:a href="index.jsp">Home</s:a>
	<hr/>
	
	<h1>Cadastro ou Alteração de Usuários</h1>
	<s:form action="UsuarioAdicionaOuAltera">
		<s:hidden name="usuario.id"/>
		<s:textfield label="Nome: " name="usuario.nome" />
		<s:textfield label="Username: " name="usuario.username" />
		<s:textfield label="Password: " name="usuario.password" />
		<s:submit value="Salvar" />
	</s:form>
</body>
</html>