package com.practice.webapp.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Calendar;
import javax.sql.DataSource;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.practice.webapp.entity.AccountS;
import com.practice.webapp.entity.Sell;

import com.practice.webapp.dao.SellDAO;

class SellDAOImpl implements SellDAO {
	private DataSource dataSource;
	private Connection conn = null;
	private ResultSet rs = null;
	private PreparedStatement smt = null;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void updateNum(Sell aProduct, int qty) {

		// remove first parameter when Id is auto-increment
		String sql = "UPDATE sell SET sell_num = sell_num + ? WHERE cake_name = ?";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setString(2, aProduct.getCake_name());
			smt.setInt(1, qty);
			smt.executeUpdate();
			smt.close();
			// System.out.println("id ="+aProduct.getId());

		} catch (SQLException e) {
			throw new RuntimeException(e);

		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
				}
			}
		}

	}

	public List<Sell> getList() {
		String sql = "SELECT * FROM sell";
		List<Sell> poList = new ArrayList<Sell>();

		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			rs = smt.executeQuery();
			while (rs.next()) {
				poList.add(getPO(rs));
			}
			rs.close();
			smt.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);

		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
				}
			}
		}
		return poList;
	}

	public Sell getPO(ResultSet rs) throws SQLException {
		try {
			Sell aPO = new Sell();
			aPO.setCake_name(rs.getString("cake_name"));
			aPO.setPrice(rs.getInt("price"));
			aPO.setSell_num(rs.getInt("sell_num"));

			return aPO;
		} // try
		catch (SQLException e) {
			throw e;
		}
	} // getPO

}