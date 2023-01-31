package com.hoda.estore.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DB {
	private final String DB_URL="jdbc:mysql://localhost:3306/estore";
	private final String DB_USERNAME="devuser";
	private final String DB_PASSWORD="dev1836";
	
	private Connection connection;
	private Statement statement;
	
	// Initial and Register the Driver class
	public DB() {
		try {
			getClass().forName("com.mysql.cj.jdbc.Driver");
			System.out.println("-- JDBC Driver Loaded. --");
		} catch (Exception e) {
			System.out.println("-- Something Went Wrong: -- "+e);
		}
	}
	
	// Initialize DB Connection
		public void init() {
			try {
				connection = DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
				statement = connection.createStatement();
				System.out.println("-- Connection established. --");
			} catch (Exception e) {
				System.out.println("-- Something Went Wrong: -- "+e);
			}
		}
		
		// Close DB Connection
		public void destroy() {
			try {
				if(connection!=null) {
					connection.close();
					connection = null;
					System.out.println("-- Connection closed. --");
				}
			} catch (Exception e) {
				System.out.println("-- Something Went Wrong: -- "+e);
			}
		}
		
		public Connection getConnection() {
			return connection;
		}
		
		//select query
		public ResultSet executeQuery(String sql) {
			ResultSet rs = null;
			try {
				System.out.println(" executing query " + sql);
				rs = statement.executeQuery(sql);
				System.out.println(" query executed successfully ");
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("-- Something Went Wrong: -- "+e);
			}
			return rs;
			
		} 
		
		//update(save, delete) query
		public int executeUpdate(String sql) {
			int result = 0;
			try {
				System.out.println(" executing query " + sql);
				result = statement.executeUpdate(sql);
				System.out.println(" query executed successfully ");
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("-- Something Went Wrong: -- "+e);
			}
			return result;
		}
		
		

}
