package com.training.withtransactiousingtransactiontemplate;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

public class JdbcBookShopUsingTransactionTemplate  extends JdbcDaoSupport implements BookShop {
	PlatformTransactionManager transactionManager;
	TransactionTemplate transactionTemplate;
		
	public void setTransactionManager(PlatformTransactionManager transactionManager) {
		this.transactionManager = transactionManager;
	}

	public void purchase(final String isbn, final String userName) {
		transactionTemplate= new TransactionTemplate(transactionManager);
		transactionTemplate.execute(new TransactionCallbackWithoutResult(){

			protected void doInTransactionWithoutResult(TransactionStatus status) {
				
				String selectPriceSql="SELECT PRICE FROM BOOK WHERE ISBN=?";
				int price=getJdbcTemplate().queryForInt(selectPriceSql,new Object[]{isbn});
				System.out.println("Price is "+price);
				String updateBookStockSql="UPDATE BOOK_STOCK SET STOCK=STOCK-1 WHERE ISBN=?";
				getJdbcTemplate().update(updateBookStockSql, new Object[]{isbn});
				String updateAccountSql="UPDATE ACCOUNT SET BALANCE=BALANCE-? WHERE USERNAME=?";
				getJdbcTemplate().update(updateAccountSql, new Object[]{price,userName});
			}
			
		});
		
	}

}
