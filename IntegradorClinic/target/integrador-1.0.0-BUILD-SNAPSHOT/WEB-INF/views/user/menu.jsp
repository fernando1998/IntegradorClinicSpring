<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Home User</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	
<link rel="stylesheet" href="<c:url value="/resources/css/style-home-user.css"/>" />	
</head>
<body>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header imgapp">
    	<img class="img_app" src="<c:url value="/resources/img/ic_app.png"/>"/>
    </div>
    <ul class="nav navbar-nav">
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href='<c:url value="/logout" />'><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
    </ul>
  </div>
</nav>

<div class="container-fluid">
  <div class="row content">
    <div class="col-sm-3 sidenav">
      <h4 class="uss">${usuario}</h4>
      
      <div class="container text-center">  
  
  <div class="row">

    <div class="col-sm-3 well">

      <div class="well">
        <p><a href="#">My Profile</a></p>
        <img src="<c:url value="/resources/img/ic_user.png"/>" class="img-circle" height="65" width="65" alt="Avatar">
      </div>

	</div>
</div>

</div>
      <ul class="nav nav-pills nav-stacked">
        <li><a href="#section1">My Profile</a></li>
        <li><a href="#section2">Citas</a></li>
        <li><a href="#section3">#</a></li>

      </ul><br>
      
    </div>

    <div class="col-sm-9">
      <h4><small>CREAR NUEVAS CITAS</small></h4>
      <hr>
      <h2>${usuario}</h2>
      
      <h5><span class="glyphicon glyphicon-time"></span> Fecha Actual, Nov 7, 2017.</h5>
      <br>

	  <button class="btn btn-success"><span class="glyphicon glyphicon-plus"></span> Nueva Cita </button>
      <br><br>
      
      <h4><small>VIZUALIZAR CITAS CREADAS</small></h4>
      <hr>
      <h2>Tabla de citas</h2>
      
      <table class="table "></table>
      <hr>
            <div class="col-xs-10">
              
              <br>
            </div>
          </div>
        </div>
      </div>
    </div>
 


</body>

</html>