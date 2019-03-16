
        var app = angular.module('MyApp', [])
        app.controller('MyController', function ($scope) {
            $scope.Markers = [
            {
                "title": 'Aksa Beach',
                "lat": '19.1759668',
                "lng": '72.79504659999998',
                "description": 'Aksa Beach is a popular beach and a vacation spot in Aksa village at Malad, Mumbai.'
            },
            {
                "title": 'Juhu Beach',
                "lat": '19.0883595',
                "lng": '72.82652380000002',
                "description": 'Juhu Beach is one of favorite tourist attractions situated in Mumbai.'
            },
            {
                "title": 'Girgaum Beach',
                "lat": '18.9542149',
                "lng": '72.81203529999993',
                "description": 'Girgaum Beach commonly known as just Chaupati is one of the most famous public beaches in Mumbai.'
            },
            {
                "title": 'Jijamata Udyan',
                "lat": '18.979006',
                "lng": '72.83388300000001',
                "description": 'Jijamata Udyan is situated near Byculla station is famous as Mumbai (Bombay) Zoo.'
            },
            {
                "title": 'Sanjay Gandhi National Park',
                "lat": '19.2147067',
                "lng": '72.91062020000004',
                "description": 'Sanjay Gandhi National Park is a large protected area in the northern part of Mumbai city.'
            }];
 
            //Setting the Map options.
            $scope.MapOptions = {
                center: new google.maps.LatLng($scope.Markers[0].lat, $scope.Markers[0].lng),
                zoom: 8,
                mapTypeId: google.maps.MapTypeId.ROADMAP
            };
 
            //Initializing the InfoWindow, Map and LatLngBounds objects.
            $scope.InfoWindow = new google.maps.InfoWindow();
            $scope.Latlngbounds = new google.maps.LatLngBounds();
            $scope.Map = new google.maps.Map(document.getElementById("dvMap"), $scope.MapOptions);
 
            //Looping through the Array and adding Markers.
            for (var i = 0; i < $scope.Markers.length; i++) {
                var data = $scope.Markers[i];
                var myLatlng = new google.maps.LatLng(data.lat, data.lng);
 
                //Initializing the Marker object.
                var marker = new google.maps.Marker({
                    position: myLatlng,
                    map: $scope.Map,
                    title: data.title
                });
 
                //Adding InfoWindow to the Marker.
                (function (marker, data) {
                    google.maps.event.addListener(marker, "click", function (e) {
                        $scope.InfoWindow.setContent("<div style = 'width:200px;min-height:40px'>" + data.description + "</div>");
                        $scope.InfoWindow.open($scope.Map, marker);
                    });
                })(marker, data);
 
                //Plotting the Marker on the Map.
                $scope.Latlngbounds.extend(marker.position);
            }
 
            //Adjusting the Map for best display.
            $scope.Map.setCenter($scope.Latlngbounds.getCenter());
            $scope.Map.fitBounds($scope.Latlngbounds);
        });
        
       