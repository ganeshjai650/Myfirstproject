package com.niit.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.DAO.UserDao;
import com.niit.Model.User;
@Service
public class UserServiceImpl  implements UserService{
@Autowired
private UserDao userdao;
	public boolean addUserServ(User user) {
		// TODO Auto-generated method stub
		return (userdao.addUser(user));
	}

	public User getuserServbyId(int Id) {
		// TODO Auto-generated method stub
		 return(userdao.getuserbyId(Id));
	}

	public boolean updateServ(User user) {
		// TODO Auto-generated method stub
		return(userdao.update(user));
	}

	public boolean deleteServ(int Id) {
		// TODO Auto-generated method stub
		return (userdao.delete(Id));
	}

	public User getUpdateServId(int Id) {
		// TODO Auto-generated method stub
		 return(userdao.getUpdateId(Id));
	}

	public List<User> getAllServ() {
		// TODO Auto-generated method stub
		return(userdao.getAll());
	}

}
