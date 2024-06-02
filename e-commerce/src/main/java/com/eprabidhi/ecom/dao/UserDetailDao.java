package com.eprabidhi.ecom.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eprabidhi.ecom.model.UserDetail;



@Repository
public interface UserDetailDao extends JpaRepository<UserDetail,Integer> {
	public UserDetail findByUsername(String username);
	
	public UserDetail findByEmail(String email);

}
