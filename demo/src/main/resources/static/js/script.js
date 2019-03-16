var myapp = angular.module('map-example', ['ngDialog']);
myapp.controller('MapController', function($scope, $rootScope, $compile, $window,$http,ngDialog) {
	
	$http.get("/vehicles")
	  .then(function(result) {
      $scope.vehicles = result.data;
     }); 
	
	/** 
     * 
     * This is Live Location function
     *  
     *  
     *  
     **/
    function initialize() {

    	if($scope.centrelatitude == null || $scope.centrelatitude == undefined){
    		$scope.map = new google.maps.Map(document.getElementById('map'), {
    		zoom: 10,
    		center: { lat: 21.0000, lng: 78.0000 }
    		});
    	}else{
    		$scope.map = new google.maps.Map(document.getElementById('map'), {
    		zoom: 10,
    		center: { lat: $scope.centrelatitude*1, lng: $scope.centrelongitude*1 }
    		});
    	}


        var image = 'http://maps.google.com/mapfiles/kml/pal2/icon39.png';
        $scope.cities = [
            { title: 'KA1MG1892', lat: $scope.latitude, lng: $scope.longitude },
            /*{ title: 'Mysore', lat: 12.2958, lng: 76.6394 }*/
        ];


        $scope.infowindow = new google.maps.InfoWindow({
            content: ''
        });



        for (var i = 0; i < $scope.cities.length; i++) {


            var marker = new google.maps.Marker({
                position: new google.maps.LatLng($scope.cities[i].lat, $scope.cities[i].lng),
                map: $scope.map,
                title: $scope.cities[i].title,
                icon: image
            });



            var content = '<a ng-click="cityDetail(' + i + ')" class="btn info">View details</a>';
            var compiledContent = $compile(content)($scope)

            google.maps.event.addListener(marker, 'click', (function(marker, content, scope) {
                return function() {
                    scope.infowindow.setContent(content);
                    scope.infowindow.open(scope.map, marker);
                };
            })(marker, compiledContent[0], $scope));

        }

    }

    $scope.cityDetail = function(index) {
        alert(JSON.stringify($scope.cities[index]));
    }

    google.maps.event.addDomListener(window, 'load', initialize);

    //setting live location
    /** 
     * 
     * This is Live Location setting function
     *  
     *  
     *  
     **/
    $scope.setLocation = function() {

        $http.get('/vehicles/' + $scope.vehicle).
        then(function(response) {
            $scope.results = response.data;
            $scope.latitude=$scope.results.currentLatitue;
            $scope.longitude=$scope.results.currentLongitude;
            $scope.centrelatitude=$scope.results.currentLatitue.substring(0,5);
            $scope.centrelongitude=$scope.results.currentLongitude.substring(0,5);
            initialize();

        },function (failure) { console.log("failed :", failure); });



    }

    //Geo-Fence
    
    /** 
     * 
     * This is Geo-Fence function
     *  
     *  
     *  
     **/

    $scope.geoFence = function(){
        $scope.map = new google.maps.Map(document.getElementById('map'), {
            zoom: 10,
            center: { lat: 12.93, lng: 77.59 }
        });



        $scope.cities = [
            { title: 'KA1MG1892', lat: $scope.latitude, lng: $scope.longitude },
            /*{ title: 'Mysore', lat: 12.2958, lng: 76.6394 }*/
        ];


        $scope.infowindow = new google.maps.InfoWindow({
            content: ''
        });



        for (var i = 0; i < $scope.cities.length; i++) {
            var latLng = new google.maps.LatLng($scope.cities[i].lat, $scope.cities[i].lng);

            var marker = new google.maps.Marker({
                position: new google.maps.LatLng($scope.cities[i].lat, $scope.cities[i].lng),
                map: $scope.map,
                title: $scope.cities[i].title
            });

            var circle = new google.maps.Circle({
                  map: $scope.map,
                  radius: 16093,    // 10 miles in metres
                  fillColor: '#ffff00',
                  fillOpacity: 0.2,
                  strokeWeight: 3,
                  clickable: false,
                  draggable : false,
                  editable: false,
                  zIndex: 1
                });
                circle.bindTo('center', marker, 'position');

            var content = '<a ng-click="cityDetail(' + i + ')" class="btn info"> View Details </a>';
            var compiledContent = $compile(content)($scope)

            google.maps.event.addListener(marker, 'click', (function(marker, content, scope) {
                return function() {
                    scope.infowindow.setContent(content);
                    scope.infowindow.open(scope.map, marker);
                };
            })(marker, compiledContent[0], $scope));



        }



    }
    
    /** 
     * 
     * This is Vehicle Alert function
     *  
     *  
     *  
     **/
    
     $scope.clickToOpen = function () {
        	
        	var fuel;var speed;var arealimit;var seatbelt;var parkBreak;var crash;var disconnectfrommainbattery;var ignitionON;var ignitionOFF;var gpsboxopened;
        	var emergencystateON;var emergencystateOFF;var harshbraking; var harshacceleration; var rashturning; var devicetempered; var towAwayAlert;
        	$http.get('http://localhost:8080/alerts/' + $scope.vehicle).
            then(function(response) {
            	$scope.results = response.data;
            	
            	
            	 $scope.fuel = $scope.results.lowFuel;
            	 $scope.speed = $scope.results.speedLimit;
            	 $scope.arealimit = $scope.results.areaLimit;
            	 $scope.seatbelt = $scope.results.seatBelt;
            	 $scope.parkBreak = $scope.results.parkingBreak;
            	 $scope.crash = $scope.results.crashDetection;
            	 $scope.disconnectfrommainbattery = $scope.results.disconnectfrommainbattery;
            	 $scope.ignitionON = $scope.results.ignitionON;
            	 $scope.ignitionOFF = $scope.results.ignitionOFF;
            	 $scope.gpsboxopened = $scope.results.gpsboxopened;
            	 $scope.emergencystateON = $scope.results.emergencystateON;
            	 $scope.emergencystateOFF = $scope.results.emergencystateOFF; 
            	 $scope.harshbraking = $scope.results.harshbraking;
            	 $scope.harshacceleration = $scope.results.harshacceleration;
            	 $scope.rashturning = $scope.results.rashturning;DeviceTempered
            	 $scope.devicetempered = $scope.results.devicetempered;
            	 $scope.towAwayAlert = $scope.results.towAwayAlert;
            	
            	//initialize();
            	
            });
        	
        	//$scope.normalMessage = "This is simple ng Dialog"
        	ngDialog.open({ 
            	template: '/alert',
                className: 'ngdialog-theme-default',
                scope: $scope,
            		});
        };
        
        $scope.OpenPopupWindow = function () {
            $window.open("/alert", "popup", "width=300,height=200,left=10,top=150,overflow:auto");
        }
        
        function tt($scope)
        {
            $scope.test = function()
            {
                console.log("AaA");
            }
        }
        
        //Alerts
        $scope.init = function () {
        	
        	if ($scope.fuel == "1") {
        		$scope.fuel = {"background-color" : "red"};
            } 
        	if ($scope.speed == "1") {
        		$scope.speed = {"background-color" : "red"};
            } 
        	if ($scope.arealimit == "1") {
        		$scope.arealimit = {"background-color" : "red"};
            } 
        	if ($scope.seatbelt == "1") {
        		$scope.seatbelt = {"background-color" : "red"};
            } 
        	if ($scope.parkBreak == "1") {
        		$scope.parkBreak = {"background-color" : "red"};
            } 
        	if ($scope.crash == "1") {
        		$scope.crash = {"background-color" : "red"};
            } 
        	if ($scope.disconnectfrommainbattery == "1") {
        		$scope.disconnectfrommainbattery = {"background-color" : "red"};
            }
        	if ($scope.ignitionON == "1") {
        		$scope.ignitionON = {"background-color" : "red"};
            }
        	if ($scope.ignitionOFF == "1") {
        		$scope.ignitionOFF = {"background-color" : "red"};
            }
        	if ($scope.gpsboxopened == "1") {
        		$scope.gpsboxopened = {"background-color" : "red"};
            }
        	if ($scope.emergencystateON == "1") {
        		$scope.emergencystateON = {"background-color" : "red"};
            }
        	if ($scope.emergencystateOFF == "1") {
        		$scope.emergencystateOFF = {"background-color" : "red"};
            }
        	if ($scope.harshbraking == "1") {
        		$scope.harshbraking = {"background-color" : "red"};
            }
        	if ($scope.harshacceleration == "1") {
        		$scope.harshacceleration = {"background-color" : "red"};
            }
        	if ($scope.rashturning == "1") {
        		$scope.rashturning = {"background-color" : "red"};
            }

        	if ($scope.devicetempered == "1") {
        		$scope.devicetempered = {"background-color" : "red"};
            }

        	if ($scope.towAwayAlert == "1") {
        		$scope.towAwayAlert = {"background-color" : "red"};
            }
        	};
        	
        

    });

/** 
 * 
 * This is Trip history function
 *  
 *  
 *  
 **/

myapp.controller('historyController', function($scope,$compile, $http) {
	
	
	$http.get("/vehicles")
	  .then(function(result) {
    $scope.vehicles = result.data;
   });

$scope.initMap = function() {
	
	$http.get('/vehicles/' + $scope.vehicle).
    then(function(response) {
        $scope.results = response.data;
        $scope.latitude=$scope.results.currentLatitue;
        $scope.longitude=$scope.results.currentLongitude;

    },function (failure) { console.log("failed :", failure); });
	
    var directionsService = new google.maps.DirectionsService;
    var directionsService2 = new google.maps.DirectionsService;
    var directionsDisplay = new google.maps.DirectionsRenderer;
    var directionsDisplay2 = new google.maps.DirectionsRenderer;
    var start = new google.maps.LatLng(12.9275, 77.6810);
    var end = new google.maps.LatLng(12.9906, 77.7277);

    var waypts=[];
    var wayptArray = [
        new google.maps.LatLng(12.9302, 77.6843),
        new google.maps.LatLng(12.9334, 77.6914),
        new google.maps.LatLng(12.9420, 77.6940),
        new google.maps.LatLng(12.9569, 77.7008),
      ];
    /*for (var i = 0; i < wayptArray.length; i++) {
          waypts.push({
            location: wayptArray[i],
            stopover: false
          });

      }*/
    $scope.map = new google.maps.Map(document.getElementById('historymap'), {
      zoom: 4,
      center: {lat: 12.95, lng: 77.69}
    });
    directionsDisplay.setMap($scope.map);
    directionsDisplay2.setMap($scope.map);

    var request = {
        origin: start,
        destination: end,
        waypoints: waypts,
        travelMode: google.maps.DirectionsTravelMode.DRIVING
      };
   directionsService.route(request, function (response, status) {
      if (status == google.maps.DirectionsStatus.OK) {
        directionsDisplay.setDirections(response);
      }
    });


    /*Request two*/
   var request2 = {
           origin: new google.maps.LatLng(12.9610, 77.6387),
           destination: new google.maps.LatLng(12.9690, 77.7209),
           waypoints: waypts,
           travelMode: google.maps.DirectionsTravelMode.DRIVING
         };
      directionsService2.route(request2, function (response, status) {
         if (status == google.maps.DirectionsStatus.OK) {
           directionsDisplay2.setDirections(response);
         }
       });
};




     //google.maps.event.addDomListener(window, 'load', $scope.initMap());
});