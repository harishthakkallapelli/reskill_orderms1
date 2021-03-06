package com.infy.OrderMS.validator;

import com.infy.OrderMS.dto.CartDTO;
import com.infy.OrderMS.dto.OrderDTO;
import com.infy.OrderMS.dto.ProductDTO;
import com.infy.OrderMS.exception.OrderMsException;

public class OrderValidator {
	
	public static void validateOrder(OrderDTO order) throws OrderMsException {
		
		//Address must be within 100 characters
		if(!validateAddress(order.getAddress()))
			throw new OrderMsException("Invalid number of address characters.");		
		
	}
	
	public static void validateStock(CartDTO cart, ProductDTO product) throws OrderMsException {
				
		//Check if the required quantity of product is available in the stock
		if(!validateStock(product.getStock(),cart.getQuantity()))
			throw new OrderMsException("Insufficient stock");	
	}
	
	
	private static boolean validateAddress(String address) {		
		return (address.length()>0 &&address.length()<100);		
	}
	
	private static boolean validateStock(Integer stock, Integer quantity) {		
		return stock>=quantity;		
	}
}
