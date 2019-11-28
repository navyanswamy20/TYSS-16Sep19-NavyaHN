package com.tyss.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class SelectTryWithResources {
	public static void main(String[] args) {
		try(FileReader reader = new FileReader("db.properties")){
			Properties prop = new Properties();
			prop.load(reader);

			Class.forName(prop.getProperty("driver-class-name"));
			String url = prop.getProperty("url");
			String sql = prop.getProperty("select-query");
			try(Connection conn= DriverManager.getConnection(url, prop);
					Statement stmt = conn.createStatement();
					ResultSet res = stmt.executeQuery(sql)){
				while(res.next()) {
					System.out.println("id is = "+res.getInt("id"));
					System.out.println("name is = "+res.getString("name"));
					System.out.println("salary is = "+res.getInt("sal"));
					System.out.println("gender is = "+res.getString("gender"));
				}
			}

			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
