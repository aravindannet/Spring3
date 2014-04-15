package com.training.transactionwithannotations;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class JdbcBookShop  extends JdbcDaoSupport implements BookShop {
		
	@Transactional(propagation=Propagation.REQUIRED)
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
