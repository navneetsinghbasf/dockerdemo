package org.tcs.mm.service;

import java.util.List;

import org.tcs.mm.vo.BehaviorDetailsResponseVO;

public interface BehaviorService {

	public List<BehaviorDetailsResponseVO> fetchBehaviorDetails(String vehicleNumber, String event);
}