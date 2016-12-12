package com.practice.webapp.dao;

import java.util.List;

import com.practice.webapp.entity.Cake;

public interface CakeDAO {
	
	public void insert(Cake aCake);
	public void delete(Cake aCake);
	public void update(Cake aCake);
	public List<Cake> getList();
	public List<Cake> getReorderList();
	public List<Cake> getAvailableList();
	public Cake get(Cake aCake);
	

}