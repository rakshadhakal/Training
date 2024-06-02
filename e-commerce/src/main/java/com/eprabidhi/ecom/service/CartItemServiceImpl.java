package com.eprabidhi.ecom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eprabidhi.ecom.dao.CartItemDao;
import com.eprabidhi.ecom.model.CartItem;
import com.eprabidhi.ecom.model.UserDetail;
@Service
@Transactional
public class CartItemServiceImpl implements CartItemService{
	@Autowired
     private CartItemDao cartItemDao;
	@Override
	public CartItem saveCartItem(CartItem cartItem) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CartItem> getAllCartsByUser(UserDetail user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CartItem updateCartItem(CartItem cartItem) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CartItem deleteCartItem(CartItem cartItem) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllCartItemByUser(UserDetail user) {
		// TODO Auto-generated method stub
		
	}

}
