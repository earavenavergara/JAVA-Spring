<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isErrorPage="true"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<meta charset="UTF-8">
<title>Shows</title>
</head>
<body>
	<div style="margin: 0px auto; width: 1200px; text-align: center; padding-top: 100px;">
		<h1 class="h3 mb-3 font-weight-normal">
			<c:out value="${show.title}" />
		</h1>
		<p>
			<form:errors path="show.*" />
		</p>
		<form:form method="POST" action="/shows/${show.id}/edit" modelAttribute="show">
			<p>
				<form:label path="title">Title:</form:label>
				<form:input type="title" path="title" class="form-control" />
				<form:label path="network">Network:</form:label>
				<form:input type="network" path="network" class="form-control" />
			</p>
			<input type="submit" value="Update" class="btn btn-sm btn-primary " />
			<br>
			<br>
		</form:form>
		<form:form method="POST" action="/shows/${show.id}/delete">
			<input type="submit" value="Delete" class="btn btn-sm btn-primary " />
		</form:form>
		<a href="/shows">Back</a>
	</div>
</body>
</html>