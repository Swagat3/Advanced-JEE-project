package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
//@AllArgsConstructor

@Entity
@Table(name="lumen_product")

public class Product {

	@Id
	@Column(name="product_id")
	private int productId;
	@Column(name="product_name")
	private String productName;
	@Column(name="product_inventory")
	private int productInventory;
	@Column(name="product_company_name")
	private String productCompanyName;
	public Product(int productId, String productName, int productInventory, String productCompanyName) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productInventory = productInventory;
		this.productCompanyName = productCompanyName;
	}
	
}
