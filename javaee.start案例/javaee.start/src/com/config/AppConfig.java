package com.config;

import java.util.Properties;

public class AppConfig {

	private static Properties prop = new Properties();

	static {
		try {
			prop.load(AppConfig.class.getResourceAsStream("jdbc.properties"));
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static final String USERNAME = prop.getProperty("username");
	public static final String PASSWORD = prop.getProperty("password");
	public static final String URL = prop.getProperty("url");
	public static final String DRIVER_CLASS = prop.getProperty("driver");

}
