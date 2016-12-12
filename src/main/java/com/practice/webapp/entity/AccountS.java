package com.practice.webapp.entity;

import java.io.Serializable;
import java.util.ArrayList;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class AccountS implements Serializable {

	private static final long serialVersionUID = 3476619468809859762L;
	private String accountID;
	private String password;
	private int accountLevel;
	
	AccountS() {
		
	}
	
	public String getAccountID() {
		return accountID;
	}

	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getLevel() {
		return accountLevel;
	}

	public void setLevel(int accountLevel) {
		this.accountLevel = accountLevel;
	}
	
	public void cleanup(){
		this.accountID = null;
		this.password = null;
		this.accountLevel = -1;
	}
	
}// AccountS