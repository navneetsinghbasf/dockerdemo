package org.tcs.mm.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tcs.mm.repo.VehicleAlertRepository;
import org.tcs.mm.service.VehicleAlertService;
import org.tcs.mm.vo.VehicleAlertsVO;

@Service
public class VehicleAlertServiceImpl implements VehicleAlertService {
	
	@Autowired
	private VehicleAlertRepository alertRepo;
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public VehicleAlertsVO fetchVehicleAlerts(String vehicleNumber) {
		logger.info("Fetching the alerts for the vehicle number"+ vehicleNumber);
		VehicleAlertsVO findVehicleAlertByVehicleNumber = alertRepo.find(vehicleNumber);
		logger.info("The alerts for the vehicle number"+ vehicleNumber+ " is"+ findVehicleAlertByVehicleNumber);
		return findVehicleAlertByVehicleNumber;
	}

}
