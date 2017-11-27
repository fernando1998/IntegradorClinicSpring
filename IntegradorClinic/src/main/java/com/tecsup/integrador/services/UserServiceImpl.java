package com.tecsup.integrador.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecsup.integrador.dao.UserDAO;

import com.tecsup.integrador.exception.DAOException;
import com.tecsup.integrador.exception.EmptyResultException;
import com.tecsup.integrador.model.User;

@Service
public class UserServiceImpl implements UserService {
	

	@Autowired
	private UserDAO userDAO;

	@Override
	public User find(int user_id) throws DAOException, EmptyResultException {
		
		User emp = userDAO.findUser(user_id);

		return emp;
	}

	@Override
	public List<User> findAll() throws DAOException, EmptyResultException {
		
		List<User> emps = userDAO.findAllUsers();
		return emps;
	}

	@Override
	public void create(String login, String password, String lastname, String firstname, String adress, String phone) {
		
		
		
	}
	
	
}
