<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulario</title>
</head>
<body>
	<form action="/result" method="GET">
		<p>
			Your Name: <input type="text" name="name">
		</p>
		<p>
			Dojo Location: <select id="location" name="location">
				<option value="san jose">san jose</option>
				<option value="santiago">santiago</option>
			</select>
		</p>
		<p>
			Favorite Language: <select id="language" name="language">
				<option value="java">java</option>
				<option value="python">python</option>
				<option value="C">C</option>
			</select>
		</p>
		<p>Comment (optional)</p>
		<textarea name="comment"></textarea>
		<p>
			<input type="submit" value="Button">
		</p>
	</form>
</body>
</html>