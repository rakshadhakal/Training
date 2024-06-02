package com.eprabidhi.ecom.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eprabidhi.ecom.model.Category;
import com.eprabidhi.ecom.model.Product;


@Repository
public interface ProductDao extends JpaRepository<Product,Integer> {
  public Product findByName(String name);
  public List<Product> findByCategory(Category category);
}
