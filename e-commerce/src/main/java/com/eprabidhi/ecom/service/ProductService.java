package com.eprabidhi.ecom.service;

import java.util.List;

import com.eprabidhi.ecom.model.Product;

public interface ProductService {
	public Product addProduct(Product product);
	public List<Product> getAllProducts();
	
	public Product getProductByName(String name);
	public Product getProductById(int id);
	
	public void updateProduct(Product product);
	
	public void deleteProduct(Product product);

}
