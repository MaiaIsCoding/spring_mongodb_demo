<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>

<head>

</head>
<body>

<h2>Adicionar usuário</h2>

<form:form action="saveUser" modelAttribute="user" method="POST">
	<table>
		<tbody>
			<tr>
				<td><label>Nome</label></td>
				<td><form:input path="nome"/></td>
			</tr>
			<tr>
				<td><label>Email</label></td>
				<td><form:input path="email"/></td>
			</tr>
			<tr>
				<td><label>Telefone</label></td>
				<td><form:input path="tel" placeholder="(13)3311-2233"/></td>
			</tr>
			<tr>
				<td><input type="submit" value="Salvar" class="salvar"/></td>
			</tr>
		</tbody>
	</table>
</form:form>

</body>

</html>