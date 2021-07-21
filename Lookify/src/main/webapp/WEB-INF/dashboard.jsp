<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lookify!</title>
</head>
<body>
	<a href="/songs/new">Add New</a>
	<a href="/search/topTen">Top Songs</a>
	<form action="/search" method="POST">
		<input type="search" name="artist" /> <input type="submit"
			value="Search Artists" />
	</form>
	<table>
		<thead>
			<tr>
				<th>Name</th>
				<th>Rating</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${songs}" var="song">
				<tr>
					<td><a href="/songs/${song.id}"><c:out
								value="${song.titulo}" /></a></td>
					<td><c:out value="${song.clasificacion}" /></td>
					<td><a href="/songs/${song.id}/delete">Delete</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>