<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><c:out value="${language.name}" /></title>
</head>
<body>
	<p>
		<c:out value="${language.name}" />
	</p>
	<p>
		<c:out value="${language.creator}" />
	</p>
	<p>
		<c:out value="${language.currentVersion}" />
	</p>
	
	<a href="/languages/${language.id}/edit">Edit</a>
	<a href="/languages">Dashboard</a>
</body>
</html>