package com.training.derby;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class CreateTable {
	
	private DataSource dataSource;
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void drop() throws SQLException{
		String sql1="DROP TABLE  BOOK";
		String sql2="DROP TABLE  BOOK_STOCK";
		String sql3="DROP TABLE  ACCOUNT";
		JdbcTemplate jdbcTemplate= new JdbcTemplate(dataSource);
		jdbcTemplate.execute(sql1);
		jdbcTemplate.execute(sql2);
		jdbcTemplate.execute(sql3);
	}
	public void create() throws SQLException{
		String sql1="CREATE TABLE BOOK (ISBN VARCHAR(50) NOT NULL," +
				"BOOK_NAME VARCHAR(100) NOT NULL,PRICE INT,PRIMARY KEY (ISBN))";
		String sql2="CREATE TABLE BOOK_STOCK ( ISBN VARCHAR(50) NOT NULL," +
				"STOCK INT NOT NULL,PRIMARY KEY (ISBN),CHECK (STOCK >= 0))";
		String sql3="CREATE TABLE ACCOUNT (USERNAME VARCHAR(50) NOT NULL," +
				"BALANCE INT NOT NULL,PRIMARY KEY (USERNAME)," +
				"CHECK (BALANCE >= 0))";
		
		JdbcTemplate jdbcTemplate= new JdbcTemplate(dataSource);
		jdbcTemplate.execute(sql1);
		jdbcTemplate.execute(sql2);
		jdbcTemplate.execute(sql3);
	}
	
	public void insert(){
		String sql1="insert into book(ISBN,BOOK_NAME,PRICE) values('0001','THE FIRST BOOK',30)";
		String sql2="insert into book_stock(ISBN,STOCK) VALUES('0001',10)";
		String sql3="insert into ACCOUNT(USERNAME,BALANCE) VALUES('user1',20)";
		JdbcTemplate jdbcTemplate= new JdbcTemplate(dataSource);
		jdbcTemplate.update(sql1);
		jdbcTemplate.update(sql2);
		jdbcTemplate.update(sql3);
	}
	
	public void display(){
		displayBooks();
		displayBooksTock();
		displayAccount();
	}
	public void displayBooks(){
		String sql="select * from book";
		JdbcTemplate jdbcTemplate= new JdbcTemplate(dataSource);
		List<Book> books=jdbcTemplate.query(sql, new BeanPropertyRowMapper(Book.class));
		System.out.println("==================Books Table =================");
		System.out.println(" ISBN      BookName         Price");
		System.out.println("================================================");
		for(Book book:books){
			System.out.println(book.getIsbn()+"         "+book.getBookName()+"        "+book.getPrice());			
		}
	}
	public void displayBooksTock(){
		String sql="select * from book_stock";
		JdbcTemplate jdbcTemplate= new JdbcTemplate(dataSource);
		List<BookStock> bookstocks=jdbcTemplate.query(sql, new BeanPropertyRowMapper(BookStock.class));
		System.out.println("==================BookStock Table =================");
		System.out.println("  ISBN          STOCK");
		System.out.println("====================================================");
		for(BookStock bookStock:bookstocks){
			System.out.println(bookStock.getIsbn()+"            "+bookStock.getStock());			
		}
	}
	public void displayAccount(){
		String sql="select * from ACCOUNT";
		JdbcTemplate jdbcTemplate= new JdbcTemplate(dataSource);
		List<Account> accounts=jdbcTemplate.query(sql, new BeanPropertyRowMapper(Account.class));
		System.out.println("==================Account Table =================");
		System.out.println("  UserName           BAlance");
		System.out.println("====================================================");
		for(Account account:accounts){
			System.out.println(account.getUserName()+"            "+account.getBalance());			
		}
	}

}
