package com.educandoweb.course.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Product;
import com.educandoweb.course.repositories.IProductRepository;

@Service
public class ProductService {

	@Autowired
	private IProductRepository ProductRepository;

	public List<Product> findAll() {
		return ProductRepository.findAll();
	}
	
	public Product findById(Long id) {
		return ProductRepository.findById(id).get();
	}
}
