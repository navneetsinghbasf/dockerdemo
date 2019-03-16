/**
 * 
 */

/*var app = angular.module('behaviorApp', ["ng-fusioncharts"]);*/
var app = angular.module('behaviorApp', ["ng-fusioncharts"]);
//app.controller('behaviorController', function($scope) {
	app.controller('behaviorController', function($scope, $http) {
    //$scope.vehicleNumbers = ["AP16AK4834", "Tobias", "Linus"];
    $scope.idleTimeDataSource = {};
    $scope.overSpeedEventsDataSource = {};
    $scope.fuelConsumedDataSource = {};
    $scope.ignitionOnOffDataSource = {};
    
    	$http.get("/vehicles")
	  	.then(function(result) {
		  $scope.vehicleNumbers = result.data;
	  	}); 


    $scope.getDeatils = function(){
    	var vehicleNumber = $scope.vehicleNumber;
    	$scope.myValue=true;
    	$scope.generateIdleTime(vehicleNumber);
    	$scope.generateOverSpeed(vehicleNumber);
    	$scope.generateFuelConsumed(vehicleNumber);
    	$scope.generateIgnitionOnOff(vehicleNumber);
    }


	$scope.generateIdleTime = function(vehicleNumber) {
		$http.get('/vehicles/'+vehicleNumber+'/behaviors/idle').
	       then(function(response) {
	       	if(response.status == 200){
	       		$scope.idleTimeDataSource = {
	   			  "chart": {
	     			 "caption": "Idle Hours",
	  	      		 "rotatelabels": "1",
	  	      		 "setadaptiveymin": "1",
	  	      		 "theme": "gammel"
	  	      		},
	  	      		  "data": response.data
	  	      		};
	        	} else {
	        		 $scope.idleTimeDataSource = {};
	        	}
	       });
	}


	$scope.generateOverSpeed = function(vehicleNumber) {
		$http.get('/vehicles/'+vehicleNumber+'/behaviors/overspeed').
	       then(function(response) {
	       	if(response.status == 200){
	       		$scope.overSpeedEventsDataSource = {
	   			  "chart": {
	     			 "caption": "Over Speed Events",
	  	      		 "rotatelabels": "1",
	  	      		 "setadaptiveymin": "1",
	  	      		 "theme": "gammel"
	  	      		},
	  	      		  "data": response.data
	  	      		};
	        	} else {
	        		 $scope.overSpeedEventsDataSource = {};
	        	}
	       });
	}

	$scope.generateFuelConsumed = function(vehicleNumber) {
		$http.get('/vehicles/'+vehicleNumber+'/behaviors/fuel').
	       then(function(response) {
	       	if(response.status == 200){
	       		$scope.fuelConsumedDataSource = {
	   			  "chart": {
	     			 "caption": "Fuel (In Liters)",
	  	      		 "rotatelabels": "1",
	  	      		 "setadaptiveymin": "1",
	  	      		 "theme": "gammel"
	  	      		},
	  	      		  "data": response.data
	  	      		};
	        	} else {
	        		 $scope.fuelConsumedDataSource = {};
	        	}
	       });
	}

	$scope.generateIgnitionOnOff = function(vehicleNumber) {
		$http.get('/vehicles/'+vehicleNumber+'/behaviors/ignition').
	       then(function(response) {
	       	if(response.status == 200){
	       		$scope.ignitionOnOffDataSource = {
	   			  "chart": {
	     			 "caption": "Ignition ON/OFF",
	  	      		 "rotatelabels": "1",
	  	      		 "setadaptiveymin": "1",
	  	      		 "theme": "gammel"
	  	      		},
	  	      		  "data": response.data
	  	      		};
	        	} else {
	        		 $scope.ignitionOnOffDataSource = {};
	        	}
	       });
	}


	}
); 