<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">

<title>Send Email</title>
</head>
<body>
	<!-- Button trigger modal -->
	<button type="button" class="btn btn-primary" data-toggle="modal"
		data-target="#exampleModalCenter">Email</button>

	<!-- Modal -->
	<div class="modal fade" id="exampleModalCenter" tabindex="-1"
		role="dialog" aria-labelledby="exampleModalCenterTitle"
		aria-hidden="true">
		<div class="modal-dialog modal-dialog-centered" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLongTitle">Email</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">

					<form action="email" method="post">
						<div class="form-group">
							<label for="exampleInputEmail1">To</label> <input type="email"
								name="to" class="form-control" id="exampleInputEmail1"
								aria-describedby="emailHelp" placeholder="Enter email">
							<input type="checkbox" class="form-check-input"
								id="exampleCheck1" name="allcheck"> <label
								class="form-check-label" for="exampleCheck1">All</label>

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
						<div class="modal-footer">
							<button type="button" class="btn btn-secondary"
								data-dismiss="modal">Close</button>
							<button type="submit" class="btn btn-primary">Submit</button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>

	<!-- Button trigger modal -->
	<button type="button" class="btn btn-primary" data-toggle="modal"
		data-target="#exampleModal">SMS</button>

	<!-- Modal -->
	<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
		<div class="modal-dialog modal-dialog-centered" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLongTitle">SMS</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<form action="sms" method="post">

					<div class="modal-body">

						<div class="input-group mb-3">
							<input type="text" class="form-control" placeholder="SMS"
								name="body" aria-label="Username"
								aria-describedby="basic-addon1">
						</div>

						<div class="modal-footer">
							<button type="button" class="btn btn-secondary"
								data-dismiss="modal">Close</button>
							<button type="submit" class="btn btn-primary">Send</button>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
	
	<button type="button" class="btn btn-primary" data-toggle="modal"
		data-target="#exampleModalLong">Employee Online Portal</button>

	<!-- Modal -->
	<div class="modal fade" id="exampleModalLong" tabindex="-1"
		role="dialog" aria-labelledby="exampleModalLongTitle"
		aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLongTitle">Employee
						Online Portal</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<form action="online" method="post">
					<div class="modal-body">
						<div class="input-group mb-3">
							<input type="text" class="form-control" placeholder="Body"
								name="body" aria-label="Username"
								aria-describedby="basic-addon1">
						</div>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-secondary"
							data-dismiss="modal">Close</button>
						<button type="submit" class="btn btn-primary">Save</button>
					</div>
				</form>
			</div>
		</div>
	</div>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>