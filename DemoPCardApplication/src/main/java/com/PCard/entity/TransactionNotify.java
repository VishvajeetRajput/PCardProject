package com.PCard.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TRANSACTION_NOTIFY")
public class TransactionNotify {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TRXN_NOTIFY_ID")
	private Long trxnNotifyId;

	@Column(name = "ROOT_CORD_ID", length = 100)
	private String rootCardId;

	@Column(name = "ROOT_CUSTOMER_ID", length = 100)
	private String rootCustomerId;

	@Column(name = "CARD_ID", length = 100)
	private String cardId;

	@Column(name = "DATE")
	private Timestamp date;

	@Column(name = "CARD_PROGRAM_ID", length = 100)
	private String cardProgramId;

	@Column(name = "ORG_ID", length = 100)
	private String orgId;

	@Column(name = "CUSTOMER_ID", length = 100)
	private String customerId;

	@Column(name = "CARD_HOLDER_MOBILE", length = 100)
	private String cardHolderMobile;

	@Column(name = "TXN_STATUS", length = 30)
	private String txnStatus;

	@Column(name = "EVENT_ID", length = 100)
	private String eventId;

	public Long getTrxnNotifyId() {
		return trxnNotifyId;
	}

	public void setTrxnNotifyId(Long trxnNotifyId) {
		this.trxnNotifyId = trxnNotifyId;
	}

	public String getRootCardId() {
		return rootCardId;
	}

	public void setRootCardId(String rootCardId) {
		this.rootCardId = rootCardId;
	}

	public String getRootCustomerId() {
		return rootCustomerId;
	}

	public void setRootCustomerId(String rootCustomerId) {
		this.rootCustomerId = rootCustomerId;
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

	public String getCardProgramId() {
		return cardProgramId;
	}

	public void setCardProgramId(String cardProgramId) {
		this.cardProgramId = cardProgramId;
	}

	public String getOrgId() {
		return orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCardHolderMobile() {
		return cardHolderMobile;
	}

	public void setCardHolderMobile(String cardHolderMobile) {
		this.cardHolderMobile = cardHolderMobile;
	}

	public String getTxnStatus() {
		return txnStatus;
	}

	public void setTxnStatus(String txnStatus) {
		this.txnStatus = txnStatus;
	}

	public String getEventId() {
		return eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}
}
