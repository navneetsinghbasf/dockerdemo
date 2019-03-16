package org.tcs.mm.service;

import java.util.List;

import org.tcs.mm.vo.VehicleVO;

public interface VehicleService {

	public VehicleVO fetchVehicleCurrentLocation(String vehicleNumber);
	
	public List<VehicleVO> getAllVehicles();
}
