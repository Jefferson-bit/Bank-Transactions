package com.crash.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crash.dto.TransactionDTO;
import com.crash.service.AccountService;

@RestController
@RequestMapping(value = "/accounts")
public class AccountController {
	
	@Autowired
	private AccountService service;
	
	@GetMapping(value = "/{accountId}/transactions/{id}")
	public ResponseEntity <TransactionDTO> getAllTransactions(@PathVariable Long accountId, @PathVariable Long id){
		TransactionDTO obj = service.findByTransaction(accountId, id);
		return ResponseEntity.ok().body(obj);
	}
}
