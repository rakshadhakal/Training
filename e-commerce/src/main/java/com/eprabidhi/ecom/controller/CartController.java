package com.eprabidhi.ecom.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.web.exchanges.HttpExchange.Principal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.eprabidhi.ecom.model.CartItem;
import com.eprabidhi.ecom.model.Product;
import com.eprabidhi.ecom.model.UserDetail;
import com.eprabidhi.ecom.service.CartItemService;
import com.eprabidhi.ecom.service.ProductService;
import com.eprabidhi.ecom.service.UserDetailService;

@Controller
@RequestMapping("/user/cart")
public class CartController {
     @Autowired
     private ProductService productService;
     
     @Autowired
     private UserDetailService userDetailService;
     
     @Autowired
     private CartItemService cartItemService;
     
	@GetMapping("/add/{pid}")
	public String addCartItem(@PathVariable("pid") int id,Model model) {
		Product product =productService.getProductById(id);
		model.addAttribute("product",product);
		return "user/add_cart";
	}
	
	@PostMapping("/save")
	public String saveCartItem(@ModelAttribute("cart_item") CartItem cartItem, 
			                   @RequestParam("product_id") int pid,
			                   Principal p) {
		String username = p.getName();   //gives the user-name of logged-in user
		UserDetail ud = userDetailService.getUserByUserName(username);
		cartItem.setUser(ud);
		Product product = productService.getProductById(pid);
		cartItem.setProduct(product);
		cartItem.setAddedDate(LocalDate.now());
		
		//save the cart to database
		cartItemService.saveCartItem(cartItem);
		return "redirect:/product";
	}
}
