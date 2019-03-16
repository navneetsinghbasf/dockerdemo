<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>VehicleConfiguration</title>


<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/angular-material/1.0.4/angular-material.js"></script>
            
<script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.10.2/moment.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular-animate.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular-aria.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/jquery.min.js"></script>

<script src="js/show_details.js"></script>
<link rel="stylesheet" href="css/bootstrap.min.css">   
<link href="css/custom.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/angular-material/1.0.8/angular-material.css">

</head>
 <style>
   a {color: #000000;}
 </style>
<body style="background-color:#546e7a">
  	<div align="left" id="mySidenav" class="sidenav">    
	  <a href="/maps">LIVE Location</a>
	  <a href="" data-ng-click="geoFence()">Geo-Fence</a>
	  <a href="/history">Trip History</a>
	  <a href="/conf">Configure Vehicle</a>
	  <a href="/behavior">Driver Behavior</a> 	
  	</div>	
	<!-- Use any element to open the sidenav -->	
<br/><br/><br/>
<div class="main">
<div  style="padding: 02em;" ng-app="vehicleConf" ng-controller="configController">
<form name="configName">
<h2><b>Vehicle Configuration</b></h2>
<p >Please select the vehicle</p>
  <!-- div class="left-aligned" align="Left"-->  
  <select ng-change="showDetails1()" ng-model="configVehicle">
   <option value="" selected>--Select Vehicle-- </option>
  <option ng-repeat="vehicle in vehicleNames" value="{{vehicle.vehName}}" > {{vehicle.vehName}} </option> 
    </select> 
    <br/><br/>
     <a href="" ng-disabled="disablefldset" ng_model="addnew" ng-click="addNewDetails()">Create New</a>  
     <br/><br/>
     <a  href="" ng-disabled="disablefldset" ng-click="enableDetails()">Edit</a>  
     <br/><br/>
     <!-- <a href="" ng-disabled="disablefldset" ng-click="deleteDetails(configVehicle)">Reset</a>   -->
    
<br/>
<div ng-init="disablefldset=true">
<fieldset ng-disabled="disablefldset">
<table align="Center">
<tr>
<td>VehicleIdentificationNumber:</td>
<td>
<input type="text" ng_model="vehiname" ng-disabled="!addnew" id="nName" required />
</td>
</tr>
<tr>
<td>PrimaryIPAddress:</td>
<td><input type="text" name="priIpa" ng_model="pIpa"  ng-maxlength="50" id="pIPA" required /></td>
<td style="color:red" ng-show="configName.priIpa.$error.maxlength">Primary IP Address Max Length 50 is exceeded</td>
</tr>
<tr>
<td>SecondaryIPAddress:</td>
<td><input type="text" name="secIpa" ng_model="sIpa" ng-maxlength="50" id="sIPA" required /></td>
<td style="color:red" ng-show="configName.secIpa.$error.maxlength">Secondary IP Address Max Length 50 is exceeded</td>
</tr>
 <tr>
<td>APN:</td>
<td><input type="text" name="apnname" ng_model="apn" id="apn1" ng-maxlength="50" required /> </td>
<td style="color:red" ng-show="configName.apnname.$error.maxlength">APN Max Length 50 is exceeded</td>
</tr>
<tr>
<td>Sleep Time:</td>
<td><input type="number" name="slpet" ng_model="slp" id="slpt" min="0" max="3600" required /> </td>
<td style="color:red" ng-show="configName.slpet.$error.max">Sleep Time Range 0 to 3600 is exceeded</td>
<td style="color:red" ng-show="configName.slpet.$error.number">Please enter valid number between 0 to 3600</td>
</tr>
<tr>
<td>OverSpeed Limit:</td>
<td>
<input type="number" name="ovrspd" ng-model="ovrs" id="ovrsp" min="30" max="160"  ng-pattern="/^[0-9]+(\.[0-9]{1,2})?$/" step="0.01" required />
 </td>
 <td style="color:red" ng-show="configName.ovrspd.$error.max">OverSpeed Limit Range 30 to 160 is exceeded</td>
 <td style="color:red" ng-show="configName.ovrspd.$error.number">Please enter valid number between 30 to 160</td>
 <td style="color:red" ng-show="configName.ovrspd.$error.pattern">Please enter valid pattern between 30 to 160 with step 0.01</td>
</tr>
<tr>
<td>HarseBreakThreshold:</td>
<td><input type="number" name="harsbk" ng_model="harsb" id="harbr" min="0" max="100" ng-pattern="/^[0-9]+(\.[0-9]{1,2})?$/" step="0.01" required /> </td>
<td style="color:red" ng-show="configName.harsbk.$error.max">HarseBreakThreshold Limit Range 0 to 100 is exceeded</td>
<td style="color:red" ng-show="configName.harsbk.$error.number">Please enter valid number between 0 to 100</td>
<td style="color:red" ng-show="configName.harsbk.$error.pattern">Please enter valid pattern between 0 to 100 with step 0.01</td>
</tr>
<tr>
<td>HarseAccelerationThreshold:</td>
<td><input type="number" name="harst" ng_model="harsa" id="harat" min="0" max="100" ng-pattern="/^[0-9]+(\.[0-9]{1,2})?$/" step="0.01" required /> </td>
<td style="color:red" ng-show="configName.harst.$error.max">HarseAccThreshold Limit Range 0 to 100 is exceeded</td>
<td style="color:red" ng-show="configName.harst.$error.number">Please enter valid number between 0 to 100</td>
<td style="color:red" ng-show="configName.harst.$error.pattern">Please enter valid pattern between 0 to 100 with step 0.01</td>
</tr>
<tr>
<td>RashTurningThreshold:</td>
<td><input type="number" name="ratr" ng_model="rast" id="rastu" min="0" max="100" ng-pattern="/^[0-9]+(\.[0-9]{1,2})?$/" step="0.01" required /> </td>
<td style="color:red" ng-show="configName.ratr.$error.max">RashTurnThreshold Limit Range 0 to 100 is exceeded</td>
<td style="color:red" ng-show="configName.ratr.$error.number">Please enter valid number between 0 to 100</td>
<td style="color:red" ng-show="configName.ratr.$error.pattern">Please enter valid pattern between 0 to 100 with step 0.01</td>
</tr>
<tr>
<td>SMSCenterNumber:</td>
<td><input type="text" name="smscntr" ng_model="smsc" id="smsct" ng-maxlength="25" ng-pattern="/^[\+]?[(]?[0-9]{5}[)]?[-\s\.]?[0-9]{3}[-\s\.]?[0-9]{4,6}$/" required /> </td>
<td style="color:red" ng-show="configName.smscntr.$error.maxlength">SMS Center Number Max Length 25 is exceeded</td>
<td style="color:red" ng-show="configName.smscntr.$error.pattern">Please enter valid phone number in form of (91995)836-4169</td>
</tr>
<tr>
<td>VehicleRegistrationNumber:</td>
<td><input type="text" name="vehrg1" ng_model="vehrg" id="vehrgs" ng-maxlength="10" required /> </td>
<td style="color:red" ng-show="configName.vehrg1.$error.maxlength">Registration Number Max Length 10 is exceeded</td>
</tr>
<tr>
<td>FrequencyofDataTransmission:</td>
<td><input type="number" name="frqd" ng_model="frq" id="frqd" min="5" max="360" required/> </td>
<td style="color:red" ng-show="configName.frqd.$error.max">FrequencyofDataTransmission Limit Range 5 to 360 is exceeded</td>
<td style="color:red" ng-show="configName.frqd.$error.number">Please enter valid number between 5 to 360</td>
</tr>
<tr>
<td>TimeDurationForEmergencyState:</td>
<td><input type="number" name="tmedr" ng_model="tmed" id="tmdems" min="5" max="360" required /> </td>
<td style="color:red" ng-show="configName.tmedr.$error.max">TimeDurationForEmergencyState Limit Range 5 to 360 is exceeded</td>
<td style="color:red" ng-show="configName.tmedr.$error.number">Please enter valid number between 5 to 360</td>
</tr>
<tr>
<td>IMEI:</td>
<td><input type="text" name="imei" ng_model="imid" id="imis" ng-maxlength="15" required /> </td>
<td style="color:red" ng-show="configName.imei.$error.maxlength">IMEI Max Length 15 is exceeded</td>
</tr>
<tr>
<td>Alert Enable/Disable:</td>
<td>
<input type="number" name="stAlrt" ng_model="setAlrt" id="alrtid" min="0" max="255" step="1" required />
<!-- select ng_model="setAlrt" id="alrtid" required  >
<option value="alrt1">Enable</option>
<option value="alrt2">Disable</option></select-->  </td>
<td style="color:red" ng-show="configName.stAlrt.$error.max">Alert Range 0 to 255 is exceeded</td>
<td style="color:red" ng-show="configName.stAlrt.$error.number">Please enter valid number between 0 to 255</td>
</tr>
</table>
</fieldset>
</div>
<br></br>

<table>
<tr>

<td><input type="submit" value="Set"  ng-click="saveConfDetails()" ></td>
<td></td>
<td><input type="submit" value="Reset"   ng-click="deleteDetails(configVehicle)" ></td>
</tr>
</table>
<table align="Center" >
<tr></tr>
<tr></tr>
<tr>
<td></td>
<td></td>
<td><font face="verdana" color="blue" size="2">   
 <b> {{message}}  </b>    
 </font>
 </td>
 </tr> 
</table>

</form>
</div>
</div>
</body>
</html>