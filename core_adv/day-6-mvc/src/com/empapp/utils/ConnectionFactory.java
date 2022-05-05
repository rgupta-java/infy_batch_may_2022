package com.empapp.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;

//this class is called connection factory
public class ConnectionFactory {

	private static Connection connection = null;

	// using apache framework for reading prop file
	public static Connection getConnection() {
		PropertiesConfiguration config = null;

		Configurations configurations = new Configurations();
		try {
			config = configurations.properties("db.properties");
		} catch (ConfigurationException e2) {
			e2.printStackTrace();
		}

		String driverName = (String) config.getProperty("jdbc.driver");
		String url = (String) config.getProperty("jdbc.url");
		String username = (String) config.getProperty("jdbc.username");
		String password = (String) config.getProperty("jdbc.password");

		try {
			Class.forName(driverName);// this is dynamic class loading
			System.out.println("driver is loaded");
		} catch (ClassNotFoundException ex) {
			System.out.println("driver loading is not working");
		}

		try {
			connection = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return connection;
	}

	// using properties
//	public static Connection getConnection() {
//		/*
//		 * I need to load the property file and pick the key corrosponding values
//		 * for doing the same operation to read the prop we have a framework
//		 */
//		
//		Properties prop=new Properties();//aka hashtable,,used to load prop file
//		InputStream is;
//		try {
//			is = new FileInputStream("db.properties");
//			prop.load(is);//this will get key and values
//		} catch (IOException e1) {
//			e1.printStackTrace();
//		}
//		
//		String driverName=prop.getProperty("jdbc.driver");
//		String url= prop.getProperty("jdbc.url");
//		String username= prop.getProperty("jdbc.username");
//		String password= prop.getProperty("jdbc.password");
//		
//		
//		
//		try {
//			Class.forName(driverName);// this is dynamic class loading
//			System.out.println("driver is loaded");
//		} catch (ClassNotFoundException ex) {
//			System.out.println("driver loading is not working");
//		}
//		
//		try {
//			connection = DriverManager.getConnection(url,username, password);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		return connection;
//	}

//	public static Connection getConnection() {
//		try {
//			Class.forName("com.mysql.jdbc.Driver");// this is dynamic class loading
//			System.out.println("driver is loaded");
//		} catch (ClassNotFoundException ex) {
//			System.out.println("driver loading is not working");
//		}
//		
//		try {
//			connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/infy2?useSSL=false",
//					"root", "root");
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		return connection;
//	}

}
