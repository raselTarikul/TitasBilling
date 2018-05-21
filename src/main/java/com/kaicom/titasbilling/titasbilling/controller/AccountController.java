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

}
