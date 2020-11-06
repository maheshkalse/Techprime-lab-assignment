package com.spring.springrest.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.springrest.Entity.product;
import com.spring.springrest.services.ProductService;

@RestController
@CrossOrigin(origins = "*")
public class Mycontrollar {
	@Autowired
	public ProductService productService;
	
	// for testing purpose postman request on fire /home url 
	@GetMapping("/home")
	public String home()
	{
		return "this is message ";
	}
	
	
	//get the all product 
	@GetMapping("/product")
	public List<product> getproduct()
	{
		return  this.productService.getProduct();
	}
	
	//add product
	@PostMapping("/product")
	public product addProduct(@RequestBody product product)
	{
		return this.productService.addProduct(product);
	}
}
