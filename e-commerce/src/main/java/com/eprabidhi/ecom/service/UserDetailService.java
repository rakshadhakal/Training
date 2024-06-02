package com.eprabidhi.ecom.service;

import java.util.List;
import com.eprabidhi.ecom.model.UserDetail;

public interface UserDetailService {
	public void addUser(UserDetail user);
	public List<UserDetail> getAllUsers();
	
	public UserDetail getUserByUserName(String username);
	public UserDetail getUserById(int id);
	public UserDetail getUserByEmail(String email);
	
	public void updateUser(UserDetail user);
	
	public void deleteUser(UserDetail user);
	
	

}
