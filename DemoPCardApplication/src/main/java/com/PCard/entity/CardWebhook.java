package com.PCard.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CARD_WEBHOOK")
public class CardWebhook {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CARD_WEBHOOK_ID")
	private Long cardWebhookId;

	@Column(name = "CARD_ID", length = 100)
	private String cardId;

	@Column(name = "Card_LAST_4DIGIT", length = 5)
	private String cardLast4Digits;

	@Column(name = "DOCKET_NUMBER", length = 50)
	private String docketNumber;

	@Column(name = "STATUS", length = 20)
	private String status;

	@Column(name = "DATE")
	private Timestamp date;

	public CardWebhook() {
	}

	public CardWebhook(String cardId, String cardLast4Digits, String docketNumber, String trxnStatus, Timestamp date) {
		this.cardId = cardId;
		this.cardLast4Digits = cardLast4Digits;
		this.docketNumber = docketNumber;
		this.status = trxnStatus;
		this.date = date;
	}

	public Long getCardWebhookId() {
		return cardWebhookId;
	}

	public void setCardWebhookId(Long cardWebhookId) {
		this.cardWebhookId = cardWebhookId;
	}

	public String getCardId() {
		return cardId;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getCardLast4Digits() {
		return cardLast4Digits;
	}

	public void setCardLast4Digits(String cardLast4Digits) {
		this.cardLast4Digits = cardLast4Digits;
	}

	public String getDocketNumber() {
		return docketNumber;
	}

	public void setDocketNumber(String docketNumber) {
		this.docketNumber = docketNumber;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Timestamp getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}
}
