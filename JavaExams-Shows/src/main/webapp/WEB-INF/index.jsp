<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
	<div style="margin: 0px auto; width: 1200px; text-align: center; padding-top: 100px;">
		<a href="/logout" class="btn btn-sm btn-primary" style="margin-left: 1000px;">Logout</a>
		<h1>
			Welcome,
			<c:out value="${user.name}" />
		</h1>
		<h1 class="h3 mb-3 font-weight-normal" style="margin-left: -1000px;">TV Shows:</h1>
		<table class="table table-striped ">
			<thead class="thead-dark">
				<tr>
					<th scope="col">Shows</th>
					<th scope="col">Network</th>
					<th scope="col">Avg Rating</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${shows}" var="show">
					<tr scope="row">
						<td><a href="/shows/${show.id}"><c:out value="${show.title}" /></a></td>
						<td><c:out value="${show.network}" /></td>
						<td><c:out value="${show.avg}" /></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<a href="/shows/new" class="btn btn-lg btn-primary">Add a show</a>
	</div>
</body>
</html>