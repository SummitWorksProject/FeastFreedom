package com.summitworks.feastfreedom.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.summitworks.feastfreedom.bean.UserBean;
import com.summitworks.feastfreedom.model.Login;
import com.summitworks.feastfreedom.model.User;
import com.summitworks.feastfreedom.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	

	 @RequestMapping(value = "/register", method = RequestMethod.GET)
	  public ModelAndView showRegister(HttpServletRequest request, HttpServletResponse response) {
	    ModelAndView mav = new ModelAndView("UserRegistration");
	    mav.addObject("UserRegistration", new Login());

	    return mav;
	  }
	 
	@RequestMapping(value = "/saveUser", method = RequestMethod.POST)
	public ModelAndView saveUser(@Valid @ModelAttribute("userBean")  UserBean userBean,  
			BindingResult result) {
	    User user = prepareModel(userBean);
		userService.addUser(user);
		
		return new ModelAndView("UserRegistrationSuccess");
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	  public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {
	    ModelAndView mav = new ModelAndView("login");
	    mav.addObject("login", new Login());

	    return mav;
	  }

	  @RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
	  public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
	      @ModelAttribute("login") Login login) {
		  System.out.println("loginProcess!");
	    ModelAndView mav = null;
	    User user = prepareModelWithLogin(login);
	    user = userService.validateUser(user);

	    if (null != user) {
	    	System.out.println("welcome!");
	      mav = new ModelAndView("welcome");
	      mav.addObject("first_Name", user.getFirst_Name());
	    } else {
	    	System.out.println("username is wrong!");
	      mav = new ModelAndView("login");
	      mav.addObject("message", "Username or Password is wrong!!");
	    }

	    return mav;
	  }

	private User prepareModel(UserBean userBean){
		User user = new User();
		user.setId(userBean.getId());
		user.setFirst_Name(userBean.getFirst_Name());
		user.setLast_Name(userBean.getLast_Name());
		user.setEmail(userBean.getEmail());
		user.setPassword(userBean.getPassword());
		user.setSecurity_Question_1(userBean.getSecurity_Question_1());
		user.setAnswer1(userBean.getAnswer1());
		user.setSecurity_Question_2(userBean.getSecurity_Question_2());
		user.setAnswer2(userBean.getAnswer2());
	
		return user;
	}
	
	private User prepareModelWithLogin(Login login){
		User user = new User();
		user.setId(login.getUsername());
		user.setPassword(login.getPassword());
		
		return user;
	}

}
