package org.tcs.mm.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.tcs.mm.vo.BehaviorDeatilsVO;
import org.tcs.mm.vo.BehaviorDetailsResponseVO;



/** 
 * version : 1.0
 * This class loads BehaviorDetails Response 
 *  
 *  
 *  
 **/
@Repository
public interface BehaviorDetailsRepository extends JpaRepository<BehaviorDeatilsVO, Long> {

	@Query("select new org.tcs.mm.vo.BehaviorDetailsResponseVO(behave.eventDate, behave.eventCount) from VehicleVO vehicle, BehaviorDeatilsVO behave where behave.vehicleDetails.vehicleId = vehicle.vehicleId and vehicle.vehicleNumber = :vechicleNumber and behave.eventType = :eventType order by behave.eventDate asc")
	public List<BehaviorDetailsResponseVO> findByVehicleNumberAndEvent(@Param("vechicleNumber") String vechicleNumber,
			@Param("eventType") String eventType);
}