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
	<p>
		Top Ten Songs: <a href="/dashboard">Dashboard</a>
	</p>
	<table>
		<tbody>
			<c:forEach items="${songs}" var="song">
				<tr>
					<td><c:out value="${song.clasificacion}" /></td>
					<td><a href="/songs/${song.id}"><c:out
								value="${song.titulo}" /></a></td>
					<td><c:out value="${song.artista}" /></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>