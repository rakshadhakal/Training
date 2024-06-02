package com.eprabidhi.ecom.service;

import java.util.List;

import com.eprabidhi.ecom.model.Category;

public interface CategoryService {
	
	public void addCategory(Category cat);
	
	public List<Category> getAllCategoryies();
	
	public Category getCategoryByName(String name);
	public Category getCategoryById(int id);
	
	public void updateCategory(Category cat);
	
	public void deleteCategory(Category cat);
	

}
