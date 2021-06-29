package com.infy.OrderMS.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.infy.OrderMS.entity.Order;


public interface OrderRepository extends CrudRepository<Order, String>{

	public List<Order> findByBuyerId(String buyerId);

	public Optional<Order> findByOrderId(String orderId);

}
