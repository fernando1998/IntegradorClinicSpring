package com.tecsup.integrador.services;


import com.tecsup.integrador.exception.DAOException;
import com.tecsup.integrador.exception.LoginException;
import com.tecsup.integrador.model.User;

public interface SecurityService {

	User validate(String login, String pwd) throws LoginException, DAOException;
	
}