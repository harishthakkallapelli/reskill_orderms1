package com.infy.OrderMS.repository;

import org.springframework.data.repository.CrudRepository;

import com.infy.OrderMS.entity.ProductsOrdered;
import com.infy.OrderMS.utility.CustomPK;



public interface ProductsOrderedRepository extends CrudRepository<ProductsOrdered, CustomPK>{

}
