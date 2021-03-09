package com.crash.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crash.dto.TransactionDTO;
import com.crash.entities.Account;
import com.crash.entities.Transaction;
import com.crash.repositories.AccountRepository;
import com.crash.repositories.TransactionRepository;
import com.crash.service.exceptions.ResourceNotFoundException;

@Service
public class AccountService implements UserDetailsService {

	@Autowired
	private AccountRepository repository;

	@Autowired
	private TransactionRepository transactionRepository;

	@Transactional(readOnly = true)
	@PreAuthorize("hasRole('ADMIN')")
	public TransactionDTO findByTransaction(Long accountId, Long id) {
		try {
			repository.findById(accountId);
			Optional<Transaction> transaction = transactionRepository.findById(id);
			Transaction transactionDTO = transaction.get();
			return new TransactionDTO(transactionDTO);
		} catch (Exception e) {
			throw new ResourceNotFoundException("Not Found");
		}
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Account account = repository.findByEmail(username);
		return Optional.ofNullable(account)
		.orElseThrow(() -> new UsernameNotFoundException("Not found " + username));
	}

}
