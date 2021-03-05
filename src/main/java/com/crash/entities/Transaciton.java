package com.crash.entities;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.crash.enums.CurrencyCode;
import com.crash.enums.TypePayment;
import com.crash.enums.Typetransferency;

@Entity
@Table(name = "tb_transaction")
public class Transaciton implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String encodedKey;
	private String arrangementId;
	private LocalDateTime bookingDate;
	private LocalDateTime valueDate;
	private Typetransferency typeTransferency;
	private Double amount;
	private CurrencyCode currencyCode;
	private Double currency;
	private TypePayment typePayment;
	private Double runningBalance;
	private Integer counterPartyAccountNumber;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEncodedKey() {
		return encodedKey;
	}

	public void setEncodedKey(String encodedKey) {
		this.encodedKey = encodedKey;
	}

	public String getArrangementId() {
		return arrangementId;
	}

	public void setArrangementId(String arrangementId) {
		this.arrangementId = arrangementId;
	}

	public LocalDateTime getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(LocalDateTime bookingDate) {
		this.bookingDate = bookingDate;
	}

	public LocalDateTime getValueDate() {
		return valueDate;
	}

	public void setValueDate(LocalDateTime valueDate) {
		this.valueDate = valueDate;
	}

	public Typetransferency getTypeTransferency() {
		return typeTransferency;
	}

	public void setTypeTransferency(Typetransferency typeTransferency) {
		this.typeTransferency = typeTransferency;
	}

	public CurrencyCode getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(CurrencyCode currencyCode) {
		this.currencyCode = currencyCode;
	}

	public TypePayment getTypePayment() {
		return typePayment;
	}

	public void setTypePayment(TypePayment typePayment) {
		this.typePayment = typePayment;
	}

	public Double getCurrency() {
		return currency;
	}

	public void setCurrency(Double currency) {
		this.currency = currency;
	}

	public Double getRunningBalance() {
		return runningBalance;
	}

	public void setRunningBalance(Double runningBalance) {
		this.runningBalance = runningBalance;
	}

	public Integer getCounterPartyAccountNumber() {
		return counterPartyAccountNumber;
	}

	public void setCounterPartyAccountNumber(Integer counterPartyAccountNumber) {
		this.counterPartyAccountNumber = counterPartyAccountNumber;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

}
