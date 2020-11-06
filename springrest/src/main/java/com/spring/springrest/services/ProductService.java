package com.spring.springrest.services;

import java.util.List;

import com.spring.springrest.Entity.product;

public interface ProductService {

	public List<product> getProduct();
	
	public product addProduct(product product);
}
