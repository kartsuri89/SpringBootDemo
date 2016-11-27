package com.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.home.dao.EmployeeRepository;
import com.home.model.Employee;

@SpringBootApplication
public class Application implements CommandLineRunner{
	
	@Autowired
	private EmployeeRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);	
	}
	
	@Override
	public void run(String... args) throws Exception {

		//repository.deleteAll();
		System.out.println("Im inside run method");
		
		repository.save(new Employee("Rangaraju","Assistant accountant"));
	}
	
}
