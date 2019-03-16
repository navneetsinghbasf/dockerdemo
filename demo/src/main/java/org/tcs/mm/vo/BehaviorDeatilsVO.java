package org.tcs.mm.vo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;


/** 
 * version : 1.0
 * This is Behavior Details class 
 *  
 *  
 *  
 **/

@Entity
@Table(name = "vehicle_behavior_details")
public class BehaviorDeatilsVO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "event_id")
	private long idleTimeId;

	@Column(name = "event_count")
	private double eventCount;

	@Column(name = "event_date")
	@Temporal(TemporalType.DATE)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private Date eventDate;

	@Column(name = "event_type")
	private String eventType;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "vehicle_id")
	@JsonIgnore
	private VehicleVO vehicleDetails;

	public BehaviorDeatilsVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BehaviorDeatilsVO(long idleTimeId, double eventCount, Date eventDate, String eventType,
			VehicleVO vehicleDetails) {
		super();
		this.idleTimeId = idleTimeId;
		this.eventCount = eventCount;
		this.eventDate = eventDate;
		this.eventType = eventType;
		this.vehicleDetails = vehicleDetails;
	}

	public long getIdleTimeId() {
		return idleTimeId;
	}

	public void setIdleTimeId(long idleTimeId) {
		this.idleTimeId = idleTimeId;
	}

	public double getEventCount() {
		return eventCount;
	}

	public void setEventCount(double eventCount) {
		this.eventCount = eventCount;
	}

	public Date getEventDate() {
		return eventDate;
	}

	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public VehicleVO getVehicleDetails() {
		return vehicleDetails;
	}

	public void setVehicleDetails(VehicleVO vehicleDetails) {
		this.vehicleDetails = vehicleDetails;
	}

	@Override
	public String toString() {
		return "BehaviorDeatilsVO [idleTimeId=" + idleTimeId + ", eventCount=" + eventCount + ", eventDate=" + eventDate
				+ ", eventType=" + eventType + ", vehicleDetails=" + vehicleDetails + "]";
	}

}