package com.home;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

import com.home.dao.EmployeeRepository;
import com.home.model.Employee;

@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
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
		
		
		repository.save(new Employee("Karthik",new Date(),"CEO"));
	}
	
}
