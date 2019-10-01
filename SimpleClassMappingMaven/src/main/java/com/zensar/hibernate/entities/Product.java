package com.zensar.hibernate.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Ruchita sahu
 * @version 1.0
 * @modification date 1 october 2019
 *
 */
@Entity
public class Product {
	@Id
	@Column(name="id")
	private int productId;
	private String brand;
	private float price;
   private  String name;
   
	public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", brand=" + brand + ", price=" + price + "]";
	}
	

}
