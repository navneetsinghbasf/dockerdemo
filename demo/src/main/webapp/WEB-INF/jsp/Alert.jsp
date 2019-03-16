<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<script src="js/jquery.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.js"></script>
<script src="js/script.js"></script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<div class="alert-header">
  <h3>Alerts</h3>
</div>
</head>
<body onload="load();">
<div class="target" ng-app="map-example" ng-controller="MapController" data-ng-init="init()" >
  
  <p ng-style="speed">Location Update</p>
  <p ng-style="arealimit">Location Update(history)</p>
  <p ng-style="Disconnectfrommainbattery(BD)">Disconnect from Main Battery(BD)</p>
  <p ng-style="Lowbattery(BL)">Low battery(BL)</p>
  <p ng-style="Lowbatteryremoved">Low Battery Removed</p>
  <p ng-style="Connectbacktomainbattery">Connect back to main battery</p>
  <p ng-style="IgnitionON">Ignition ON(IN)</p>
  <p ng-style="IgnitionOFF">Ignition OFF(IF)</p>
  <p ng-style="GPSboxopened">GPS Box opened</p>
  <p ng-style="EmergencystateON">Emergency State ON</p>
  <p ng-style="EmergencystateOFF">Emergency State OFF</p>
  <p ng-style="HarshBraking">Harsh Braking</p>
  <p ng-style="HarshAcceleration">Harsh Acceleration</p>
  <p ng-style="RashTurning">Rash Turning</p>
  <p ng-style="DeviceTempered">Device Tempered</p>
  <p ng-style="TowAwayAlert">Tow Away Alert</p>
</div>
<!-- <div>{{normalMessage}}</div> -->
</body>
</html>	