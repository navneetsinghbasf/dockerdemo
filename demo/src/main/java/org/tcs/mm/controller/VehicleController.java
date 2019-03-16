package org.tcs.mm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tcs.mm.service.VehicleService;
import org.tcs.mm.vo.VehicleVO;



/** 
 * version : 1.0
 * This class loads Vehicle Controller
 *  
 *  
 *  
 **/

@RestController
@RequestMapping("/vehicles")
public class VehicleController {
	
	@Autowired
	private VehicleService service;
	
	
	@GetMapping("{vehicle_id}")
	public VehicleVO getVehicleDetails(@PathVariable String vehicle_id) {
		VehicleVO fetchVehicleCurrentLocation = service.fetchVehicleCurrentLocation(vehicle_id);
		return fetchVehicleCurrentLocation;
	}
	
	@GetMapping
	public List<VehicleVO> getAllVehicles() {
		List<VehicleVO> vehicleDetails = service.getAllVehicles();
		return vehicleDetails;
	}
	
	
}
