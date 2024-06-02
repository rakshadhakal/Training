package com.eprabidhi.ecom.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eprabidhi.ecom.model.CartItem;
import com.eprabidhi.ecom.model.UserDetail;

public interface CartItemDao extends JpaRepository<CartItem, Integer> {
	
	public List<CartItem> findByUser(UserDetail user);
	
	
	//delete all cart item of a user

}
