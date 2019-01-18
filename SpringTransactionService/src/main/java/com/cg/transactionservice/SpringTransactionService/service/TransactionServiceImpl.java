package com.cg.transactionservice.SpringTransactionService.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.transactionservice.SpringTransactionService.entity.Transaction;
import com.cg.transactionservice.SpringTransactionService.entity.TransactionType;
import com.cg.transactionservice.SpringTransactionService.repo.TransactionRepository;
@Service
public class TransactionServiceImpl implements TransactionService {
	@Autowired
	private TransactionRepository transactionRepository;
	
	
	public Double fundTransfer(int senderAccountNumber,int receiverAccountNumber,double amount) {
		return null;
		
	}
	

	public Double deposit(int accountNumber,String transactionDetails,double currentBalance,double amount) {
		Transaction transaction=new Transaction();
		transaction.setAccountNumber(accountNumber);
		transaction.setAmount(amount);
		currentBalance=transaction.getCurrentBalance()+amount;
		transaction.setCurrentBalance(currentBalance);
		transaction.setTransactionDate(LocalDateTime .now());
		transaction.setTransactionType(TransactionType.DEPOSIT);
		transactionRepository.save(transaction);
		return currentBalance;
		
	}
	
	public void withdraw(int accountNumber,double amount) {
		
	}
}
