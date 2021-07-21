<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Song</title>
</head>
<body>
<form:form action="/dashboard" method="post" modelAttribute="song">
		<p>
			<form:label path="titulo">Titulo</form:label>
			<form:errors path="titulo" />
			<form:input path="titulo" />
		</p>
		<p>
			<form:label path="artista">Artista</form:label>
			<form:errors path="artista" />
			<form:textarea path="artista" />
		</p>
		<p>
			<form:label path="clasificacion">Clasificacion (1-10)</form:label>
			<form:errors path="clasificacion" />
			<form:input path="clasificacion" />
		</p>
		<input type="submit" value="Add Song" />
	</form:form><br>
	<a href="/dashboard">Dashboard</a>
</body>
</html>