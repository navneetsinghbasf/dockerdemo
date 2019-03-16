package org.tcs.mm.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tcs.mm.repo.VehicleConfigRepository;
import org.tcs.mm.service.VehConfigService;
import org.tcs.mm.vo.VehConfig;

@Service
public class VehicleInterImpl implements VehConfigService
{
	@Autowired
	 private VehicleConfigRepository vehicRepository;


	public VehConfig retrieveVehicle(String vehName)
	{
	  VehConfig vehicle = vehicRepository.findByvehName(vehName);
	  return vehicle;
	}
	 
	 
	 
	 public void saveVehicle(VehConfig vehicle)
	 {
		 
	 }
	 
	 public void deleteVehicle(Long vehicle)
	 {
		 
	 }
	 
	 public void updateVehicle(VehConfig vehicle)
	 {
		 
	 }
}
