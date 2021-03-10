package com.crash.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crash.entities.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long>{
	
}
