<!DOCTYPE html>
<html>
	
	<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/ng-dialog/1.4.0/js/ngDialog.min.js"></script>
	<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDtwLGMk2mRH8pFkhJrRtJ0lTyT0PokK4Q"></script>
	<script src="js/script.js"></script>
  <head>
    <link href="css/custom.css" rel="stylesheet" type="text/css">
 	<style>
 	#historymap {
 	padding:20px;
    height:520px;
    width:700px;
	}	
 	
 	</style>
    <title>Driver History</title>    
  
  </head>
  <body>
  <div align="left" id="mySidenav" class="sidenav">	  
	  <a href="/maps">LIVE Location</a>
	  <a href="" data-ng-click="geoFence()">Geo-Fence</a>
	  <a href="/history">Trip History</a>
	  <a href="/conf">Configure Vehicle</a>
	  <a href="/behavior">Driver Behavior</a>
	</div>
	<!-- Use any element to open the sidenav -->
	<div class="main">
  <div  style="padding: 02em; border: solid; border-radius: 0.2em;" ng-app="map-example" ng-controller="historyController">
  	<p>Please select the vehicle</p>
	    <select align="left" name="cars"  ng-change="initMap()" ng-model="vehicle" >
	    <option value="" selected disabled hidden>Choose here</option>
	    <option ng-repeat="vehicle in vehicles" value="{{vehicle.vehicleNumber}}">{{vehicle.vehicleNumber}}</option>
  		</select>
  		<br/><br/><br/><br/>
    <div style="padding: 10em; border: solid; border-radius: 1.8em;" id="historymap" disabled="true"></div>
  </div>
   </div>
  </body>
</html>