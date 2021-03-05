package com.crash.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crash.entities.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{

}
