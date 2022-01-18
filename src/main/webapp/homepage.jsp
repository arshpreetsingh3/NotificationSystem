<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.2/css/bootstrap.min.css"
	integrity="sha384-y3tfxAZXuh4HwSYylfB+J125MxIs6mR5FOHamPBG064zB+AFeWH94NdvaCBm8qnd"
	crossorigin="anonymous">

<title>Home Page</title>
</head>
<body>
	<!-- Button trigger modal -->
	<button type="button" class="btn btn-primary" data-toggle="modal"
		data-target="#exampleModalCenter">Generate Nortification</button>

	<!-- Modal -->
	<div class="modal fade" id="exampleModalCenter" tabindex="-1"
		role="dialog" aria-labelledby="exampleModalCenterTitle"
		aria-hidden="true">
		<div class="modal-dialog modal-dialog-centered" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLongTitle">Nortification</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<form action="notification" method="post">
					<div class="modal-body">
						<div class="input-group mb-3">
							<div class="input-group-prepend">
								<label class="input-group-text" for="inputGroupSelect01">Options</label>
							</div>
							<select class="custom-select" id="inputGroupSelect01"
								name="select">
								<option selected value="event">Event</option>
								<option value="holiday">Holiday</option>
								<option value="nagarroNews">NagarroNews</option>
								<option value="newPolicy">NewPolicy</option>
								<option value="urgentHelp">UrgentHelp</option>
							</select>
						</div>
						<div class="form-group">
							<label for="exampleInputPassword1">Subject</label> <input
								type="text" name="subject" class="form-control"
								id="exampleInputPassword1" placeholder="Enter Subject">
						</div>
						<div class="form-group">
							<label for="exampleFormControlTextarea1">Body</label>
							<textarea class="form-control" name="body"
								id="exampleFormControlTextarea1" rows="3"></textarea>
						</div>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-secondary"
							data-dismiss="modal">Close</button>
						<button type="submit" class="btn btn-primary">Send</button>
					</div>
				</form>
			</div>
		</div>
	</div>
	<a href="index.jsp" class="badge badge-info">Back To Login</a>



	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</body>
</html>