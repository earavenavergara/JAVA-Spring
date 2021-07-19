<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>You hace visited http://localhost:8080/ <c:out value="${count}"/> times.</h1>
<a href="http://localhost:8080/">Test another visit?</a>
</body>
</html>