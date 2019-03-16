package org.tcs.mm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/** 
 * version : 1.0
 * This class loads all the pages
 *  
 *  
 *  
 **/

@Controller
public class LoadPageController {

	@RequestMapping("/welcome")
	public String welcome() {
		return "Welcome";
	}

	@RequestMapping("/maps")
	public String showMap() {
		return "Maps";
	}

	@RequestMapping("/alert")
	public String showAlert() {
		return "Alert";
	}

	@RequestMapping("/behavior")
	public String getHomePage() {
		String view = "behavior";
		return view;
	}

	@RequestMapping("/conf")
	public String getConfigPage() {
		String view = "config";
		return view;
	}
	
	@RequestMapping("/history")
	public String getVehicleHistory() {
		String view = "history";
		return view;
	}

}
