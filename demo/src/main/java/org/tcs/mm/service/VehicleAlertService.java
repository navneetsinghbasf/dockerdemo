package org.tcs.mm.service;

import org.tcs.mm.vo.VehicleAlertsVO;

public interface VehicleAlertService {
	public VehicleAlertsVO fetchVehicleAlerts(String vehicleNumber);
}
