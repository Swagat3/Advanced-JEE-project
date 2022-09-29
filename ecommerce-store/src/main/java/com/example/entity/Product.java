package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
	private int productId;
	private String productName;
	private int productInventory;
	private String productCompanyName;
	
	//@Override
	public String toString() {
		return  productName;
	}
}
