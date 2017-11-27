package com.tecsup.integrador.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.tecsup.integrador.model.User;

public class UserMapper implements RowMapper<User> {
	
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User emp = new User();
		emp.setUserId(rs.getInt("user_id"));
		emp.setLogin(rs.getString("login"));
		emp.setPassword(rs.getString("password"));
		emp.setFirstname(rs.getString("first_name"));
		emp.setLastname(rs.getString("last_name"));
		emp.setAdress(rs.getString("adress"));
		emp.setPhone(rs.getString("phone"));
	
		return emp;
	}

}
