package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Product;
import com.example.demo.repos.ProductRepository;

@SpringBootApplication
public class ProductServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductServicesApplication.class, args);
	}
//	@Bean
//	public CommandLineRunner runner() {
//		return new CommandLineRunner() {
//			
//			@Autowired
//			ProductRepository repo;
//			
//			@Override
//			public void run(String... args) throws Exception {
//				repo.save(new Product(101,"chips",50,"lays"));
//				
//			}
//		};
//	}

}
