package org.tcs.mm.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/** 
 * version : 1.0
 * This is Vehicle Alerts class 
 *  
 *  
 *  
 **/

@Entity
@Table(name = "vehicle_alert_details")
public class VehicleAlertsVO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "vehicle_alert_id")
	private long alertId;

	@Column(name = "low_fuel_flag")
	private int lowFuel;

	@Column(name = "speed_limit")
	private int speedLimit;

	@Column(name = "area_limit")
	private int areaLimit;

	@Column(name = "seat_belt")
	private int seatBelt;

	@Column(name = "parking_break")
	private int parkingBreak;
	
	@Column(name = "crash_detection")
	private int crashDetection;
	
	@Column(name = "disconnect_From_Main_Battery")
	private int disconnectFromMainBattery;
	
	@Column(name = "low_battery")
	private int lowBattery;
	
	@Column(name = "low_Battery_Removed")
	private int lowBatteryRemoved;
	
	@Column(name = "connect_Back_to_Main_Battery")
	private int connectBacktoMainBattery;
	
	@Column(name = "ignition_on")
	private int ignitionON;
	
	@Column(name = "ignition_off")
	private int ignition_OFF;
	
	@Column(name = "gps_box_opened")
	private int gpsBoxOpened;
	
	@Column(name = "emergency_state_on")
	private int emergencyStateON;
	
	@Column(name = "emergency_state_off")
	private int emergencyStateOFF;
	
	@Column(name = "harsh_braking")
	private int harshBraking;
	
	@Column(name = "harsh_acceleration")
	private int harshAcceleration;
	
	@Column(name = "rash_turning")
	private int rashTurning;
	
	@Column(name = "device_tempered")
	private int deviceTempered;
	
	@Column(name = "tow_away_alert")
	private int towAwayAlert;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "vehicle_id")
	@JsonIgnore
	private VehicleVO vehicleDetails;
	
	

public VehicleAlertsVO(long alertId, int lowFuel, int speedLimit, int areaLimit, int seatBelt, int parkingBreak,
			int crashDetection, int disconnectFromMainBattery, int lowBattery, int lowBatteryRemoved,
			int connectBacktoMainBattery, int ignitionON, int ignition_OFF, int gpsBoxOpened, int emergencyStateON,
			int emergencyStateOFF, int harshBraking, int harshAcceleration, int rashTurning, int deviceTempered,
			int towAwayAlert, VehicleVO vehicleDetails) {
		super();
		this.alertId = alertId;
		this.lowFuel = lowFuel;
		this.speedLimit = speedLimit;
		this.areaLimit = areaLimit;
		this.seatBelt = seatBelt;
		this.parkingBreak = parkingBreak;
		this.crashDetection = crashDetection;
		this.disconnectFromMainBattery = disconnectFromMainBattery;
		this.lowBattery = lowBattery;
		this.lowBatteryRemoved = lowBatteryRemoved;
		this.connectBacktoMainBattery = connectBacktoMainBattery;
		this.ignitionON = ignitionON;
		this.ignition_OFF = ignition_OFF;
		this.gpsBoxOpened = gpsBoxOpened;
		this.emergencyStateON = emergencyStateON;
		this.emergencyStateOFF = emergencyStateOFF;
		this.harshBraking = harshBraking;
		this.harshAcceleration = harshAcceleration;
		this.rashTurning = rashTurning;
		this.deviceTempered = deviceTempered;
		this.towAwayAlert = towAwayAlert;
		this.vehicleDetails = vehicleDetails;
	}

	public VehicleAlertsVO() {super();}

	

	public long getAlertId() {
		return alertId;
	}

	public void setAlertId(long alertId) {
		this.alertId = alertId;
	}

	public int getLowFuel() {
		return lowFuel;
	}

	public void setLowFuel(int lowFuel) {
		this.lowFuel = lowFuel;
	}

	public int getSpeedLimit() {
		return speedLimit;
	}

	public void setSpeedLimit(int speedLimit) {
		this.speedLimit = speedLimit;
	}

	public int getAreaLimit() {
		return areaLimit;
	}

	public void setAreaLimit(int areaLimit) {
		this.areaLimit = areaLimit;
	}

	public int getSeatBelt() {
		return seatBelt;
	}

	public void setSeatBelt(int seatBelt) {
		this.seatBelt = seatBelt;
	}

	public int getParkingBreak() {
		return parkingBreak;
	}

	public void setParkingBreak(int parkingBreak) {
		this.parkingBreak = parkingBreak;
	}

	public int getCrashDetection() {
		return crashDetection;
	}

	public void setCrashDetection(int crashDetection) {
		this.crashDetection = crashDetection;
	}

	public int getDisconnectFromMainBattery() {
		return disconnectFromMainBattery;
	}

	public void setDisconnectFromMainBattery(int disconnectFromMainBattery) {
		this.disconnectFromMainBattery = disconnectFromMainBattery;
	}

	public int getLowBattery() {
		return lowBattery;
	}

	public void setLowBattery(int lowBattery) {
		this.lowBattery = lowBattery;
	}

	public int getLowBatteryRemoved() {
		return lowBatteryRemoved;
	}

	public void setLowBatteryRemoved(int lowBatteryRemoved) {
		this.lowBatteryRemoved = lowBatteryRemoved;
	}

	public int getConnectBacktoMainBattery() {
		return connectBacktoMainBattery;
	}

	public void setConnectBacktoMainBattery(int connectBacktoMainBattery) {
		this.connectBacktoMainBattery = connectBacktoMainBattery;
	}

	public int getIgnitionON() {
		return ignitionON;
	}

	public void setIgnitionON(int ignitionON) {
		this.ignitionON = ignitionON;
	}

	public int getIgnition_OFF() {
		return ignition_OFF;
	}

	public void setIgnition_OFF(int ignition_OFF) {
		this.ignition_OFF = ignition_OFF;
	}

	public int getGpsBoxOpened() {
		return gpsBoxOpened;
	}

	public void setGpsBoxOpened(int gpsBoxOpened) {
		this.gpsBoxOpened = gpsBoxOpened;
	}

	public int getEmergencyStateON() {
		return emergencyStateON;
	}

	public void setEmergencyStateON(int emergencyStateON) {
		this.emergencyStateON = emergencyStateON;
	}

	public int getEmergencyStateOFF() {
		return emergencyStateOFF;
	}

	public void setEmergencyStateOFF(int emergencyStateOFF) {
		this.emergencyStateOFF = emergencyStateOFF;
	}

	public int getHarshBraking() {
		return harshBraking;
	}

	public void setHarshBraking(int harshBraking) {
		this.harshBraking = harshBraking;
	}

	public int getHarshAcceleration() {
		return harshAcceleration;
	}

	public void setHarshAcceleration(int harshAcceleration) {
		this.harshAcceleration = harshAcceleration;
	}

	public int getRashTurning() {
		return rashTurning;
	}

	public void setRashTurning(int rashTurning) {
		this.rashTurning = rashTurning;
	}

	public int getDeviceTempered() {
		return deviceTempered;
	}

	public void setDeviceTempered(int deviceTempered) {
		this.deviceTempered = deviceTempered;
	}

	public int getTowAwayAlert() {
		return towAwayAlert;
	}

	public void setTowAwayAlert(int towAwayAlert) {
		this.towAwayAlert = towAwayAlert;
	}

	public VehicleVO getVehicleDetails() {
		return vehicleDetails;
	}

	public void setVehicleDetails(VehicleVO vehicleDetails) {
		this.vehicleDetails = vehicleDetails;
	}

	@Override
	public String toString() {
		return "VehicleAlertsVO [alertId=" + alertId + ", lowFuel=" + lowFuel + ", speedLimit=" + speedLimit
				+ ", areaLimit=" + areaLimit + ", seatBelt=" + seatBelt + ", parkingBreak=" + parkingBreak
				+ ", crashDetection=" + crashDetection + ", disconnectFromMainBattery=" + disconnectFromMainBattery
				+ ", lowBattery=" + lowBattery + ", lowBatteryRemoved=" + lowBatteryRemoved
				+ ", connectBacktoMainBattery=" + connectBacktoMainBattery + ", ignitionON=" + ignitionON
				+ ", ignition_OFF=" + ignition_OFF + ", gpsBoxOpened=" + gpsBoxOpened + ", emergencyStateON="
				+ emergencyStateON + ", emergencyStateOFF=" + emergencyStateOFF + ", harshBraking=" + harshBraking
				+ ", harshAcceleration=" + harshAcceleration + ", rashTurning=" + rashTurning + ", deviceTempered="
				+ deviceTempered + ", towAwayAlert=" + towAwayAlert + ", vehicleDetails=" + vehicleDetails + "]";
	}
	
	
}
