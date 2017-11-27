<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Home User</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">

 	<!-- Bootstrap Core CSS -->	
	<link rel="stylesheet" href="<c:url value="/resources/styles-system/util/css/bootstrap.min.css" />">


    <!-- MetisMenu CSS -->
    <link rel="stylesheet" href="<c:url value="/resources/styles-system/util/css/metisMenu.min.css" />">
    
    <!-- Custom CSS -->
    <link rel="stylesheet" href="<c:url value="/resources/styles-system/util/css/sb-admin-2.min.css" />">

    <!-- Custom Fonts -->
    <link rel="stylesheet" href="<c:url value="/resources/styles-system/util/font-awesome/css/font-awesome.min.css" />">


    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
	
	
	 
	 <!-- jQuery -->
    <script src="<c:url value="/resources/styles-system/util/js/jquery.min.js" />"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="<c:url value="/resources/styles-system/util/js/bootstrap.min.js" />"></script>

    <!-- Metis Menu Plugin JavaScript -->
       <script src="<c:url value="/resources/styles-system/util/js/metisMenu.min.js" />"></script>
       
    <!-- Custom Theme JavaScript -->
           <script src="<c:url value="/resources/styles-system/util/js/sb-admin-2.js" />"></script>
           
   <script type="text/javascript">
	history.forward();
	</script>
	

	
	
</head>
<body>
<div id="wrapper">

        <!-- Navigation -->
        <nav class="navbar navbar-inverse navbar-static-top" role="navigation" style="margin-bottom: 0">
            <div class="navbar-header" style="height:100px;">
            

            
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <!-- Colocar imagen de la aplicación -->
                
                <div class="navbar-brand">
                 <img class="img-responsive" style="width:70%; padding:10px;"
						src="<c:url value="/resources/img/ic_app.png"/>" />
                </div>
              
            </div>
            <!-- /.navbar-header -->

            <ul class="nav navbar-top-links navbar-right">
                <!--inicio-->
               
                <!-- /.dropdown -->
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                        <i class="fa fa-user fa-fw"></i> <i class="fa fa-caret-down"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-mesages">
                        <li><a href="#"><i class="fa fa-user fa-fw"></i> User Profile</a>
                        </li>
                        <li><a href="#"><i class="fa fa-gear fa-fw"></i> Settings</a>
                        </li>
                        <li class="divider"></li>
                        <li><a href='<c:url value="/logout" />'><i class="fa fa-sign-out fa-fw"></i> Logout</a>
                        </li>
                    </ul>
                    <!-- /.dropdown-user -->
                </li>
                <!-- /.dropdown -->
            </ul>
            <!-- /.navbar-top-links -->

            <div class="navbar-default sidebar" role="navigation"  style="margin-top:120px;">
                <div class="sidebar-nav navbar-collapse">
                    <ul class="nav" id="side-menu">
                        <li class="sidebar-search">
                            <!-- agregar imagen v: -->

                          <div align="center">
       
                           <img class="img-circle img-responsive"
						src="<c:url value="/resources/img/img_paciente.png"/>" />
                            <h4 >PACIENTE</h4>
                            </div>    
                          
                        </li>
                        <li>
                            <a href="#"><i class="fa fa-bar-chart fa-fw"></i> Crear Cita</a>
                        </li>
                      
                        <li>
                            <a href="#"><i class="fa fa-list fa-fw"></i> Listar Médicos</a>
                        </li>
                        <li>
                            <a href="#"><i class="fa fa-list fa-fw"></i> Listar Pacientes</a>
                        </li>

                    </ul>
                    <div align="center">
                    <h6 style="margin-top: 100px; margin-bottom: 20px;">Fecha Actual, Nov 7, 2017.</h6>


                    </div>
                </div>
                <!-- /.sidebar-collapse -->
            </div>
            <!-- /.navbar-static-side -->
        </nav>

        <!-- Page Content -->
        <div id="page-wrapper">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-12">
                        <h1 class="page-header">Crear Cita v:</h1>
                    </div>
                    <!-- /.col-lg-12 -->
                </div>
                <!-- /.row -->
            </div>
            <!-- /.container-fluid -->
        </div>
        <!-- /#page-wrapper -->

    </div>
    <!-- /#wrapper -->


</body>

</html>