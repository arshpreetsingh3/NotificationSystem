<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.*"%>
<%@ page import="com.nagarro.notification.entity.Notification"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.2/css/bootstrap.min.css"
	integrity="sha384-y3tfxAZXuh4HwSYylfB+J125MxIs6mR5FOHamPBG064zB+AFeWH94NdvaCBm8qnd"
	crossorigin="anonymous">

<title>Employee Portal</title>
<style>
#back {
	position: relative;
	left: 80%;
}
</style>
</head>
<body class="container">
	<h1>Employee Portal</h1>
	<a href="employeeHomepage.jsp" class="badge badge-info" id="back">Back
		To Homepage</a>
	<table>
		<c:forEach items="${notifications}" var="notification">
			<tr>
				<td>
					<form action="deleteNotification" method="post">
						<div class="card text-white bg-info mb-3"
							style="max-width: 40rem;">
							<div class="card-header" style="background-color: gray">${notification.getType()}
							</div>
							<div class="card-body">
								<input type="hidden" id="currentId" name="currentId" value=${notification.getId()}>
								<h5 class="card-title">${notification.getSubject()}</h5>
								<p class="card-text">${notification.getBody()}</p>
								<button type="submit" class="btn btn-danger">Clear
									Notification</button>
							</div>
						</div>
					</form>
				</td>
			</tr>

		</c:forEach>
	</table>

	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>