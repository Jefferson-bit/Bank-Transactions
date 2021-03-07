package com.crash.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.crash.entities.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long>{
	
	@Query("SELECT obj FROM Transaction obj JOIN FETCH obj.account WHERE obj IN :transactions")
	List<Transaction> findAllTransaction(List<Transaction> transactions);
}
