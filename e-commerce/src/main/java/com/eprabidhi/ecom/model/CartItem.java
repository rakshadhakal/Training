package com.eprabidhi.ecom.model;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
@Entity
@Table(name="cart_item_table")
public class CartItem implements Serializable {
	
	private static final long serialVersionUID=1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cart_item_id")
	private int id;
	private LocalDate addedDate;
	@OneToOne  
	@JoinColumn(name="product_id")
	private Product product;
	private int quantity ;
	@OneToOne
	@JoinColumn(name="user_id")
	private UserDetail user;
	
	public CartItem() {
		super();
	}
	
	public CartItem(int id, LocalDate addedDate, Product product, int quantity, UserDetail user) {
		super();
		this.id = id;
		this.addedDate = addedDate;
		this.product = product;
		this.quantity = quantity;
		this.user = user;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDate getAddedDate() {
		return addedDate;
	}
	public void setAddedDate(LocalDate addedDate) {
		this.addedDate = addedDate;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public UserDetail getUser() {
		return user;
	}
	public void setUser(UserDetail user) {
		this.user = user;
	}
	
	

}
