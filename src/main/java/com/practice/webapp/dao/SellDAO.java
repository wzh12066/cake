package com.practice.webapp.dao;


import java.sql.SQLException;
import java.util.List;

import com.practice.webapp.entity.AccountS;
import com.practice.webapp.entity.Check;
import com.practice.webapp.entity.Sell;


public interface SellDAO {	
	
	public void updateNum(Sell aProduct, int qty);
	public List<Sell> getList();
	

}
