package com.educandoweb.course.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.repositories.IOrderRepository;

@Service
public class OrderService {

	@Autowired
	private IOrderRepository OrderRepository;

	public List<Order> findAll() {
		return OrderRepository.findAll();
	}
	
	public Order findById(Long id) {
		return OrderRepository.findById(id).get();
	}
}
