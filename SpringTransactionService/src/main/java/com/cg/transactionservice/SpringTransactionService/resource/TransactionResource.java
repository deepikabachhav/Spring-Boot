package com.cg.transactionservice.SpringTransactionService.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cg.transactionservice.SpringTransactionService.entity.Transaction;
import com.cg.transactionservice.SpringTransactionService.service.TransactionService;

@RestController
@RequestMapping("/transactions")
public class TransactionResource {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private TransactionService transactionService;
	
	public ResponseEntity<Transaction> deposit(@RequestBody Transaction transaction){
		ResponseEntity<Double> entity=restTemplate.getForEntity("http://localhost:8899/accounts/"+transaction.getAccountNumber()+ "/balance",Double.class);
		double currentBalance=entity.getBody();
		double updateBalance=transactionService.deposit(transaction.getAccountNumber(), transaction.getTransactionDetails(), currentBalance, transaction.getAmount());
		restTemplate.put("http://localhost:8899/accounts/"+transaction.getAccountNumber()+"?currentBalance="+updateBalance,null);
		return new ResponseEntity<>(HttpStatus.CREATED);
		
	}
}
