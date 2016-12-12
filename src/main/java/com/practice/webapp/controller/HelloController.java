package com.practice.webapp.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	//ApplicationContext context =  new ClassPathXmlApplicationContext("spring-module.xml");
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public ModelAndView getHello(String name) {
		ModelAndView model = new ModelAndView("hello");
		// = model.setViewName("hello");
		String message = "Hello!"+name;
		model.addObject("message", message);
		return model;
	}
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView getHome(String name) {
		ModelAndView model = new ModelAndView("home");
		String message = "Hello!"+name;
		model.addObject("message", message);
		return model;
	}
	
	@RequestMapping(value = "/account", method = RequestMethod.GET)
	public ModelAndView getAccount(String name) {
		ModelAndView model = new ModelAndView("account");
		String message = "Hello!"+name;
		model.addObject("message", message);
		return model;
	}
	
	@RequestMapping(value = "/clockin", method = RequestMethod.GET)
	public ModelAndView getClockin(String name) {
		ModelAndView model = new ModelAndView("clockin");
		String message = "Hello!"+name;
		model.addObject("message", message);
		return model;
	}
	
	@RequestMapping(value = "/getoff", method = RequestMethod.GET)
	public ModelAndView getGetoff(String name) {
		ModelAndView model = new ModelAndView("getoff");
		String message = "Hello!"+name;
		model.addObject("message", message);
		return model;
	}
	
	@RequestMapping(value = "/InventoryManagement_check", method = RequestMethod.GET)
	public ModelAndView getInventoryManagement_check(String name) {
		ModelAndView model = new ModelAndView("InventoryManagement_check");
		String message = "Hello!"+name;
		model.addObject("message", message);
		return model;
	}
	
	@RequestMapping(value = "/InventoryManagement_rank", method = RequestMethod.GET)
	public ModelAndView getInventoryManagement_rank(String name) {
		ModelAndView model = new ModelAndView("InventoryManagement_rank");
		String message = "Hello!"+name;
		model.addObject("message", message);
		return model;
	}
	
	@RequestMapping(value = "/InventoryManagement_show", method = RequestMethod.GET)
	public ModelAndView getInventoryManagement_show(String name) {
		ModelAndView model = new ModelAndView("InventoryManagement_show");
		String message = "Hello!"+name;
		model.addObject("message", message);
		return model;
	}
	
	@RequestMapping(value = "/Manager_Home", method = RequestMethod.GET)
	public ModelAndView getManager_Home(String name) {
		ModelAndView model = new ModelAndView("Manager_Home");
		String message = "Hello!"+name;
		model.addObject("message", message);
		return model;
	}
	
	@RequestMapping(value = "/Shelves", method = RequestMethod.GET)
	public ModelAndView getShelves(String name) {
		ModelAndView model = new ModelAndView("Shelves");
		String message = "Hello!"+name;
		model.addObject("message", message);
		return model;
	}
	
	@RequestMapping(value = "/work", method = RequestMethod.GET)
	public ModelAndView getWork(String name) {
		ModelAndView model = new ModelAndView("work");
		String message = "Hello!"+name;
		model.addObject("message", message);
		return model;
	}
	
	@RequestMapping(value = "/CheckIn", method = RequestMethod.GET)
	public ModelAndView getCheckIn(String name) {
		ModelAndView model = new ModelAndView("CheckIn");
		String message = "Hello!"+name;
		model.addObject("message", message);
		return model;
	}
	
	
}
