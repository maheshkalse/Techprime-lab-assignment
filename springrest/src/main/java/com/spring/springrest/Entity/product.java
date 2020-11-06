package com.spring.springrest.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class product {
	
	@Id
	private long id;
	private String productname;
	private String category;
	private Double price;
	private long quantity;
	public product(long id, String productname, String category, Double price, long quantity) {
		super();
		this.id = id;
		this.productname = productname;
		this.category = category;
		this.price = price;
		this.quantity = quantity;
	}
	public product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public long getQuantity() {
		return quantity;
	}
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "product [id=" + id + ", productname=" + productname + ", category=" + category + ", price=" + price
				+ ", quantity=" + quantity + "]";
	}
	
	
}
