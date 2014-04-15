package com.training.withtrainsactionusingtransactionmanager;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

public class TransactionalJdbcBookShop  extends JdbcDaoSupport implements BookShop {
	PlatformTransactionManager transactionManager;
		
	public void setTransactionManager(PlatformTransactionManager transactionManager) {
		this.transactionManager = transactionManager;
	}

	public void purchase(String isbn, String userName) {
		TransactionDefinition definition= new DefaultTransactionDefinition();
		TransactionStatus status =transactionManager.getTransaction(definition);
		try{
		String selectPriceSql="SELECT PRICE FROM BOOK WHERE ISBN=?";
		int price=getJdbcTemplate().queryForInt(selectPriceSql,new Object[]{isbn});
		System.out.println("Price is "+price);
		String updateBookStockSql="UPDATE BOOK_STOCK SET STOCK=STOCK-1 WHERE ISBN=?";
		getJdbcTemplate().update(updateBookStockSql, new Object[]{isbn});
		String updateAccountSql="UPDATE ACCOUNT SET BALANCE=BALANCE-? WHERE USERNAME=?";
		getJdbcTemplate().update(updateAccountSql, new Object[]{price,userName});
		transactionManager.commit(status);
		}catch(Exception e){
			transactionManager.rollback(status);
			e.printStackTrace();
		}
	}

}
