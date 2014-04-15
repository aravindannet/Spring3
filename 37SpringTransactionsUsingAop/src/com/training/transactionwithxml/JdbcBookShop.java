package com.training.transactionwithxml;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class JdbcBookShop  extends JdbcDaoSupport implements BookShop {
		
	public void purchase(String isbn, String userName) {
		String selectPriceSql="SELECT PRICE FROM BOOK WHERE ISBN=?";
		
		int price=getJdbcTemplate().queryForInt(selectPriceSql,new Object[]{isbn});
		System.out.println("Price is "+price);
		
		String updateBookStockSql="UPDATE BOOK_STOCK SET STOCK=STOCK-1 WHERE ISBN=?";
		getJdbcTemplate().update(updateBookStockSql, new Object[]{isbn});
		
		String updateAccountSql="UPDATE ACCOUNT SET BALANCE=BALANCE-? WHERE USERNAME=?";
		getJdbcTemplate().update(updateAccountSql, new Object[]{price,userName});
	}

}
