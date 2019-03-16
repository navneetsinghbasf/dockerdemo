package org.tcs.mm.vo;

import java.util.Date;

/** 
 * version : 1.0
 * This is Behavior Details Response class 
 *  
 *  
 *  
 **/

public class BehaviorDetailsResponseVO {

	private Date label;

	private double value;

	public BehaviorDetailsResponseVO() {
		super();
		
	}

	public BehaviorDetailsResponseVO(Date label, double value) {
		super();
		this.label = label;
		this.value = value;
	}

	public Date getLabel() {
		return label;
	}

	public void setLabel(Date label) {
		this.label = label;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

}