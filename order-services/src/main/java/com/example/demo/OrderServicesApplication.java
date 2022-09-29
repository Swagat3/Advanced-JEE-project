package com.example.demo;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Order;
import com.example.demo.entity.Product;
import com.example.demo.repos.OrderRepository;

@SpringBootApplication
public class OrderServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderServicesApplication.class, args);
	}
	@Bean
	public CommandLineRunner runner() {
		return new CommandLineRunner() {
			@Autowired
			OrderRepository repo;
			
			@Override
			public void run(String... args) throws Exception {
				repo.save(new Order(1, "Mohan", LocalDate.of(2022, 9, 23),new Product(101)));
				
			}
		};
	}

}
