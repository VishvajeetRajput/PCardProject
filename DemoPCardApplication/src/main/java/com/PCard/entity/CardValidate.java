package com.PCard.entity;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CARD_VALIDATE")
public class CardValidate {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CARD_VALIDATE_TRXN_ID")
	private Long cardValidateTrxnId;

	@Column(name = "EVENT_ID", length = 50)
	private String eventId;

	@Column(name = "TXN_ID", length = 50)
	private String txnId;

	@Column(name = "AMOUNT")
	private double amount;

	@Column(name = "CARD_ID", length = 100)
	private String cardId;

	@Column(name = "DATE")
	private Timestamp date;

	@Column(name = "CARD_VALIDATE_RESPONSE", length = 1000)
	private String cardValidateResponse;

	public CardValidate() {
	}

	public CardValidate(String eventId, String txnId, double amount, String cardId, Timestamp date,
			String cardValidateResponse) {
		this.eventId = eventId;
		this.txnId = txnId;
		this.amount = amount;
		this.cardId = cardId;
		this.date = date;
		this.cardValidateResponse = cardValidateResponse;
	}

	public Long getCardValidateTrxnId() {
		return cardValidateTrxnId;
	}

	public void setCardValidateTrxnId(Long cardValidateTrxnId) {
		this.cardValidateTrxnId = cardValidateTrxnId;
	}

	public String getEventId() {
		return eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getCardId() {
		return cardId;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public Timestamp getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public String getTxnId() {
		return txnId;
	}

	public void setTxnId(String txnId) {
		this.txnId = txnId;
	}

	public String getCardValidateResponse() {
		return cardValidateResponse;
	}

	public void setCardValidateResponse(String cardValidateResponse) {
		this.cardValidateResponse = cardValidateResponse;
	}

}
