package com.eprabidhi.ecom.model;

import java.io.Serializable;

import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
@Table(name = "category_table")
public class Category implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue( strategy=GenerationType.AUTO)
	@Column(name="category_id")
	private int id;
	@Column(name="categort_name" , unique=true)
	private String name;
	@Column(name="category_description")
	private String description;
	@Column(name="parent_category")
	private int parentcat; // to represent parent category of this category
	
	@OneToMany(mappedBy="category")
	private List<Product> productList;
	
	
	public Category() {    //default constructor
		super();
	}
	
	


	public Category(int id, String name, String description, int parentcat) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.parentcat = parentcat;
	}




	public Category(int id, String name, String description, int parentcat, List<Product> productList) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.parentcat = parentcat;
		this.productList = productList;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public int getParentcat() {
		return parentcat;
	}


	public void setParentcat(int parentcat) {
		this.parentcat = parentcat;
	}


	public List<Product> getProductList() {
		return productList;
	}


	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}
	
	
	
	

}
