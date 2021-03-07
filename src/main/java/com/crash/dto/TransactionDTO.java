package com.crash.dto;

import java.time.Instant;

import com.crash.entities.Transaction;
import com.crash.enums.CurrencyCode;
import com.crash.enums.TypePayment;
import com.crash.enums.Typetransferency;

public class TransactionDTO {

	private Long id;
	private String encodedKey;
	private String arrangementId;
	private Instant bookingDate;
	private Instant valueDate;
	private Typetransferency typeTransferency;
	private Double amount;
	private CurrencyCode currencyCode;
	private Double currency;
	private TypePayment typePayment;
	private Double runningBalance;
	private Integer counterPartyAccountNumber;

	
	
	public TransactionDTO(Long id, String encodedKey, String arrangementId, Instant bookingDate, Instant valueDate,
			Typetransferency typeTransferency, Double amount, CurrencyCode currencyCode, Double currency,
			TypePayment typePayment, Double runningBalance, Integer counterPartyAccountNumber) {
		this.id = id;
		this.encodedKey = encodedKey;
		this.arrangementId = arrangementId;
		this.bookingDate = bookingDate;
		this.valueDate = valueDate;
		this.typeTransferency = typeTransferency;
		this.amount = amount;
		this.currencyCode = currencyCode;
		this.currency = currency;
		this.typePayment = typePayment;
		this.runningBalance = runningBalance;
		this.counterPartyAccountNumber = counterPartyAccountNumber;
	}

	public TransactionDTO(Transaction entity) {
		this.id = entity.getId();
		this.encodedKey = entity.getEncodedKey();
		this.arrangementId = entity.getArrangementId();
		this.bookingDate = entity.getBookingDate();
		this.valueDate = entity.getValueeDat();
		this.typeTransferency = entity.getTypeTransferency();
		this.amount = entity.getAmount();
		this.currencyCode = entity.getCurrencyCode();
		this.currency = entity.getCurrency();
		this.typePayment = entity.getTypePayment();
		this.runningBalance = entity.getRunningBalance();
		this.counterPartyAccountNumber = entity.getCounterPartyAccountNumber();

	}

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

	public Instant getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Instant bookingDate) {
		this.bookingDate = bookingDate;
	}

	public Instant getValueDate() {
		return valueDate;
	}

	public void setValueDate(Instant valueDate) {
		this.valueDate = valueDate;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
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

}
