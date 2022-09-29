package com.example.demo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	@Query(value = "SELECT * FROM lumen_product WHERE product_inventory>0",nativeQuery = true)
	List<Product> getProductsInventoryGreaterThanZero();
	
	@Query(value = "SELECT * FROM lumen_product WHERE product_inventory=0",nativeQuery = true)
	List<Product> getProductsInventoryEqualToZero();
	
	List<Product> findByProductCompanyName(String productCompanyName);
	
}
