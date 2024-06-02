package com.eprabidhi.ecom.service;

import java.util.List;

import com.eprabidhi.ecom.model.CartItem;
import com.eprabidhi.ecom.model.UserDetail;

public interface CartItemService {
	
	public CartItem saveCartItem(CartItem cartItem);
	
	public List<CartItem> getAllCartsByUser(UserDetail user);
	
	public CartItem updateCartItem(CartItem cartItem);
	
	public CartItem deleteCartItem(CartItem cartItem);
	
	public void deleteAllCartItemByUser(UserDetail user);
	

}
