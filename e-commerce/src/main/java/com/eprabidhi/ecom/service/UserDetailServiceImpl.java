package com.eprabidhi.ecom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eprabidhi.ecom.dao.UserDetailDao;
import com.eprabidhi.ecom.model.UserDetail;



@Service
@Transactional
public class UserDetailServiceImpl implements UserDetailService{

	@Autowired
	private UserDetailDao userDetailDao;
	@Override
	public void addUser(UserDetail user) {
		// TODO Auto-generated method stub
		userDetailDao.save(user);
		
	}

	@Override
	public List<UserDetail> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDetail getUserByUserName(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDetail getUserById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDetail getUserByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateUser(UserDetail user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(UserDetail user) {
		// TODO Auto-generated method stub
		
	}


	
	
}
