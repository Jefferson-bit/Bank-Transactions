package com.crash.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.crash.dto.AccountDTO;
import com.crash.entities.Account;
import com.crash.repositories.AccountRepository;
import com.crash.service.exceptions.UnauthorizedException;

@Component
public class UserLogger {

	@Autowired
	private AccountRepository repository;
	
	@Transactional(readOnly = true)
	public AccountDTO getUserAuthenticated() {
		try {
			String user = SecurityContextHolder.getContext().getAuthentication().getName();
			Account account = repository.findByEmail(user);
			return new AccountDTO(account, account.getTransactions());
		} catch (Exception e) {
			throw new UnauthorizedException("Unauthorized");
		}
	}

}
