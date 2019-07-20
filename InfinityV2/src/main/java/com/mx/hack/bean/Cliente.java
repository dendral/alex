package com.mx.hack.bean;

import java.io.Serializable;

public class Cliente implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String clientType; 
    private String prospector;
    private String socialNet;
    private String segment;
	public String getClientType() {
		return clientType;
	}
	public void setClientType(String clientType) {
		this.clientType = clientType;
	}
	public String getProspector() {
		return prospector;
	}
	public void setProspector(String prospector) {
		this.prospector = prospector;
	}
	public String getSocialNet() {
		return socialNet;
	}
	public void setSocialNet(String socialNet) {
		this.socialNet = socialNet;
	}
	public String getSegment() {
		return segment;
	}
	public void setSegment(String segment) {
		this.segment = segment;
	}
    
    
    
}