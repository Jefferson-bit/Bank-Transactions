package com.crash.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crash.dto.AccountDTO;
import com.crash.dto.TransactionDTO;
import com.crash.entities.Account;
import com.crash.entities.Transaction;
import com.crash.repositories.AccountRepository;
import com.crash.repositories.TransactionRepository;
import com.crash.service.exceptions.ForbiddenException;
import com.crash.service.exceptions.ResourceNotFoundException;

@Service
public class AccountService implements UserDetailsService {

	@Autowired
	private AccountRepository repository;

	@Autowired
	private TransactionRepository transactionRepository;

	@Autowired
	private UserLogger userService;

	@Transactional(readOnly = true)
	public TransactionDTO findByTransaction(Long accountId, Long id) {
		AccountDTO dto = userService.getUserAuthenticated();
		for (TransactionDTO list : dto.getTransactions()) {
			if (list.getId().equals(id) && dto.getAccountId().equals(accountId)) {
				Optional<Transaction> transaction = transactionRepository.findById(list.getId());
				return new TransactionDTO(transaction.orElseThrow(() -> new ResourceNotFoundException("Not Found")));
			}
		}
		throw new ForbiddenException("Access Denied");
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Account account = repository.findByEmail(username);
		return Optional.ofNullable(account).orElseThrow(() -> new UsernameNotFoundException("Not found " + username));
	}

}
