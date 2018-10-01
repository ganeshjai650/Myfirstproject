package com.niit.DAO;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.Model.User;
@Repository("userDao")
@Transactional
public class UserImpl implements UserDao{
	@Autowired
    private SessionFactory sessionFact;
	private boolean b = true;
	public boolean addUser(User user) {
		sessionFact.getCurrentSession().save(user);
		return true;
	}

	public User getuserbyId(int Id) {
		return sessionFact.getCurrentSession().get(User.class, Id);
		
	}

	public List<User> getAll() {
		return (List<User>) sessionFact.getCurrentSession().createCriteria(User.class).list();
		
	}

	public boolean update(User user) {
		 sessionFact.getCurrentSession().update(user);
			
			return true;
	}

	public boolean delete(int Id) {
		User user=getuserbyId(Id);
		if(user!=null)
		{
			sessionFact.getCurrentSession().delete(user);
				return true;
		}
		else
			return false;

	}

	public User getUpdateId(int Id) {
		return sessionFact.getCurrentSession().get(User.class, Id);
		
	}

}
