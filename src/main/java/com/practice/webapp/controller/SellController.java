package com.practice.webapp.controller;

import java.sql.SQLException;
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

//import com.cake.webapp.dao.PurchaseOrderDAO;
import com.practice.webapp.dao.SellDAO;
import com.practice.webapp.entity.AccountS;
//import com.cake.webapp.entity.Book;
//import com.cake.webapp.entity.Product;
import com.practice.webapp.entity.Sell;



/**
 * Handles requests for the application home page.
 */
@Controller
public class SellController {
	ApplicationContext context =  new ClassPathXmlApplicationContext("spring-module.xml");
	
	//private static final Logger logger = LoggerFactory.getLogger(ProductController.class);
	

	@RequestMapping(value = "/showSellMenu", method = RequestMethod.GET)
	public ModelAndView listReorderProduct(){
	
		ModelAndView model = new ModelAndView("showSellMenu");
		AccountS account_session = (AccountS) context.getBean("account");
		
		SellDAO dao = (SellDAO) context.getBean("SellDAO");
		List<Sell> productList = new ArrayList<Sell>();
		
		productList = dao.getList();
		model.addObject("productList", productList);
		
		return model;
	}
	
	

	@RequestMapping(value = "/sellNum", method = RequestMethod.GET)
	public ModelAndView reorderProduct(@ModelAttribute Sell aProduct, int qty){
		ModelAndView model = new ModelAndView("redirect:/showSellMenu");
		SellDAO checkInDAODAO = (SellDAO)context.getBean("SellDAO");
		checkInDAODAO.updateNum(aProduct, qty);//qty is fixed for now
		//System.out.println("id ="+product.getId());
		return model;
	}
	
	
}