package com.practice.webapp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

//import com.cake.entity.Admin;
import com.practice.webapp.dao.AccountDAO;
import com.practice.webapp.entity.Account;

public class AccountDAOImpl implements AccountDAO {

	private DataSource dataSource;
	private Connection conn = null;
	private ResultSet rs = null;
	private PreparedStatement smt = null;

	

	// private static int count=0;
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public List<Account> getList() {
		String sql = "SELECT * FROM account";
		return getList(sql);
	}

	// make it a generic method for different conditions
	public List<Account> getList(String sql) {

		List<Account> AccountList = new ArrayList<Account>();

		try {

			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			rs = smt.executeQuery();
			while (rs.next()) {

				Account aAccount = new Account();

				aAccount.setAccountID(rs.getString("accountID"));
				aAccount.setPassword(rs.getString("password"));
				aAccount.setAccountLevel(rs.getInt("accountLevel"));

				AccountList.add(aAccount);
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
		return AccountList;
	}

	public void insert(Account aAccount) {

		// remove first parameter when Id is auto-increment
		String sql = "INSERT INTO account (accountID, password, accountLevel) VALUES(?, ?, ?)";
		try {

			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setString(1, aAccount.getAccountID());
			smt.setString(2, aAccount.getPassword());
			smt.setInt(3, 2);
			smt.executeUpdate();
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

	}

	public void update(Account aAccount) {
		System.out.print("aAccount.getAccountID() = " + aAccount.getAccountID());
		String sql = "UPDATE account SET password=? WHERE accountID = ?";
		try {

			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setString(1, aAccount.getPassword());
			smt.setString(2, aAccount.getAccountID());
			smt.executeUpdate();
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

	}

	public void delete(String accountID) {

		String sql = "DELETE FROM account WHERE accountID = ?";
		try {

			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setString(1, accountID);
			smt.executeUpdate();
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
	}

	public int count() {
		// String sql = "SELECT COUNT(*) FROM account";
		String sql = "SELECT COUNT(*) AS count FROM account";

		int count = -1;
		try {

			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			rs = smt.executeQuery();
			while (rs.next()) {
				count = rs.getInt(rs.getInt("count"));
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
		return count; // no longer needed
	}

	public Account get(Account account) {

		String sql = "SELECT * FROM account WHERE accountID = ?";

		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setString(1, account.getAccountID());
			rs = smt.executeQuery();
			if (rs.next()) {

				account.setAccountID(rs.getString("accountID"));
				account.setPassword(rs.getString("password"));
				account.setAccountLevel(rs.getInt("accountLevel"));

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
		return account;
	}

	public boolean identify(boolean check, Account account) {
		String sql = "SELECT * FROM account";
		check = false;
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			rs = smt.executeQuery();
			String Account = account.getAccountID();
			String Password = account.getPassword();
			while (rs.next()) {
				String checkAccount = rs.getString("accountID");
				String checkPassword = rs.getString("password");
				if (Account.equals(checkAccount) && Password.equals(checkPassword)) {
					check = true;
					break;
				}
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
		return check;
	}
	
}// ProductDAOBean