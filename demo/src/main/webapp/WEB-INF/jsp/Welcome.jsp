<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- <html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<a>CHITTI 2.0</a>
</body>
</html> -->

<html>
<script src="http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>
    <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js"></script>
    <script src="http://cdnjs.cloudflare.com/ajax/libs/jQuery.mmenu/5.3.4/js/jquery.mmenu.min.all.min.js"></script>


<script>
var app = angular.module('plunker', []);

app.directive('mmenu', function() {
	return {
		restrict : 'A',
		link : function(scope, element, attrs) {
            $(element).mmenu({slidingSubmenus: false});
		}
	};
});

</script>

<head>
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
    <link rel="stylesheet" href="http://cdnjs.cloudflare.com/ajax/libs/jQuery.mmenu/5.3.4/css/jquery.mmenu.all.min.css">
    <link href="css/custom.css" rel="stylesheet" type="text/css">
</head>
<body>
<!-- <div id="mySidenav" class="sidenav">
	  <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
	  <a href="/maps">LIVE Location</a>
	  <a href="#">Geo-Fence</a>
	  <a href="#">Trip History</a>
	  <a href="#">Configure Vehicle</a>
	  <a href="#">Driver Behavior</a>
	</div>
	
		Use any element to open the sidenav
	<span span style="font-size:30px;cursor:pointer" onclick="openNav()">&#9776;Menu</span> -->
	
	<div>
        <nav class="navbar navbar-default">
          <div class="container-fluid">
            <div class="navbar-header">
              <a class="navbar-brand" href="#menu"><b><span class="glyphicon glyphicon-menu-hamburger" aria-hidden="true"></span></b></a>
              <a class="navbar-brand" href="#">EXAMPLE</a>
            </div>
          </div>
        </nav>
  
        <div class="container">
          <div class="jumbotron">
            <h1>Side Menu Example</h1>
            <p>
              <a class="btn btn-lg btn-primary" href="http://mmenu.frebsite.nl/" target="_blank" role="button">mmenu homepage</a>
            </p>
          </div>
        </div>
      </div>
    
      <!-- Side Menu -->
      <nav id="menu" mmenu>
         <ul>
            <li><a href="/">Home</a></li>
            <li><a href="/about">About us</a>
               <ul>
                  <li><a href="/about/history">History</a></li>
                  <li><a href="/about/team">The team</a></li>
                  <li><a href="/about/address">Our address</a></li>
               </ul>
            </li>
            <li><a href="/about">About us 2</a>
               <ul>
                  <li><a href="/about/history">History</a></li>
                  <li><a href="/about/team">The team</a></li>
                  <li><a href="/about/address">Our address</a></li>
               </ul>
            </li>
            <li><a href="/contact">Contact</a></li>
         </ul>
      </nav>




</body>
</html>