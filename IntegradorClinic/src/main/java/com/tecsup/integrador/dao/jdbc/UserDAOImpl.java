package com.tecsup.integrador.dao.jdbc;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.tecsup.integrador.dao.UserDAO;

import com.tecsup.integrador.exception.DAOException;
import com.tecsup.integrador.exception.EmptyResultException;
import com.tecsup.integrador.exception.LoginException;
import com.tecsup.integrador.mapper.UserMapper;
import com.tecsup.integrador.model.User;

@Repository
public class UserDAOImpl implements UserDAO{

	private static final Logger logger = LoggerFactory.getLogger(UserDAOImpl.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;


	@Override
	public User findUser(int user_id) throws DAOException, EmptyResultException {

		String query = "SELECT user_id, login, password, first_name, last_name, adrees,phone FROM users WHERE user_id = ?";

		Object[] params = new Object[] { user_id };

		try {

			User emp = (User) jdbcTemplate.queryForObject(query, params, new UserMapper());
			//
			return emp;

		} catch (EmptyResultDataAccessException e) {
			throw new EmptyResultException();
		} catch (Exception e) {
			logger.info("Error: " + e.getMessage());
			throw new DAOException(e.getMessage());
		}
	}


	@Override
	public void create(String login, String password, String lastname, String firstname, String adress,String phone) throws DAOException {

		String query = "INSERT INTO users (login, password, first_name, last_name, adress, phone)  VALUES ( ?,?,?,?,?,? )";

		Object[] params = new Object[] { login, password, lastname, firstname, adress, phone };

		User emp = null;
		
		try {
			// create
			jdbcTemplate.update(query, params);
			// search
			emp = this.findUserByLogin(login);

		} catch (EmptyResultException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			logger.info("Error: " + e.getMessage());
			throw new DAOException(e.getMessage());
		}
		

	}

	@Override
	public void delete(String login) throws DAOException {

		String query = "DELETE FROM  users WHERE login = ? ";

		Object[] params = new Object[] { login };

		try {
			jdbcTemplate.update(query, params);
		} catch (Exception e) {
			logger.info("Error: " + e.getMessage());
			throw new DAOException(e.getMessage());
		}
	}

	@Override
	public void update(String  login, String password, String lastname, String firstname, String adress,String phone) throws DAOException {

		String query = "UPDATE employees SET password = ?, first_name =?, last_name = ?, adress = ?, phone = ? WHERE login = ?";

		//observacion en el orden de cada campo de la DB
		Object[] params = new Object[] { password, lastname, firstname, adress, phone, login };

		try {
			jdbcTemplate.update(query, params);
		} catch (Exception e) {
			logger.info("Error: " + e.getMessage());
			throw new DAOException(e.getMessage());
		}
	}


	@Override
	public User findUserByLogin(String login) throws DAOException, EmptyResultException {

		String query = "SELECT employee_id, login, password, first_name, last_name, adress, phone FROM users WHERE login = ? ";

		Object[] params = new Object[] { login };

		try {

			User employee = jdbcTemplate.queryForObject(query, params, new UserMapper());
			//
			return employee;

		} catch (EmptyResultDataAccessException e) {
			throw new EmptyResultException();
		} catch (Exception e) {
			logger.info("Error: " + e.getMessage());
			throw new DAOException(e.getMessage());
		}
	}
	
	@Override
	public List<User> findAllUsers() throws DAOException, EmptyResultException {

		String query = "SELECT user_id, login, password, first_name, last_name, adress,phone FROM users ";

		try {

			List<User> employees = jdbcTemplate.query(query, new UserMapper());
			//
			return employees;

		} catch (EmptyResultDataAccessException e) {
			throw new EmptyResultException();
		} catch (Exception e) {
			logger.info("Error: " + e.getMessage());
			throw new DAOException(e.getMessage());
		}
	}

	@Override
	public List<User> findUserByName(String name) throws DAOException, EmptyResultException {

		String query = "SELECT user_id, login, password, first_name, last_name, adress,phone FROM users WHERE upper(first_name) like upper(?) ";

		Object[] params = new Object[] { "%" + name + "%" };

		try {

			List<User> employees = jdbcTemplate.query(query, params, new UserMapper());
			//
			return employees;

		} catch (EmptyResultDataAccessException e) {
			throw new EmptyResultException();
		} catch (Exception e) {
			logger.info("Error: " + e.getMessage());
			throw new DAOException(e.getMessage());
		}
	}
	



	@Override
	public List<User> findUserLastName(String lastname) throws DAOException, EmptyResultException {
		String query = "SELECT user_id, login, password, first_name, last_name, adress,phone FROM users WHERE upper(last_name) like upper(?)";
		
		Object[] params = new Object[] { "%" + lastname+ "%" };
		
		try {

			List<User> employees = jdbcTemplate.query(query, params, new UserMapper());
			//
			return employees;

		} catch (EmptyResultDataAccessException e) {
			throw new EmptyResultException();
		} catch (Exception e) {
			logger.info("Error: " + e.getMessage());
			throw new DAOException(e.getMessage());
		}
	}


	@Override
	public User validate(String login, String pwd) throws LoginException, DAOException {
		logger.info("validate(): login: " + login + ", clave: " + pwd);
		
		if ("".equals(login) && "".equals(pwd)) {
			throw new LoginException("Login and password incorrect");
		}
	
		String query = "SELECT login, password, user_id, first_name, last_name, adress, phone  "
				+ " FROM users WHERE login=? AND password=?";
	
		Object[] params = new Object[] { login, pwd };
	
		try {
	
			User emp = (User) jdbcTemplate.queryForObject(query, params, new UserMapper());
			//
			return emp;
	
		} catch (EmptyResultDataAccessException e) {
			logger.info("Employee y/o clave incorrecto");
			throw new LoginException();
		} catch (Exception e) {
			logger.info("Error: " + e.getMessage());
			throw new DAOException(e.getMessage());
		}
	}
	}