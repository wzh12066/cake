package com.practice.webapp.dao;

import java.util.List;

import com.practice.webapp.entity.Account;


public interface AccountDAO {
	
	public List<Account> getList();
	
	public void insert(Account aAccount);
	
	public void update(Account aAccount);
	
	public void delete(String accountID);
	
	public boolean identify(boolean check, Account account);
	
	public Account get(Account account);
	
}//ProductDAO

