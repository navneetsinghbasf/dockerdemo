package org.tcs.mm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tcs.mm.service.VehConfigService;
import org.tcs.mm.vo.VehConfig;



/** 
 * version : 1.0
 * This class loads Vehicle Configuration Controller
 *  
 *  
 *  
 **/

@RestController
@RequestMapping("/config")
public class VehicleRestController {
	
	

@Autowired
private VehConfigService vehConfigService;
 
 public void setvehicleService(VehConfigService vehConfigService) {
	  this.vehConfigService = vehConfigService;
	 }

 
 @GetMapping("/{vehicle}")
 public VehConfig getVehicle(@PathVariable String vehName) {
	  VehConfig vehicle = vehConfigService.retrieveVehicle(vehName);

	  return vehicle;
 }
 
 	


}


