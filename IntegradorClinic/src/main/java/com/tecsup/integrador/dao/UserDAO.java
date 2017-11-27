package com.tecsup.integrador.dao;

import java.util.List;

import com.tecsup.integrador.exception.DAOException;
import com.tecsup.integrador.exception.EmptyResultException;
import com.tecsup.integrador.exception.LoginException;
import com.tecsup.integrador.model.User;

public interface UserDAO {
	
	User findUser(int id) throws DAOException, EmptyResultException;

	void create(String login, String password, String lastname, String firstname, String adress,String phone ) throws DAOException;

	void delete(String login) throws DAOException;

	void update(String login, String password, String lastname, String firstname,String adress,String phone) throws DAOException;

	User findUserByLogin(String login) throws DAOException, EmptyResultException;

	List<User> findAllUsers() throws DAOException, EmptyResultException;

	List<User> findUserByName(String name) throws DAOException, EmptyResultException;
	
	List<User> findUserLastName(String lastname) throws DAOException, EmptyResultException;
	
	User validate(String login, String pwd) throws LoginException, DAOException;
}
