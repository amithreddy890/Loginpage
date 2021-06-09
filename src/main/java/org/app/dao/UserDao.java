package org.app.dao;

import java.util.List;

import org.app.model.User;

public interface UserDao {

	public int registerUser(User user);

	public String loginUser(User user);
	public List<User> getAll();

}
