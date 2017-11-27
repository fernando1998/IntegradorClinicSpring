package com.tecsup.integrador.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecsup.integrador.dao.UserDAO;
import com.tecsup.integrador.exception.DAOException;
import com.tecsup.integrador.exception.LoginException;
import com.tecsup.integrador.model.User;


@Service
public class SecurityServiceImpl implements SecurityService {

	@Autowired
	private UserDAO userDAO;

	@Override	
	public User validate(String login, String pwd) throws LoginException, DAOException {

		User emp = userDAO.validate(login, pwd);

		return emp;
	}

}