package org.tcs.mm.controller;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tcs.mm.service.BehaviorService;
import org.tcs.mm.vo.BehaviorDetailsResponseVO;


/** 
 * version : 1.0
 * This class loads the Driver Behavior Controller
 *  
 *  
 *  
 **/


@RestController
@RequestMapping("/vehicles/{vehicleNumber}/behaviors")
public class BehaviorController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private BehaviorService behaveService;

	@GetMapping("/{event}")
	public ResponseEntity<Object> getBehaviorDetails(@PathVariable String vehicleNumber, @PathVariable String event) {
		logger.info("Fetching the details for the vehicle number"+vehicleNumber+" for event"+event);
		List<BehaviorDetailsResponseVO> fetchBehaviorDetails = behaveService.fetchBehaviorDetails(vehicleNumber, event);;
		if(null != fetchBehaviorDetails  && fetchBehaviorDetails.size() > 0){
			return ResponseEntity.status(HttpStatus.OK).body(fetchBehaviorDetails);
		} else {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
	}
}
