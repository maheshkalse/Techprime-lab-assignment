package com.spring.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.springrest.Entity.product;
import com.spring.springrest.dao.ProductDao;
@Service
public class ProductServiceImplement implements ProductService {

	
	@Autowired
	private ProductDao productDao;
	
	// For Testing purpose code before database connect
	List<product> list;
	public ProductServiceImplement() {
		list = new ArrayList<>();
		list.add(new product(1,"Realme7","Mobile",70.2,2));
		list.add(new product(2,"Realme5","Mobile",80.2,3));
	
	}
	
	@Override
	public List<product> getProduct() {
		
		return productDao.findAll();
	}

	@Override
	public product addProduct(product product) {
		list.add(product); // for testing purpose code before database connect
		productDao.save(product);
		return product;
	}

}
