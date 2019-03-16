package org.tcs.mm.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tcs.mm.repo.VehicleRepository;
import org.tcs.mm.service.VehicleService;
import org.tcs.mm.vo.VehicleVO;

@Service
public class VehicleServiceImpl implements VehicleService {

	@Autowired
	private VehicleRepository vehicleRepo;
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public VehicleVO fetchVehicleCurrentLocation(String vehicleNumber) {
		logger.info("Fetching the current location for the vehicle number"+ vehicleNumber);
		VehicleVO findVehicleByVehicleNumber = vehicleRepo.findVehicleByVehicleNumber(vehicleNumber);
		logger.info("Current location for the vehicle number"+ vehicleNumber+ " is"+ findVehicleByVehicleNumber);
		return findVehicleByVehicleNumber;
	}
	
	public List<VehicleVO> getAllVehicles(){
		logger.info("Getting the list of vehicles ");
		return vehicleRepo.findAll();
	}
}
