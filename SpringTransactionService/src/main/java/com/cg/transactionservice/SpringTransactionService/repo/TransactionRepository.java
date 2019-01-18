package com.cg.transactionservice.SpringTransactionService.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.transactionservice.SpringTransactionService.entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {

}
