package com.eprabidhi.ecom.dao;

import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eprabidhi.ecom.model.Category;

@Repository
public interface CategoryDao extends JpaRepository<Category,Integer> {
	
	//this will generate some basic methods to perform database operation
	//that implements JPA i.e Hibernate for Category object
	//findAll, findById, update , save , delete 
	
	public List<Category> findByName(String name);
	

}
