<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<!-- Website Font style -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.1/css/font-awesome.min.css">


<!-- Google Fonts -->
<link href='https://fonts.googleapis.com/css?family=Passion+One'
	rel='stylesheet' type='text/css'>
<link href='https://fonts.googleapis.com/css?family=Oxygen'
	rel='stylesheet' type='text/css'>
	
<link href="<c:url value="/resources/css/bootstrap-select.css" />"
	rel='stylesheet' type='text/css'>
<script src="<c:url value="/resources/js/bootstrap-select.js" />"></script>	


<title>Register USER</title>
</head>
<body>

<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<div align="center" class="visible-xs" style="padding:10px">
					<img class="img-responsive" style="width:75%"
						src="<c:url value="resources/img/ic_app.png"/>" />
				</div>
				<div class="hidden-xs" style="padding:10px">
					<img class="img-responsive" style="width:75%"
						src="<c:url value="resources/img/ic_app.png"/>" />
				</div>
			</div>
			<ul class="nav navbar-nav navbar-right">

				<li><a href='<c:url value="login" />'><span
						class="glyphicon glyphicon-remove"></span> Cancel</a></li>
			</ul>
		</div>
	</nav>





	<div class="container-fluid row">
		<div class="row main">
			<div class="panel-heading">
				<div class="panel-title text-center">
					<h1 class="title">Register USER</h1>
					<hr />
				</div>
			</div>
			<div class="main-login main-center container">
				<form class="form-horizontal" method='post'>

					<div class="form-group row" style="margin: 12px;">
						<label for="username" class="cols-sm-2 control-label">Username</label>
						<div class="cols-sm-10">
							<div class="input-group">
								<span class="input-group-addon"><i class="fa fa-users fa"
									aria-hidden="true"></i></span>
									
									 <input type="text" class="form-control"
									name="username" placeholder="Enter your Username" />
							</div>
						</div>
					</div>

					<div class="form-group row" style="margin: 12px;">
						<label for="password" class="cols-sm-2 control-label">Password</label>
						<div class="cols-sm-10">
							<div class="input-group">
								<span class="input-group-addon"><i
									class="fa fa-lock fa-lg" aria-hidden="true"></i></span>
									
									 <input
									type="password" class="form-control" name="password"
									 placeholder="Enter your Password" />
							</div>
						</div>
					</div>

					<div class="form-group row" style="margin: 12px;">
						<label for="email" class="cols-sm-2 control-label">Type:</label>
						<div class="cols-sm-10">

							<select class="selectpicker" multiple data-max-options="1" name="type">	
								<optgroup label="Type">
									<option>Paciente</option>
									<option>Medico</option>
								</optgroup>
							</select>

						</div>
					</div>

					<div class="form-group row" style="margin: 12px;">
						<button type="submit"
							class="btn btn-primary btn-lg btn-block login-button">Register</button>
						<div class="alert alert-danger alert-dismissable">
							<button type="button" class="close" data-dismiss="alert">&times;</button>
							<strong>${message}</strong>
						</div>

					</div>
				</form>
			</div>
		</div>
	</div>



</body>
</html>