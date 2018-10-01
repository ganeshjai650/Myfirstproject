package com.niit.Service;

import java.util.List;

import com.niit.Model.User;

public interface UserService {
	public boolean addUserServ(User user);
	public User getuserServbyId(int Id);
	public boolean updateServ(User user);
	public boolean deleteServ(int Id);

	public User getUpdateServId(int Id );
		public List<User>getAllServ();
}
