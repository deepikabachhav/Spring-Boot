package com.cg.restservice.FirstSpringBootApp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.cg.restservice.FirstSpringBootApp.pojo.Address;
import com.cg.restservice.FirstSpringBootApp.pojo.Employee;
import com.cg.restservice.FirstSpringBootApp.repository.EmployeeRepository;

@SpringBootApplication
public class FirstSpringBootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringBootAppApplication.class, args);
	}

	@Bean
	public CommandLineRunner populateData(EmployeeRepository repository) {
		return (arg)->{
			repository.save(new Employee(101,"deepika",98798,new Address("A-1002","nasik","423203","MH")));
			repository.save(new Employee(102,"deepika",98798,new Address("A-1002","nasik","423203","MH")));			
			repository.save(new Employee(103,"deepika",98798,new Address("A-1002","nasik","423203","MH")));			
			repository.save(new Employee(104,"deepika",98798,new Address("A-1002","nasik","423203","MH")));		
			repository.save(new Employee(105,"deepika",98798,new Address("A-1002","nasik","423203","MH")));		
			repository.save(new Employee(106,"deepika",98798,new Address("A-1002","nasik","423203","MH")));		
			repository.save(new Employee(107,"deepika",98798,new Address("A-1002","nasik","423203","MH")));	
			
		};
	}
}
