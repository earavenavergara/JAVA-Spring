<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Details</title>
</head>
<body>
	<p>
		Titulo:
		<c:out value="${song.titulo}" />
	</p>
	<p>
		Artista:
		<c:out value="${song.artista}" />
	</p>
	<p>
		Clasificacion:
		<c:out value="${song.clasificacion}" />
	</p>
	<a href="/songs/${song.id}/delete">Delete</a>
	<a href="/dashboard">Dashboard</a>
</body>
</html>