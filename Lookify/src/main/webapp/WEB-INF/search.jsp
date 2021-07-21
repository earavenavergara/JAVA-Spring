<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	Songs by artist:
	<c:out value="${artist}" />
	<a href="/dashboard">Dashboard</a>
	<form action="/search" method="post">
		<input type="search" name="artist" placeholder="${artist}" /> <input
			type="submit" value="New Search" />
	</form>
	<table>
		<thead>
			<tr>
				<th>Name</th>
				<th>Rating</th>
				<th>Actions</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${songs}" var="song">
				<tr>
					<td><a href="/songs/${song.id}"><c:out
								value="${song.titulo}" /></a></td>
					<td><c:out value="${song.artista}" /></td>
					<td><a href="/delete/${song.id}">Delete</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>