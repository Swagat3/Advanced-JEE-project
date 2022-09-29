package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Product;
import com.example.demo.repos.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository repo;

	
	public ProductService(ProductRepository repo) {
		super();
		this.repo = repo;
	}
	
	public Product save(Product entity) {
		return this.repo.save(entity);
	}
	public List<Product> findAll(){
		return this.repo.findAll();
	}
	
	public Product update(Product entity) {
		return this.repo.save(entity);
	}
	
	public List<Product> getProductsInventoryGreaterThanZero(){
		return this.repo.getProductsInventoryGreaterThanZero();
	}
	
	public List<Product> getProductsInventoryEqualToZero(){
		return this.repo.getProductsInventoryEqualToZero();
	}
	
	public List<Product> findByProductCompanyName(String productCompanyName){
		return this.repo.findByProductCompanyName(productCompanyName);
	}
	
}
