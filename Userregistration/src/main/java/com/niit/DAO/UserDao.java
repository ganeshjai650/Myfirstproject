package com.niit.DAO;

import java.util.List;

import com.niit.Model.User;

public interface UserDao {
	public boolean addUser(User user);
public User getuserbyId(int Id);
public boolean update(User user);
public boolean delete(int Id);

public User getUpdateId(int Id );
	public List<User>getAll();
}
