package com.crash.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.crash.entities.Account;
import com.crash.entities.Transaction;

public class AccountDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long accountId;
	private String name;
	private String email;

	private List<TransactionDTO> transactions = new ArrayList<>();

	public AccountDTO(Long accountId, String name, String email) {
		this.accountId = accountId;
		this.name = name;
		this.email = email;
	}

	public AccountDTO(Account entity) {
		this.accountId = entity.getAccountId();
		this.name = entity.getName();
		this.email = entity.getEmail();
	}

	public AccountDTO(Account entity, List<Transaction> list) {
		this(entity);
		list.forEach(x -> this.transactions.add(new TransactionDTO(x)));
	}

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<TransactionDTO> getTransactions() {
		return transactions;
	}
}
