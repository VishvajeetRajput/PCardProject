package com.PCard.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SDK_SINGLE_SIGN_ON")
public class SdkSingleSignOn {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "SDK_SINGLE_ID")
	private Long sdkSingleId;

	@Column(name = "EVENT_ID", length = 50)
	private String eventId;

	@Column(name = "MOBILE")
	private String mobile;

	@Column(name = "DATE")
	private Timestamp date;

	@Column(name = "SDK_AUTHTOKEN", length = 100)
	private String sdkAuthToken;

	public SdkSingleSignOn() {
	}

	public SdkSingleSignOn(String eventId, String mobile, Timestamp date, String sdkAuthToken) {
		this.eventId = eventId;
		this.mobile = mobile;
		this.date = date;
		this.sdkAuthToken = sdkAuthToken;
	}

	public Long getSdkSingleId() {
		return sdkSingleId;
	}

	public void setSdkSingleId(Long sdkSingleId) {
		this.sdkSingleId = sdkSingleId;
	}

	public String getEventId() {
		return eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Timestamp getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public String getSdkAuthToken() {
		return sdkAuthToken;
	}

	public void setSdkAuthToken(String sdkAuthToken) {
		this.sdkAuthToken = sdkAuthToken;
	}

}
