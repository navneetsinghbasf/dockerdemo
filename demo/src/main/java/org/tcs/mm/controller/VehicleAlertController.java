package org.tcs.mm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.tcs.mm.service.VehicleAlertService;
import org.tcs.mm.vo.VehicleAlertsVO;



/** 
 * version : 1.0
 * This class loads Vehicle Alert Controller
 *  
 *  
 *  
 **/
@RestController
public class VehicleAlertController {
	
	@Autowired
	VehicleAlertService alertService;
	
	@RequestMapping("/alerts/{vehicle_id}")
	@ResponseBody
	public VehicleAlertsVO getVehicleAlertDetails(@PathVariable String vehicle_id) {
		VehicleAlertsVO fetchVehicleAlerts = alertService.fetchVehicleAlerts(vehicle_id);
		return fetchVehicleAlerts;
	}

}
