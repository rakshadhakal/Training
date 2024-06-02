package com.eprabidhi.ecom.model;

import java.io.Serializable;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name ="userdetail_table")

public class UserDetail implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO)
	@Column(name="user_id")
	private int id;
	@Column(name="user_name",nullable =false)
	private String name;
	@Column(name="user_address")
	private String address;
	@Column(name="user_dob")
	private LocalDate dob;
	@Column(name="user_username",nullable =false , unique=true)
	private String username;
	@Column(name="user_email",nullable =false , unique=true)
	private String email;
	@Column(name="user_password",nullable =false)
	private String password;
	@Column(name="active")
	private String enabled;
	
	@Transient
	private String authority;
	
	@OneToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL, mappedBy="userDetail")
	private Role role;
	
	public UserDetail() {
		super();
	}
	public UserDetail(int id, String name, String address, LocalDate dob, String username, String email, String password,
			String enabled,String authority, Role role) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.dob = dob;
		this.username = username;
		this.email = email;
		this.password = password;
		this.enabled=enabled;
		this.authority=authority;
		this.role = role;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public String getEnabled() {
		return enabled;
	}
	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}
	public String getAuthority() {
		return authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}
	
	
	
	
	

}
