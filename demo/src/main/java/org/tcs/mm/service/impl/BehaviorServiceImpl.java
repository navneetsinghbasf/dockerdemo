package org.tcs.mm.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tcs.mm.repo.BehaviorDetailsRepository;
import org.tcs.mm.service.BehaviorService;
import org.tcs.mm.vo.BehaviorDetailsResponseVO;

@Service
public class BehaviorServiceImpl implements BehaviorService {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private BehaviorDetailsRepository behaviorRepo;

	@Override
	public List<BehaviorDetailsResponseVO> fetchBehaviorDetails(String vehicleNumber, String event) {
		// TODO Auto-generated method stub
		logger.info("Fetching the details for the vehicle number"+vehicleNumber);
		List<BehaviorDetailsResponseVO> behaviorDeatils = behaviorRepo.findByVehicleNumberAndEvent(vehicleNumber, event);
		return behaviorDeatils;
	}
}
