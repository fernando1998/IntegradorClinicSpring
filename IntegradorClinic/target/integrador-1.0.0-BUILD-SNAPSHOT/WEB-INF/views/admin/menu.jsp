<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Spring MVC CRUD</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header imgapp">
				<img class="img_app" src="<c:url value="/resources/img/ic_app.png"/>" />
			</div>
			<ul class="nav navbar-nav">
			</ul>
			<ul class="nav navbar-nav navbar-right">
				 <li><a href='<c:url value="/logout" />'><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
			</ul>
		</div>
	</nav>






	<div class="container-fluid">
		<div class="row-fluid">
			<div class="col-md-6">
				<h4 class="text-center">Menu</h4>
				<hr>
				<table class="table table-bordered table-striped">
					<tbody>
						<tr>
							<td>
								<a href="<%=request.getContextPath()%>/admin/emp/list"
								class="btn btn-primary"> Manager Employees</a>
							</td>
							<td>
								<a href="<%=request.getContextPath()%>/admin/dpto/list"
								class="btn btn-primary"> Manager Departments</a>
							</td>
							<td>
								
								<a href='<c:url value="/logout" />' class="btn btn-primary">Logout </a>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
	</div>
	<h1>Menu del Admin</h1>
</body>

</html>