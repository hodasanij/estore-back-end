package com.hoda.estore.utility;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.sql.ResultSet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DBTest {
	DB db;
	
	@BeforeEach
	public void setUp() {
		//make an instance of DB, instantiate the driver class
		db = new DB();
		
	}
	
	//start writing test case
	//testConnection method evaluate will evaluate test case
	//@displayName is just a label
	
	@Test
	@DisplayName("DB Connection Test")
	public void testConnection1() {
		
		//initialize the connection
		db.init();
		//check the connection not to be null
		assertNotNull(db.getConnection());
	}
	
	@Test
	@DisplayName("DB closing Connection Test")
	public void testConnection2() {
		db.init();
		db.destroy();
		assertNull(db.getConnection());
	}
	
	@Test
	@DisplayName("selection query Test")
	public void testConnection3() {
		db.init();
		ResultSet res = db.executeQuery("select * from products");
		assertNotNull(res);
	}
	
	@Test
	@DisplayName("update query Test")
	public void testConnection4() {
		db.init();
		int res = db.executeUpdate("insert into products(productId,productTitle) values (1, 'Mac Book Pro')");
		assertNotNull(res);
	}


}
