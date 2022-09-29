package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "lumen_product")
public class Product {
	@Id
	@Column(name = "product_id")
	int productId;
	@Column(name = "product_name")
	String productName;
	@Column(name = "product_inventory")
	int productInventory;
	@Column(name = "product_company_name")
	String productCompanyName;

	public Product(int productId) {
		super();
		this.productId = productId;
	}

}
