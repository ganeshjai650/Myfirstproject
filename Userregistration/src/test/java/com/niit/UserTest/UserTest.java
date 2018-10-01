package com.niit.UserTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

import com.niit.HibernateConfig.HibernateConfig;
import com.niit.Model.User;
import com.niit.Service.UserService;


@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes=HibernateConfig.class)
public class UserTest {
	@Autowired
	private UserService userServices;
	private User user;
	
	@Before
	public void setUp() throws Exception {
		
		user=new User();
	}

	@After
	public void tearDown() throws Exception {
		
	}   

	 @Test
	public void AddUser()
	{
	  	
		// user.setId(126);
		 user.setUsername("Car");
		 user.setPassword("carcar");
		 user.setConfirmpassword("carcar");

	
	  	assertEquals("Success",true,userServices.addUserServ(user));
	}


}