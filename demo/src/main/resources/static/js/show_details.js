var app = angular.module('vehicleConf', ['ngMaterial'])
        app.controller('configController', function($scope,$http) {          
          $scope.vehicleNames= [];         
          $scope.message ="      ";
        	  
        	  $http.get("http://localhost:8080/findall")
        	  .then(function(result) {
                $scope.vehicleNames = result.data;
               });   
        	  
  
           $scope.showDetails1 = function() {
        	    vehKey = $scope.configVehicle;
        	    $scope.disablefldset = true; 
        	    $scope.message ="      ";
        	    if(vehKey=="")
        	    {
        	       $scope.pIpa = "";
     	           $scope.sIpa = "";
     	           $scope.apn = "";
     	           $scope.slp = "";
     	           $scope.ovrs = "";
     	           $scope.harsb = "";
     	           $scope.harsa = "";
     	           $scope.rast = "";
     	           $scope.smsc = "";
     	           $scope.vehrg = "";
     	           $scope.frq = "";
     	           $scope.tmed = "";
     	           $scope.imid = "";
     	           $scope.setAlrt = ""; 
     	           $scope.vehiname = "";
        	    }
        	    else
        	    {
        	        $http.get("http://localhost:8080/findbyvehName?vehName="+vehKey)
        	        .success(function(response)
        	          {
        	        	console.log(response);  
        	        	$scope.vehiname = response.vehName;
        	        	$scope.pIpa = response.pIpaddr;
        	        	$scope.sIpa = response.sIpaddr;          	        	
        	        	$scope.apn  = response.apn;   
        	        	$scope.slp  = response.sleepTime;
        	            $scope.ovrs = response.overSpeedLimit;
          	            $scope.harsb = response.harseBrkThreshold;
          	            $scope.harsa = response.harseAccThreshold;
          	            $scope.rast = response.rashTurnThreshold;
          	            $scope.smsc = response.smsCenterNumber;
          	            $scope.vehrg = response.vehRegNumber;
          	            $scope.frq = response.frqDataTrans;
          	            $scope.tmed = response.tmeDuration;
          	            $scope.imid = response.imei;
        	        	$scope.setAlrt = response.alert;
        	        	
        	          }	        	      
        	        )
        	        .error(function(response)
        	          {
        	        	console.log(response);
        	        	$scope.message = vehKey+ " Not Found in Database";
        	        	//alert(vehKey+ " not found in database");
        	        	$scope.vehArr = {};
        	          }
        	        );
        	    }
        	  }
           
           $scope.saveConfDetails = function() {        	   
        	   $scope.message ="      ";
        	   
        	   var data = {
        			 vehName : $scope.vehiname, 
        			 pIpaddr : $scope.pIpa,
        			 sIpaddr : $scope.sIpa, 
        			 apn : $scope.apn, 
        			 sleepTime : $scope.slp,
        			 overSpeedLimit : $scope.ovrs,
        			 harseBrkThreshold : $scope.harsb,
        			 harseAccThreshold : $scope.harsa,
        			 rashTurnThreshold : $scope.rast,
        			 smsCenterNumber : $scope.smsc,
        			 vehRegNumber : $scope.vehrg,
        			 frqDataTrans : $scope.frq,
        			 tmeDuration : $scope.tmed,
        			 imei : $scope.imid,
        			 alert : $scope.setAlrt        			       	        	 
        			   };
        	   if($scope.vehiname=="" || $scope.pIpa=="" || $scope.pIpa==undefined || $scope.sIpa=="" || $scope.sIpa==undefined || $scope.apn=="" ||
        		   $scope.apn== undefined ||  $scope.smsc=="" || $scope.smsc== undefined || $scope.vehrg=="" || $scope.vehrg== undefined || 
        					   $scope.imid=="" || $scope.imid==undefined )
               {
        		   $scope.message = "Please Enter All Details";
        		   if($scope.addnew == true)
        			 {
        			   $scope.pIpa = "";
         	           $scope.sIpa = "";
         	           $scope.apn = "";
         	           $scope.slp = "";
         	           $scope.ovrs = "";
         	           $scope.harsb = "";
         	           $scope.harsa = "";
         	           $scope.rast = "";
         	           $scope.smsc = "";
         	           $scope.vehrg = "";
         	           $scope.frq = "";
         	           $scope.tmed = "";
         	           $scope.imid = "";
         	           $scope.setAlrt = ""; 
         	           $scope.vehiname = "";
        			 }
        		   else
        			 {
        			   $scope.vehiname=vehName;
        			   $scope.pIpa = pIpaddr;
        			   $scope.sIpa = sIpaddr;
        			   $scope.apn = apn;
        			   $scope.slp = sleepTime;
        			   $scope.ovrs = overSpeedLimit;
        			   $scope.harsb = harseBrkThreshold;	
        			   $scope.harsa = harseAccThreshold;
        			   $scope.rast = rashTurnThreshold;
        			   $scope.smsc = smsCenterNumber;
        			   $scope.vehrg = vehRegNumber;
        			   $scope.frq = frqDataTrans;
        			   $scope.tmed = tmeDuration;
        			   $scope.imid = imei;
        			   $scope.setAlrt = alert;    	               
        			 }
                   //alert("Please Enter Details");	
               }
        	   else if($scope.vehiname==undefined || $scope.vehiname=="")
        	   {
        		  // alert("Please Select Vehicle");	
        		   $scope.message = "Please Select Vehicle";
        		   $scope.pIpa = "";
     	           $scope.sIpa = "";
     	           $scope.apn = "";
     	           $scope.slp = "";
     	           $scope.ovrs = "";
     	           $scope.harsb = "";
     	           $scope.harsa = "";
     	           $scope.rast = "";
     	           $scope.smsc = "";
     	           $scope.vehrg = "";
     	           $scope.frq = "";
     	           $scope.tmed = "";
     	           $scope.imid = "";
     	           $scope.setAlrt = ""; 
        	   }
        	   else if($scope.addnew == true)
        		 {   
        		   $scope.message ="      ";
        		   $scope.disablefldset = true;
        		   $http.get("http://localhost:8080/findbyvehName?vehName="+$scope.vehiname)
        		   .success(function(response)
        	          {
        	        	console.log(response);          	        	
        	        	if(response.vehName==null)
        	        	  {
        	        		$http.post("http://localhost:8080/newConfig",JSON.stringify(data)).
         	                then(function(response) {         	                	
         	            	   if(response.status == 201)
         	            	    {
         	            	     // alert($scope.vehiname+ " details saved successfully ");
         	            	      $scope.message = $scope.vehiname+ " Details Saved Successfully ";
         	            	      $scope.vehicleNames= [];
         	              	  
         	              	      $http.get("http://localhost:8080/findall")
         	              	     .then(function(result) {
         	                      $scope.vehicleNames = result.data;
         	                     });
         	              	     $scope.configVehicle =$scope.vehiname;
         	            	     
         	            		}
         	            	   else
         	            		{
         	            		  $scope.message = response.status+ " Details Not Saved error";
         	               	    // alert(response.status+ " details not saved error");
         	            		}
         	                 });
        	        	  }
        	        	else
        	        	  {
        	        		//alert($scope.vehiname+" is already present");
        	        		$scope.message = $scope.vehiname+" is Already Present";
        	        		$scope.vehiname = "";
        	        		$scope.pIpa = "";
              	            $scope.sIpa = "";
              	            $scope.apn = "";
              	            $scope.slp = "";
              	            $scope.ovrs = "";
              	            $scope.harsb = "";
              	            $scope.harsa = "";
              	            $scope.rast = "";
              	            $scope.smsc = "";
              	            $scope.vehrg = "";
              	            $scope.frq = "";
              	            $scope.tmed = "";
              	            $scope.imid = "";
              	            $scope.setAlrt = "";  
        	        	  }
        	        	
        	          }	        	      
        	        )
        	        .error(function(response)
        	           {
        	        	 console.log(response);
        	        	 $scope.vehArr = {};        	        	 
        	           }
        	         );        		    
        		 }
        	   else
        		 {
        		   $scope.message ="";
        		   $scope.disablefldset = true;
        		   $http.put("http://localhost:8080/saveConfig",JSON.stringify(data)).
                   then(function(response) {
                	   if(response.status == 200)
                	    {
                		   $scope.message = $scope.vehiname+ " Details Saved Successfully ";
                	      //alert($scope.vehiname+ " details saved successfully ");
                		}
                	   else
                		{
                		   $scope.message = response.status+ " Details Not Saved Error";
                   	    // alert(response.status+ " details not saved error");
                		}
                     });
        		 }
           }
           
           $scope.enableDetails = function()
           {        	  
        	   $scope.disablefldset = false;     
        	   $scope.addnew = false;
        	   $scope.message ="      ";
        	   if($scope.vehiname==undefined || $scope.vehiname=="")
        		{
        		   $scope.message = "Please Select Vehicle";
        		   $scope.disablefldset = true;
       		   //alert("Please Select Vehicle");	
        		}
           }
           
           $scope.addNewDetails = function()
           {        	  
        	   $scope.vehiname = "";
        	   $scope.pIpa = "";
 	           $scope.sIpa = "";
 	           $scope.apn = "";
 	           $scope.slp = "";
 	           $scope.ovrs = "";
 	           $scope.harsb = "";
 	           $scope.harsa = "";
 	           $scope.rast = "";
 	           $scope.smsc = "";
 	           $scope.vehrg = "";
 	           $scope.frq = "";
 	           $scope.tmed = "";
 	           $scope.imid = "";
 	           $scope.setAlrt = "";  
 	           $scope.configVehicle = "";
        	   $scope.disablefldset = false;  
        	   $scope.addnew = true;        	   
        	     
        	  
               var data = {
  					   pIpaddr : $scope.pIpa,
  					   sIpaddr : $scope.sIpa,
  					   apn : $scope.apn,
  					   sleepTime : $scope.slp,
  					   overSpeedLimit : $scope.ovrs,
  					   harseBrkThreshold : $scope.harsb,
  					   harseAccThreshold : $scope.harsa,
  					   rashTurnThreshold : $scope.rast,
  					   smsCenterNumber : $scope.smsc,
  					   vehRegNumber : $scope.vehrg,
  					   frqDataTrans : $scope.frq,
  					   tmeDuration : $scope.tmed,
  					   imei : $scope.imid,
  					   alert : $scope.setAlrt,  
	       	           vehNme : $scope.vehiname
	        			   };
                 $scope.message ="Please Enter New Details";
	           // alert("Please Enter New Details");	        
	           
           }
           $scope.deleteDetails = function(vehName)
           {      	  
         	   $scope.addnew = false;
         	   $scope.message ="      ";
         	   if(vehName=="")
         		{
         		   $scope.message = "Please Select Vehicle";
        		   //alert("Please Select Vehicle");	
         		}
        	   $http.delete("http://localhost:8080/deleteConfig?vehName="+vehName).
        	   then(function(response) {
            	   if(response.status == 200)
            	    {
            	     // alert(vehName+ " deleted successfully ");
            	      $scope.message = vehName+ " Deleted Successfully ";
            	      $scope.vehiname = "";
            	      $scope.pIpa = "";
        	          $scope.sIpa = "";
        	          $scope.apn = "";
        	          $scope.slp = "";
        	          $scope.ovrs = "";
        	          $scope.harsb = "";
        	          $scope.harsa = "";
        	          $scope.rast = "";
        	          $scope.smsc = "";
        	          $scope.vehrg = "";
        	          $scope.frq = "";
        	          $scope.tmed = "";
        	          $scope.imid = "";
        	          $scope.setAlrt = "";  
       	              $scope.configVehicle = "";
            	      $http.get("http://localhost:8080/findall")
	              	     .then(function(result) {
	                      $scope.vehicleNames = result.data;
	                     });
            		}
            	   else
            		{
            		   $scope.message = vehName+ " Not Deleted";
               	    // alert(vehName+ " not deleted");
            		}
                 });
           }
           
        	});