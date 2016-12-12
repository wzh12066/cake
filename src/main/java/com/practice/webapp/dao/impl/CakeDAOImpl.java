package com.practice.webapp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

//import com.mysql.jdbc.Statement;
import com.practice.webapp.entity.Cake;
import com.practice.webapp.dao.CakeDAO;

public class CakeDAOImpl implements CakeDAO{
	private DataSource dataSource;
	private Connection conn = null ;
	private ResultSet rs = null ;
	private PreparedStatement smt = null ;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void insert(Cake aCake) {

		// remove first parameter when Id is auto-increment
	    String sql = "INSERT INTO cake (cakeName, cakeCost, cakePrice, pruductQuantity) VALUES(?, ?, ?, ?)";	
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setString(1, aCake.getCakeName());
			smt.setDouble(2, aCake.getCakeCost());
			smt.setDouble(3, aCake.getCakePrice());
			smt.setInt(4, aCake.getPruductQuantity());
			smt.executeUpdate();
			smt.close();
 
		} catch (SQLException e) {
			throw new RuntimeException(e);
 
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {}
			}
		}
		
	}

	public void delete(Cake aCake) {
		
		String sql = "DELETE FROM cake WHERE cakeName = ?";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setString(1, aCake.getCakeName());
			smt.executeUpdate();
			smt.close();
 
		} catch (SQLException e) {
			throw new RuntimeException(e);
 
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {}
			}
		}
	}

	public void update(Cake aCake) {
		
		String sql = "UPDATE cake SET cakeName=?, cakeCost=?, cakePrice=?, pruductQuantity=? "
				+ "WHERE cakeName = ?";
		System.out.print("Fuck"+aCake.getCakeName());
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setString(1, aCake.getCakeName());
			smt.setDouble(2, aCake.getCakeCost());
			smt.setDouble(3, aCake.getCakePrice());
			smt.setInt(4, aCake.getPruductQuantity());
			smt.setString(5, aCake.getCakeName());
			smt.executeUpdate();			
			smt.close();
 
		} catch (SQLException e) {
			throw new RuntimeException(e);
 
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {}
			}
		}
		
	}
	
	/*public List<Cake> getAvailableList() {
		String sql = "SELECT * FROM Cake WHERE pruductQuantity > 0";
		return getList(sql);
	}
	

	public List<Cake> getReorderList() {
		String sql = "SELECT * FROM Cake WHERE Inventory < ReorderPoint";
		return getList(sql);
	}*/

	public List<Cake> getList() {
		String sql = "SELECT * FROM cake";
		return getList(sql);
	}

	// make it a generic method for different conditions
	public List<Cake> getList(String sql) {
		
		List<Cake> CakeList = new ArrayList<Cake>();
		//will need this part later
		/*
		String sql = "SELECT * FROM article a "
				+ "JOIN article_category b ON a.articleCategoryID = b.articleCategoryID "
				+ "ORDER BY articleID DESC";
		*/
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			rs = smt.executeQuery();
			while(rs.next()){
				Cake aCake = new Cake();
				aCake.setCakeName(rs.getString("cakeName"));			
				aCake.setCakeCost(rs.getDouble("cakeCost"));
				aCake.setCakePrice(rs.getDouble("cakePrice"));
				aCake.setPruductQuantity(rs.getInt("pruductQuantity"));
				CakeList.add(aCake);
			}
			rs.close();
			smt.close();
 
		} catch (SQLException e) {
			throw new RuntimeException(e);
 
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {}
			}
		}
		return CakeList;
	}

	public Cake get(Cake aCake) {
		System.out.print("Fuck"+aCake.getCakeName());
		String sql = "SELECT * FROM cake WHERE cakeName = ?";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setString(1, aCake.getCakeName());
			rs = smt.executeQuery();
			if(rs.next()){
				aCake.setCakeName(rs.getString("cakeName"));			
				aCake.setCakeCost(rs.getDouble("cakeCost"));
				aCake.setCakePrice(rs.getDouble("cakePrice"));
				aCake.setPruductQuantity(rs.getInt("pruductQuantity"));
			}
			rs.close();
			smt.close();
 
		} catch (SQLException e) {
			throw new RuntimeException(e);
 
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {}
			}
		}
		return aCake;
	}

	@Override
	public List<Cake> getReorderList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cake> getAvailableList() {
		// TODO Auto-generated method stub
		return null;
	}


}
