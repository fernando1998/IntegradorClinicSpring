<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Clinic Cloud Login</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<link rel="stylesheet" href="<c:url value="/resources/css/bodyImgResponsive.css" />">
</head>
<body class="img-responsive">

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

				<li><a href='<c:url value="/user_register" />'><span
						class="glyphicon glyphicon-edit"></span> Sign Up</a></li>
			</ul>
		</div>
	</nav>

	<div class="col-sm-4"></div>

	<div
		style="background-color: rgba(52, 73, 94, 0.4); border-radius: 6px;"
		class="container col-md-4">
		<div align="center">
			<img style="width: 100px; height: 100px;" id="img.app"
				class="img-responsive"
				src="<c:url value="/resources/img/img_user.png"/>" />
		</div>
		<div>
			<div class="container-fluid" align="center">
				<div class="row-fluid">

					<form method='post' action="j_spring_security_check">
					<input type="hidden"  name="${_csrf.parameterName}"   value="${_csrf.token}"/>
						<div align="center" class="form-group col-md-12"
							style="backgroud-color: #3c3d3d;">
							<div align="center"
								class="form-group floating-label-form-group controls">
								<label style="color:#fff;">Username</label>

								<div class="input-group">
									<span class="input-group-addon"><i
										class="glyphicon glyphicon-user"></i></span> 
										
										<input type="text"
										class="form-control" placeholder="Nombre de usuario"
										name="username">
								</div>


								<p class="help-block text-danger"></p>

							</div>
						</div>
						<br>
				</div>
				<div class="form-group col-md-12">
					<div class="form-group floating-label-form-group controls">
					
						<label style="color:#fff;">Contraseña</label> 
						
						<div class="input-group">
   						 <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
    					<input type="password"class="form-control" placeholder="Contraseña" name="password">
						<p class="help-block text-danger"></p>
  						</div>
						<div style="margin: 7px;"></div>
						<button type="submit" class="btn btn-sm btn-success">Ingresar</button>
						<div style="margin: 5px;"></div>
						<div class="alert alert-danger alert-dismissable">
							<button type="button" class="close" data-dismiss="alert">&times;</button>
							<strong>${message}</strong>
							<c:if test="${param.error eq '1' }">
   								<font color="red">Login / Password incorrect</font>
   							</c:if> 
							
						</div>
					</div>
				</div>


				</form>

			</div>
		</div>
	</div>
	<div class="col-sm-4"></div>

	<div class="col-sm-12">
		<footer class="container-fluid text-center" style="background-color: rgba(52, 73, 94,0.2);
      color: white;
      padding: 20px;
      margin-top:60px;">
			<p style="font-size:18px;">Proyecto Integrador 2017</p>
		</footer>
	</div>
</body>
</html>