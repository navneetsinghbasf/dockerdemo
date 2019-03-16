package org.tcs.mm.service;
import org.tcs.mm.vo.VehConfig;


public interface VehConfigService {
	
	public  VehConfig retrieveVehicle(String name);  
	
	
	 public void saveVehicle(VehConfig vehicle);
	 
	 public void deleteVehicle(Long vehicle);
	 
	 public void updateVehicle(VehConfig vehicle);

}
