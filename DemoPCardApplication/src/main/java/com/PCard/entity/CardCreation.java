package com.PCard.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CARD_CREATION")
public class CardCreation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CARD_CREATION_ID")
	private Long cardCreationId;

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

	@Column(name = "CARD_CREATION_RESPONSE", length = 1200)
	private String cardCreationResponse;

	@Column(name = "TXN_STATUS", length = 30)
	private String txnStatus;

	public CardCreation() {

	}

	public CardCreation(String eventId, String txnId, double amount, String cardId, Timestamp date,
			String cardCreationResponse, String txnStatus) {

		this.eventId = eventId;
		this.txnId = txnId;
		this.amount = amount;
		this.cardId = cardId;
		this.date = date;
		this.cardCreationResponse = cardCreationResponse;
		this.txnStatus = txnStatus;
	}

	public Long getCardCreationId() {
		return cardCreationId;
	}

	public void setCardCreationId(Long cardCreationId) {
		this.cardCreationId = cardCreationId;
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

	public String getCardCreationResponse() {
		return cardCreationResponse;
	}

	public void setCardCreationResponse(String cardCreationResponse) {
		this.cardCreationResponse = cardCreationResponse;
	}

	public String getTxnId() {
		return txnId;
	}

	public void setTxnId(String txnId) {
		this.txnId = txnId;
	}

	public String getTxnStatus() {
		return txnStatus;
	}

	public void setTxnStatus(String txnStatus) {
		this.txnStatus = txnStatus;
	}

}
