<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.*"%>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.2/css/bootstrap.min.css"
	integrity="sha384-y3tfxAZXuh4HwSYylfB+J125MxIs6mR5FOHamPBG064zB+AFeWH94NdvaCBm8qnd"
	crossorigin="anonymous">

<title>Subscription</title>
</head>
<body>

	<form action="eventSubscribe" method="post">
		<button type="submit" class="btn btn-primary">Event</button>
		<input type="text" class="btn btn-outline-dark" id="eventButton"
			name="event" value=${event} >
	</form>
	<form action="holidaySubscribe" method="post">
		<button type="submit" class="btn btn-primary">Holiday</button>
		<input type="text" class="btn btn-outline-dark" id="holidayButton"
			name="holiday" value=${holiday}>
	</form>
	<form action="newsSubscribe" method="post">
		<button type="submit" class="btn btn-primary">Nagarro News</button>
		<input type="text" class="btn btn-outline-dark" id="newsButton"
			name="news" value=${nagarroNews}>
	</form>
	<form action="newPolicySubscribe" method="post">
		<button type="submit" class="btn btn-primary">New Policy</button>
		<input type="text" class="btn btn-outline-dark" id="policyButton"
			name="newPolicy" value=${newPolicy}>
	</form>
	<form action="urgentHelpSubscribe" method="post">
		<button type="submit" class="btn btn-primary">Urgent Help</button>
		<input type="text" class="btn btn-outline-dark" id="helpButton"
			name="urgentHelp" value=${urgentHelp}>
	</form>
	
	<a href="employeeHomepage.jsp" class="badge badge-info">Back</a>

	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>