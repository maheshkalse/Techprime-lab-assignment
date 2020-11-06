package com.spring.springrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.springrest.Entity.product;

public interface ProductDao extends JpaRepository<product, Long> {
	

}
