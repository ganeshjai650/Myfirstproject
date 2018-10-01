package com.niit.usercontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.niit.Model.User;
import com.niit.Service.UserService;


@Controller
public class Usercontroller {
	@Autowired
	UserService userServ;
	
	User user;
	
	@GetMapping("/")
	public String adduser(Model model)
	{
		model.addAttribute("users",new User());
		model.addAttribute("list",userServ.getAllServ());
		return "Userregister";
		
	}
	@PostMapping("/user/add")
	public String adduser1(@ModelAttribute("users")User user)//model
	 {
		
			if(user.getId()!=0) 
			{
				userServ.addUserServ(user);	
			}
			
		return "redirect:/"; //  to redirect to root element which calls mapped
		} 
	

}
