<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
	<div style="margin: 0px auto; width: 1200px; text-align: center; padding-top: 100px; text-align: left;">
		<h1>
			<c:out value="${show.title}" />
		</h1>
		<h2 class="h3 mb-3 font-weight-normal">
			Network:
			<c:out value="${show.network}" />
		</h2>
		<h1>Users who rated this show</h1>
		<table class="table table-striped ">
			<thead class="thead-dark">
				<tr>
					<th>Name</th>
					<th>Rating</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${show.users}" var="u">
					<tr>
						<td><c:out value="${u.name}" /></td>
						<td><c:out value="${u.rating}" /></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<a href="/shows/${show.id}/edit" class="btn btn-outline-primary">Edit</a>
		<form:form action="/shows/${show.id}/rating" modelAttribute="user">
		Leave a Rating: <form:select path="rating">
				<form:option value="1" label="1" />
				<form:option value="2" label="2" />
				<form:option value="3" label="3" />
				<form:option value="4" label="4" />
				<form:option value="5" label="5" />
			</form:select>
			<input type="submit" value="Rate!" class="form-control btn btn-outline-primary" />
		</form:form>
		<a href="/shows">Back</a>
	</div>
</body>
</html>