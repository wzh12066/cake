package com.practice.webapp.controller;

import java.util.ArrayList;
import java.util.List;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.practice.webapp.entity.AccountS;
//import com.cake.entity.Admin;
//import com.cake.entity.AdminS;
import com.practice.webapp.dao.AccountDAO;
import com.practice.webapp.entity.Account;
import com.practice.webapp.entity.AccountS;

/**
 * Handles requests for the application home page.
 */
@Controller
public class AccountController {
	ApplicationContext context =  new ClassPathXmlApplicationContext("spring-module.xml");
	
	@RequestMapping(value = "/loginout", method = RequestMethod.GET)
	public ModelAndView accountLoginOut(@ModelAttribute Account account) {
		ModelAndView model = new ModelAndView("redirect:/Cake");
		AccountS account_session = (AccountS) context.getBean("account");
		account_session.cleanup();
		return model;
	}// accountLoginOut

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView accountLoginPage() {
		ModelAndView model = new ModelAndView("login");
		return model;
	}// accountLogin

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView accountLogin(@ModelAttribute Account account) {
		System.out.println("check == " + account.getAccountID());
		ModelAndView model = new ModelAndView("redirect:/Cake");
		AccountDAO dao = (AccountDAO) context.getBean("accountDAO");
		AccountS account_session = (AccountS) context.getBean("account");

		boolean check = false;
		check = dao.identify(check, account);

		if ("".equals(account.getAccountID()) || "".equals(account.getPassword())) {
			model = new ModelAndView("login");
			model.addObject("message", "有空白，請重填");
		} else {
			if (check) {
				account = dao.get(account);
				account_session.setAccountID(account.getAccountID());
				account_session.setLevel(account.getAccountLevel());
				System.out.println("Session有" + account_session.getLevel());
				System.out.println("AccountID有嗎" + account.getAccountID());

			} else {
				model = new ModelAndView("login");
				model.addObject("message", "登入失敗");
			}
		}
		return model;
	}// accountLogin

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView register1() {
		ModelAndView model = new ModelAndView("register");
		AccountS account_session = (AccountS) context.getBean("account");
		if (account_session.getLevel() != 2) {
			AccountDAO accountDAO = (AccountDAO) context.getBean("accountDAO");
			List<Account> accountList = new ArrayList<Account>();
			accountList = accountDAO.getList();
			model.addObject("accountList", accountList);
		} else {
			model = new ModelAndView("");
		}

		return model;
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ModelAndView register(@ModelAttribute Account account) {
		ModelAndView model = new ModelAndView("redirect:/login");
		AccountDAO accountDAO = (AccountDAO) context.getBean("accountDAO");
		accountDAO.insert(account);

		return model;
	}

	
	//book(test)
	@RequestMapping(value = "/book", method = RequestMethod.GET)
	public ModelAndView book() {
		ModelAndView model = new ModelAndView("book");
		return model;
	}// accountLogin
	@RequestMapping(value = "/book", method = RequestMethod.POST)
	public ModelAndView book1() {
		ModelAndView model = new ModelAndView("book");
		return model;
	}// accountLogin
}// ProductController