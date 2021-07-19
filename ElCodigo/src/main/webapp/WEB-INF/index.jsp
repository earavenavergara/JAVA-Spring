<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Secret Code</title>
</head>
<body>
	<div id="container">
		<div style="color: red">
			<c:out value="${error}" />
		</div>
		<form method="POST" action="/code">
			<p>What is the code</p>
			<input type="text" name="code"><br> <br> <input
				type="submit" value="Try Code">
		</form>
	</div>
</body>
</html>