package com.cg.bank.SpringBankProject;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.cg.bank.SpringBankProject.entity.CurrentAccount;
import com.cg.bank.SpringBankProject.entity.SavingsAccount;
import com.cg.bank.SpringBankProject.repository.AccountRepository;

@SpringBootApplication
public class SpringBankProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBankProjectApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner populateData(AccountRepository accountRepository) {
		return (arg)->{
			accountRepository.save(new SavingsAccount(100,"Deepika",23246.00,true));
			accountRepository.save(new SavingsAccount(101,"Tejas",7890978.00,false));
			accountRepository.save(new SavingsAccount(102,"ankita",23246.00,true));
			accountRepository.save(new SavingsAccount(103,"tushar",2345.00,false));
			accountRepository.save(new SavingsAccount(104,"dingding",4356.00,true));
			accountRepository.save(new SavingsAccount(105,"rashmi",23246.00,false));
			accountRepository.save(new CurrentAccount(106,"dingding",4356.00,123.00));
			accountRepository.save(new CurrentAccount(107,"dingding",4356.00,4856.00));
			accountRepository.save(new CurrentAccount(108,"dingding",4356.00,542.00));
			accountRepository.save(new CurrentAccount(109,"dingding",4356.00,5421.00));
			
		
			
		};
	}

}

