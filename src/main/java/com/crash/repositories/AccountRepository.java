package com.crash.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crash.entities.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{
	
	Account findByEmail(String email);
}
