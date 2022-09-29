package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.services.ProductService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "/api/products")
@AllArgsConstructor
public class ProductController {

	private ProductService service;
	
	@GetMapping
	public List<Product> getAll(){
		return this.service.findAll();
	}
	
	
	@GetMapping("/available")
	public List<Product> getProductsWithInventoryAvailable(){
		return this.service.getProductsInventoryGreaterThanZero();
	}
	
	@GetMapping("/not-available")
	public List<Product> getProductsWithInventoryNotAvailable(){
		return this.service.getProductsInventoryEqualToZero();
	}
	
	@PostMapping("/add")
	public ResponseEntity<Product> add(@RequestBody Product product) {
		Product newProduct = this.service.save(product);
		return ResponseEntity.ok().body(null);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Product> update(@RequestBody Product product){
		Product newProduct = this.service.update(product);
		return ResponseEntity.ok().body(null);
	}
	
	@PostMapping("/byCompanyName")
	public List<Product> findByProductCompanyName(@RequestBody String productCompanyName) {
		return this.service.findByProductCompanyName(productCompanyName);
	}

}
