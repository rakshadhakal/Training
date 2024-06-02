package com.eprabidhi.ecom.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eprabidhi.ecom.dao.CategoryDao;
import com.eprabidhi.ecom.model.Category;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService{
	@Autowired
	private CategoryDao categoryDao;
	
	
	//apply business logic in here...
	

	@Override
	public void addCategory(Category cat) {
		// process data from category object and forward it to DAO(repo) to be saved
		categoryDao.save(cat);
	}

	@Override
	public List<Category> getAllCategoryies() {
		List<Category> catList= categoryDao.findAll();
		// TODO Auto-generated method stub
		return catList;
	}

	@Override
	public Category getCategoryByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category getCategoryById(int id) {
		// TODO Auto-generated method stub
		return categoryDao.findById(id).get();
	}

	@Override
	public void updateCategory(Category cat) {
		// TODO Auto-generated method stub
		categoryDao.saveAndFlush(cat);
		
	}

	@Override
	public void deleteCategory(Category cat) {
		// TODO Auto-generated method stub
		categoryDao.delete(cat);
		
	}
	

}
