package com.eprabidhi.ecom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eprabidhi.ecom.dao.ProductDao;
import com.eprabidhi.ecom.model.Product;

import jakarta.transaction.Transactional;
@Service
@Transactional

public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductDao productDao;

	@Override
	public Product addProduct(Product product) {
		return productDao.save(product);
	}

	@Override
	public List<Product> getAllProducts() {
		List<Product> productList=productDao.findAll();
		// TODO Auto-generated method stub
		return productList;
	}

	@Override
	public Product getProductByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getProductById(int id) {
		// TODO Auto-generated method stub
		return productDao.findById(id).get();
	}

	@Override
	public void updateProduct(Product product) {
		// TODO Auto-generated method stub
		productDao.saveAndFlush(product);
	}

	@Override
	public void deleteProduct(Product product) {
		// TODO Auto-generated method stub
		productDao.delete(product);
	}

}
