package com.kaicom.titasbilling.titasbilling.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AccountController {
	
	@RequestMapping(value="dashboard", method = RequestMethod.GET)
	public ModelAndView login(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("dashboard/index");
		return modelAndView;
	}
	
	@RequestMapping(value="accounts", method = RequestMethod.GET)
	public ModelAndView accountList(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("dashboard/AccountList");
		return modelAndView;
	}
	
	@RequestMapping(value="addaccount", method = RequestMethod.GET)
	public ModelAndView addAccount(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("dashboard/AddAccount");
		return modelAndView;
	}
	
	@RequestMapping(value="adddetails", method = RequestMethod.GET)
	public ModelAndView accountDetails(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("dashboard/AccountDetails");
		return modelAndView;
	}

}
