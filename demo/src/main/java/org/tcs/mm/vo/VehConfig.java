package org.tcs.mm.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/** 
 * version : 1.0
 * This is Vehicle Configuration class 
 *  
 *  
 *  
 **/

@Table(name = "VEHICLES")
@Entity
public class VehConfig {

	@Id
	@Column(name = "vehName")
	private String vehName;

	@Column(name = "pIpaddr")
	private String pIpaddr;

	@Column(name = "sIpaddr")
	private String sIpaddr;

	@Column(name = "APN")
	private String apn;

	@Column(name = "sleepTime")
	private Integer sleepTime;

	@Column(name = "overSpeedLimit")
	private Double overSpeedLimit;

	@Column(name = "harseBrk")
	private Double harseBrk;
	
	@Column(name = "harseAcc")
	private Double harseAcc;
	
	@Column(name = "rashTurnThreshold")
	private Double rashTurnThreshold;
	
	@Column(name = "smsCenterNumber")
	private String smsCenterNumber;
	
	@Column(name = "vehRegNumber")
	private String vehRegNumber;
	
	@Column(name = "frqDataTrans")
	private Integer frqDataTrans;
	
	@Column(name = "tmeDuration")
	private Integer tmeDuration;
	
	@Column(name = "imei")
	private String imei;
	
	@Column(name = "alert")
	private Integer alert;
	

	public VehConfig() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VehConfig(String vehName, String pIpaddr, String sIpaddr, String APN, Integer sleepTime, Double overSpeedLimit,
			Double harseBrkThreshold,Double harseAccThreshold,Double rashTurnThreshold,String smsCenterNumber,
			String vehRegNumber,Integer frqDataTrans,Integer tmeDuration,String imei,Integer alert) {
		super();
		this.vehName = vehName;
		this.pIpaddr = pIpaddr;
		this.sIpaddr = sIpaddr;
		this.apn = APN;
		this.sleepTime = sleepTime;
		this.overSpeedLimit = overSpeedLimit;
		this.harseBrk = harseBrkThreshold;
		this.harseAcc = harseAccThreshold;
		this.rashTurnThreshold = rashTurnThreshold;
		this.smsCenterNumber = smsCenterNumber;
		this.vehRegNumber = vehRegNumber;
		this.frqDataTrans = frqDataTrans;
		this.tmeDuration = tmeDuration;
		this.imei = imei;
		this.alert = alert;
	}

	public String getVehName() {
		return vehName;
	}

	public void setVehName(String vehName) {
		this.vehName = vehName;
	}

	public String getpIpaddr() {
		return pIpaddr;
	}

	public void setpIpaddr(String pIpaddr) {		
	   this.pIpaddr = pIpaddr;			 
	}

	public String getsIpaddr() {
		return sIpaddr;
	}

	public void setsIpaddr(String sIpaddr) {		
	   this.sIpaddr = sIpaddr;			 
	}

	public String getAPN() {
		return apn;
	}

	public void setAPN(String APN) {		
	   this.apn = APN;			 
	}

	public Integer getSleepTime() {
		return sleepTime;
	}

	public void setSleepTime(Integer sleepTime) {
		this.sleepTime = sleepTime;
	}
	
	public Double getOverSpeedLimit() {
		return overSpeedLimit;
	}

	public void setOverSpeedLimit(Double overSpeedLimit) {
		this.overSpeedLimit = overSpeedLimit;
	}

	public Double getHarseBrkThreshold() {
		return harseBrk;
	}

	public void setHarseBrkThreshold(Double harseBrkThreshold) {
		this.harseBrk = harseBrkThreshold;
	}	
	
	public Double getHarseAccThreshold() {
		return harseAcc;
	}

	public void setHarseAccThreshold(Double harseAccThreshold) {
		this.harseAcc = harseAccThreshold;
	}
	
	public Double getRashTurnThreshold() {
		return rashTurnThreshold;
	}

	public void setRashTurnThreshold(Double rashTurnThreshold) {
		this.rashTurnThreshold = rashTurnThreshold;
	}
	
	public String getSmsCenterNumber() {
		return smsCenterNumber;
	}

	public void setSmsCenterNumber(String smsCenterNumber) {
		this.smsCenterNumber = smsCenterNumber;
	}
	
	public String getVehRegNumber() {
		return vehRegNumber;
	}

	public void setVehRegNumber(String vehRegNumber) {
		this.vehRegNumber = vehRegNumber;
	}
 
	public Integer getFrqDataTrans() {
		return frqDataTrans;
	}

	public void setFrqDataTrans(Integer frqDataTrans) {
		this.frqDataTrans = frqDataTrans;
	}
	
	public Integer getTmeDuration() {
		return tmeDuration;
	}

	public void setTmeDuration(Integer tmeDuration) {
		this.tmeDuration = tmeDuration;
	}
	
	
	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}
	
	public Integer getAlert() {
		return alert;
	}

	public void setAlert(Integer alert) {
		this.alert = alert;
	}

	@Override
	public String toString() {
		return "vehConfig [vehName=" + vehName + ", pIpaddr=" + pIpaddr + ", sIpaddr=" + sIpaddr + ", APN=" + apn
				+ ", sleepTime=" + sleepTime + ", overSpeedLimit=" + overSpeedLimit + ", harseBrkThreshold=" + harseBrk + ", harseAccThreshold="
				+ harseAcc +", rashTurnThreshold="+ rashTurnThreshold +", smsCenterNumber="+smsCenterNumber+", vehRegNumber="+ vehRegNumber +", frqDataTrans="+frqDataTrans +", tmeDuration="+tmeDuration+","
				+ " imei="+imei+", alert="+alert+"]";
						
	}

}
