<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">

<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<title>Index</title>
</head>
<body>
	<div class="container-fluid">
		<div style="display: flex; flex-wrap: wrap;">
			<div style="flex: 1 0 30%;">
				<h2>1.</h2>
				<table class="table table-hover table-bordered">
					<tr>
						<th>Country name</th>
						<th>Country language</th>
						<th>Language percentage</th>
					</tr>
					<c:forEach var="country" items="${uncountries}">
						<tr>
							<td>${country[0].name}</td>
							<td>${country[1].language}</td>
							<td>${country[1].percentage}</td>
						</tr>
					</c:forEach>
				</table>
			</div>
			<div
				style="flex: 1 0 30%;">
				<h2>2.</h2>
				<div class="table-wrapper-scroll-y my-custom-scrollbar" style= "height: 272px; overflow-y: auto;">
				<table class="table table-hover table-bordered">
						<tr >
							<th>Country name</th>
							<th>Country language</th>
						</tr>
					<tbody>
						<c:forEach var="country" items="${doscountries}">
							<tr>
								<td>${country[0]}</td>
								<td>${country[1]}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				</div>
			</div>
			<div
				style="flex: 1 0 30%;">
				<h2>3.</h2>
				<div class="table-wrapper-scroll-y my-custom-scrollbar" style= "height: 272px; overflow-y: auto;">
				<table class="table table-hover table-bordered">
						<tr >
							<th>City name</th>
							<th>City population</th>
						</tr>
					<tbody>
						<c:forEach var="country" items="${trescountries}">
							<tr>
								<td>${country[0]}</td>
								<td>${country[1]}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				</div>
			</div>
			<div
				style="flex: 1 0 30%;">
				<h2>4.</h2>
				<div class="table-wrapper-scroll-y my-custom-scrollbar" style= "height: 272px; overflow-y: auto;">
				<table class="table table-hover table-bordered">
						<tr >
							<th>Country name</th>
							<th>Language</th>
							<th>Language percentage</th>
						</tr>
					<tbody>
						<c:forEach var="country" items="${cuatrocountries}">
							<tr>
								<td>${country[0].name}</td>
								<td>${country[1].language}</td>
								<td>${country[1].percentage}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				</div>
			</div>
			<div
				style="flex: 1 0 30%;">
				<h2>5.</h2>
				<div class="table-wrapper-scroll-y my-custom-scrollbar" style= "height: 272px; overflow-y: auto;">
				<table class="table table-hover table-bordered">
						<tr >
							<th>Country name</th>
							<th>Surface area</th>
							<th>Population</th>
						</tr>
					<tbody>
						<c:forEach var="country" items="${cincocountries}">
							<tr>
								<td>${country[0]}</td>
								<td>${country[1]}</td>
								<td>${country[2]}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				</div>
			</div>
			<div
				style="flex: 1 0 30%;">
				<h2>6.</h2>
				<div class="table-wrapper-scroll-y my-custom-scrollbar" style= "height: 272px; overflow-y: auto;">
				<table class="table table-hover table-bordered">
						<tr >
							<th>Country name</th>
						</tr>
					<tbody>
						<c:forEach var="country" items="${seiscountries}">
							<tr>
								<td>${country}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				</div>
			</div>
			<div
				style="flex: 1 0 30%;">
				<h2>7.</h2>
				<div class="table-wrapper-scroll-y my-custom-scrollbar" style= "height: 272px; overflow-y: auto;">
				<table class="table table-hover table-bordered">
						<tr >
							<th>Country name</th>
							<th>City name</th>
							<th>City district</th>
							<th>City population</th>
						</tr>
					<tbody>
						<c:forEach var="country" items="${sietecountries}">
							<tr>
								<td>${country[0]}</td>
								<td>${country[1]}</td>
								<td>${country[2]}</td>
								<td>${country[3]}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				</div>
			</div>
			<div
				style="flex: 1 0 30%;">
				<h2>8.</h2>
				<div class="table-wrapper-scroll-y my-custom-scrollbar" style= "height: 272px; overflow-y: auto;">
				<table class="table table-hover table-bordered">
						<tr >
							<th>Region name</th>
							<th>Countries</th>
						</tr>
					<tbody>
						<c:forEach var="country" items="${ochocountries}">
							<tr>
								<td>${country[0]}</td>
								<td>${country[1]}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				</div>
			</div>
		</div>
	</div>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
		integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
		integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
		crossorigin="anonymous"></script>
</body>
</html>