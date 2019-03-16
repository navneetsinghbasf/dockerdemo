package org.tcs.mm.vo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

/** 
 * version : 1.0
 * This is Vehicle Details class 
 *  
 *  
 *  
 **/

@Entity
@Table(name = "vehicle_details")
public class VehicleVO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "vehicle_id")
	private long vehicleId;

	@Column(name = "vehicle_number")
	private String vehicleNumber;

	@Column(name = "vehicle_current_latitude")
	private String currentLatitue;

	@Column(name = "vehicle_current_longitude")
	private String currentLongitude;

	@Column(name = "mobile_number")
	private String registeredMobileNumer;

	@Column(name = "speed_configuration")
	private String speedConfig;

	@Column(name = "parking_break_alert_flag")
	private String parkingBreakAlertFlag;

	@Column(name = "seat_belt_alert_flag")
	private String seatBeltAlertFlag;

	@Column(name = "near_by_alert_flag")
	private String nearByAlertFlag;

	@Column(name = "driving_history")
	@Temporal(TemporalType.DATE)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private Date drivingHistory;

	public VehicleVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VehicleVO(long vehicleId, String vehicleNumber, String currentLatitue, String currentLongitude,
			String registeredMobileNumer, String speedConfig, String parkingBreakAlertFlag, String seatBeltAlertFlag,
			String nearByAlertFlag, Date drivingHistory) {
		super();
		this.vehicleId = vehicleId;
		this.vehicleNumber = vehicleNumber;
		this.currentLatitue = currentLatitue;
		this.currentLongitude = currentLongitude;
		this.registeredMobileNumer = registeredMobileNumer;
		this.speedConfig = speedConfig;
		this.parkingBreakAlertFlag = parkingBreakAlertFlag;
		this.seatBeltAlertFlag = seatBeltAlertFlag;
		this.nearByAlertFlag = nearByAlertFlag;
		this.drivingHistory = drivingHistory;
	}

	public long getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(long vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getCurrentLatitue() {
		return currentLatitue;
	}

	public void setCurrentLatitue(String currentLatitue) {
		this.currentLatitue = currentLatitue;
	}

	public String getCurrentLongitude() {
		return currentLongitude;
	}

	public void setCurrentLongitude(String currentLongitude) {
		this.currentLongitude = currentLongitude;
	}

	public String getRegisteredMobileNumer() {
		return registeredMobileNumer;
	}

	public void setRegisteredMobileNumer(String registeredMobileNumer) {
		this.registeredMobileNumer = registeredMobileNumer;
	}

	public String getSpeedConfig() {
		return speedConfig;
	}

	public void setSpeedConfig(String speedConfig) {
		this.speedConfig = speedConfig;
	}

	public String getParkingBreakAlertFlag() {
		return parkingBreakAlertFlag;
	}

	public void setParkingBreakAlertFlag(String parkingBreakAlertFlag) {
		this.parkingBreakAlertFlag = parkingBreakAlertFlag;
	}

	public String getSeatBeltAlertFlag() {
		return seatBeltAlertFlag;
	}

	public void setSeatBeltAlertFlag(String seatBeltAlertFlag) {
		this.seatBeltAlertFlag = seatBeltAlertFlag;
	}

	public String getNearByAlertFlag() {
		return nearByAlertFlag;
	}

	public void setNearByAlertFlag(String nearByAlertFlag) {
		this.nearByAlertFlag = nearByAlertFlag;
	}

	public Date getDrivingHistory() {
		return drivingHistory;
	}

	public void setDrivingHistory(Date drivingHistory) {
		this.drivingHistory = drivingHistory;
	}

	@Override
	public String toString() {
		return "VehicleVO [vehicleId=" + vehicleId + ", vehicleNumber=" + vehicleNumber + ", currentLatitue="
				+ currentLatitue + ", currentLongitude=" + currentLongitude + ", registeredMobileNumer="
				+ registeredMobileNumer + ", speedConfig=" + speedConfig + ", parkingBreakAlertFlag="
				+ parkingBreakAlertFlag + ", seatBeltAlertFlag=" + seatBeltAlertFlag + ", nearByAlertFlag="
				+ nearByAlertFlag + ", drivingHistory=" + drivingHistory + "]";
	}

}
