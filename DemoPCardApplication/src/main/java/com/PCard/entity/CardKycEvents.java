package com.PCard.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CARD_KYC_EVENTS")
public class CardKycEvents {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CARD_KYC_EVENTS_ID")
	private Long cardKycEventsId;

	@Column(name = "CARD_Holder_ID", length = 100)
	private String cardholderId;

	@Column(name = "KYC_TYPE", length = 200)
	private String kycType;

	@Column(name = "ISSUER_CODE", length = 50)
	private String issuerCode;

	@Column(name = "KYC_STATUS", length = 200)
	private String kycStatus;

	@Column(name = "EVENT_ID", length = 100)
	private String eventId;

	@Column(name = "ERROR_CODE", length = 100)
	private String errorCode;

	@Column(name = "ERROR_MESSAGE", length = 1000)
	private String errorMessage;

	@Column(name = "DATE")
	private Timestamp date;

	public CardKycEvents() {
	}

	public CardKycEvents(String cardholderId, String kycType, String issuerCode, String kycStatus, String eventId,
			String errorCode, String errorMessage, Timestamp date) {

		this.cardholderId = cardholderId;
		this.kycType = kycType;
		this.issuerCode = issuerCode;
		this.kycStatus = kycStatus;
		this.eventId = eventId;
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
		this.date = date;
	}

	public Long getCardKycEventsId() {
		return cardKycEventsId;
	}

	public void setCardKycEventsId(Long cardKycEventsId) {
		this.cardKycEventsId = cardKycEventsId;
	}

	public String getCardholderId() {
		return cardholderId;
	}

	public void setCardholderId(String cardholderId) {
		this.cardholderId = cardholderId;
	}

	public String getKycType() {
		return kycType;
	}

	public void setKycType(String kycType) {
		this.kycType = kycType;
	}

	public String getIssuerCode() {
		return issuerCode;
	}

	public void setIssuerCode(String issuerCode) {
		this.issuerCode = issuerCode;
	}

	public String getKycStatus() {
		return kycStatus;
	}

	public void setKycStatus(String kycStatus) {
		this.kycStatus = kycStatus;
	}

	public String getEventId() {
		return eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Timestamp getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

}
