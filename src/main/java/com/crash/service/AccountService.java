	package com.crash.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crash.dto.TransactionDTO;
import com.crash.entities.Transaction;
import com.crash.repositories.AccountRepository;
import com.crash.repositories.TransactionRepository;
import com.crash.service.exceptions.ResourceNotFoundException;

@Service
public class AccountService {

	@Autowired
	private AccountRepository repository;
	
	@Autowired
	private TransactionRepository transactionRepository;
	 
	@Transactional(readOnly = true)
	public TransactionDTO findByTransaction(Long accountId, Long id) {
		try {
			repository.findById(accountId);
			Optional<Transaction> transaction = transactionRepository.findById(id);
			Transaction transactionDTO = transaction.get();
			return new TransactionDTO(transactionDTO);			
		}catch(ResourceNotFoundException e) {
			throw new ResourceNotFoundException("Not Found");
		}
	}
		
}









