package com.tecsup.integrador.services;

import java.util.List;

import com.tecsup.integrador.exception.DAOException;
import com.tecsup.integrador.exception.EmptyResultException;
import com.tecsup.integrador.model.User;

public interface UserService {

	
	User find(int user_id) throws DAOException, EmptyResultException;

	List <User> findAll() throws DAOException, EmptyResultException;
	
	//List <Employee> fin
	
	public void create(String login, String password, String lastname, String firstname, String adress,String phone);
}
