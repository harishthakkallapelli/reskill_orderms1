package com.infy.OrderMS.service;

import java.util.List;

import com.infy.OrderMS.dto.CartDTO;
import com.infy.OrderMS.dto.OrderDTO;
import com.infy.OrderMS.dto.OrderPlacedDTO;
import com.infy.OrderMS.dto.ProductDTO;
import com.infy.OrderMS.entity.Order;
import com.infy.OrderMS.exception.OrderMsException;


public interface OrderService {
	
	public List<Order> viewAllOrders() throws OrderMsException;

	public OrderPlacedDTO placeOrder(List<ProductDTO> productList, List<CartDTO> cartList, OrderDTO order) throws OrderMsException;

	public List<OrderDTO> viewOrdersByBuyer(String buyerId)throws OrderMsException;

	public OrderDTO viewOrder(String orderId) throws OrderMsException;

	public String reOrder(String buyerId, String orderId) throws OrderMsException;


}
