<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ninja Gold Game</title>
</head>
<body>
	<p>
		Your Gold:
		<c:out value="${gold}" />
	</p>
	<form method="POST" action="/farm">
		Farm (earns 10-20 gold)
		<button>Find Gold!</button>
	</form>
	<br>
	<form method="POST" action="/cave">
		Cave (earns 5-10 gold)
		<button>Find Gold!</button>
	</form>
	<br>
	<form method="POST" action="/house">
		House (earns 2-5 gold)
		<button>Find Gold!</button>
	</form>
	<br>
	<form method="POST" action="/casino">
		Casino! (earns/takes 0-50 gold)
		<button>Find Gold!</button>
	</form>
	<br>
	<textarea rows="10" cols="100">
	<c:out value="${txt}" />
	</textarea>




</body>
</html>