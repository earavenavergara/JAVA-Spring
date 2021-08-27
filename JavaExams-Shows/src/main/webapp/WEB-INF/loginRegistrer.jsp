<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Shows</title>
</head>
<body>
	<div style="margin: 0px auto; width: 1200px; text-align: center; padding-top: 100px;">
		<p>
			<form:errors path="user.*" />
		</p>
		<p>
			<c:out value="${error}" />
		</p>
		<form:form method="POST" action="/registration" modelAttribute="user" style="    width: 500px; text-align: left;   margin-right:600px;  display: inline-block; vertical-align: top;
	">
			<h1 class="h3 mb-3 font-weight-normal">Register</h1>
			<p>
				<form:label path="name" placeholder="Name">Name:</form:label>
				<form:input type="name" path="name" class="form-control" />
			</p>
			<p>
				<form:label path="email" placeholder="Email">Email:</form:label>
				<form:input type="email" path="email" class="form-control" />
			</p>
			<p>
				<form:label path="password" placeholder="Password">Password:</form:label>
				<form:password path="password" class="form-control" />
			</p>
			<p>
				<form:label path="passwordConfirmation" placeholder="Password Confirmation">Password Confirmation:</form:label>
				<form:password path="passwordConfirmation" class="form-control" />
			</p>
			<input type="submit" value="Register" class="btn btn-lg btn-primary btn-block" />
		</form:form>
		<p>
			<c:out value="${errorMessage}" />
		</p>
		<form method="post" action="/login" style="width: 500px; text-align: left; margin-left: 600px; margin-top: -450px; display: inline-block; vertical-align: top;">
			<h1 class="h3 mb-3 font-weight-normal">Login</h1>
			<p>
				<label for="email">Email:</label>
				<input type="text" id="email" class="form-control" name="email" />
			</p>
			<p>
				<label for="password">Password:</label>
				<input type="password" id="password" class="form-control" name="password" />
			</p>
			<input type="submit" class="btn btn-lg btn-primary btn-block" value="Login!" />
		</form>
	</div>
</body>
</html>