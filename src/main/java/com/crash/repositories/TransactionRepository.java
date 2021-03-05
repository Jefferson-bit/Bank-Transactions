package com.crash.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crash.entities.Transaciton;

public interface TransactionRepository extends JpaRepository<Transaciton, Long>{

}
