package org.tcs.mm.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tcs.mm.vo.VehicleVO;

@Repository
public interface VehicleRepository extends JpaRepository<VehicleVO, Long> {
	public VehicleVO findVehicleByVehicleNumber(String vehicleNumber);
}