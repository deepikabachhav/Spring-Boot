package com.cg.transactionservice.SpringTransactionService.service;

public interface TransactionService {

	Double fundTransfer(int senderAccountNumber, int receiverAccountNumber, double amount);

	Double deposit(int accountNumber, String transactionDetails, double currentBalance, double amount);

	void withdraw(int accountNumber, double amount);

}
