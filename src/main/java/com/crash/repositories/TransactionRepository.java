package com.crash.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crash.entities.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long>{
	
}
