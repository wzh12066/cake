package com.practice.webapp.controller;

import java.util.ArrayList;
import java.util.List;


//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.practice.webapp.dao.CakeDAO;

import com.practice.webapp.entity.Cake;

/**
 * Handles requests for the application home page.
 */
@Controller
public class CakeController {
	ApplicationContext context =  new ClassPathXmlApplicationContext("spring-module.xml");
	
	//private static final Logger logger = LoggerFactory.getLogger(CakeController.class);
	

	@RequestMapping(value = "/Cake", method = RequestMethod.GET)
	public ModelAndView getCakeList(){
	
		ModelAndView model = new ModelAndView("Cake");
		//logger.info("controller");
		CakeDAO CakeDAO = (CakeDAO)context.getBean("CakeDAO");
		List<Cake> CakeList = new ArrayList<Cake>();
		CakeList = CakeDAO.getList();
		//logger.info(""+CakeList.size());
		model.addObject("cakeList", CakeList);
		
		return model;
	}
	
	@RequestMapping(value = "/insertCake", method = RequestMethod.GET)
	public ModelAndView insertCakePage(){
		ModelAndView model = new ModelAndView("insertCake");
		//need the following part for Cake category
		/*
		ArticleCategoryDAO articleCategoryDAO = (ArticleCategoryDAO)context.getBean("articleCategoryDAO");
		List<ArticleCategory> articleCategoryList = new ArrayList<ArticleCategory>();
		articleCategoryList = articleCategoryDAO.getList();
		model.addObject("articleCategoryList", articleCategoryList);
		*/
		return model;
	}
	
	@RequestMapping(value = "/insertCake", method = RequestMethod.POST)
	public ModelAndView insertCake(@ModelAttribute Cake Cake){
		ModelAndView model = new ModelAndView("redirect:/Cake");
		CakeDAO CakeDAO = (CakeDAO)context.getBean("CakeDAO");
		CakeDAO.insert(Cake);
		
		return model;
	}

	@RequestMapping(value = "/updateCake", method = RequestMethod.GET)
	public ModelAndView updateCakePage(@ModelAttribute Cake Cake){
		ModelAndView model = new ModelAndView("updateCake");
		CakeDAO CakeDAO = (CakeDAO)context.getBean("CakeDAO");
		//will need the following part later
		/*
		ArticleCategoryDAO articleCategoryDAO = (ArticleCategoryDAO)context.getBean("articleCategoryDAO");
		List<ArticleCategory> articleCategoryList = new ArrayList<ArticleCategory>();
		articleCategoryList = articleCategoryDAO.getList();
		*/
		Cake cake = CakeDAO.get(Cake);
		//System.out.println("id="+Cake.getId());
		//will need the following part later
		//model.addObject("articleCategoryList", articleCategoryList);
		model.addObject("cake", cake);
		return model;
	}
	
	@RequestMapping(value = "/updateCake", method = RequestMethod.POST)
	public ModelAndView updateCake(@ModelAttribute Cake Cake){
		ModelAndView model = new ModelAndView("redirect:/Cake");
		CakeDAO CakeDAO = (CakeDAO)context.getBean("CakeDAO");
		CakeDAO.update(Cake);	
		return model;
	}

	@RequestMapping(value = "/deleteCake", method = RequestMethod.POST)
	public ModelAndView deleteCake(@ModelAttribute Cake Cake){
		ModelAndView model = new ModelAndView("redirect:/Cake");
		CakeDAO CakeDAO = (CakeDAO)context.getBean("CakeDAO");
		CakeDAO.delete(Cake);
		return model;
	}


}
