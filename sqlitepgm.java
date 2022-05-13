package javaprogram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class sqlitepgm {

	public static void main(String[] args) {
		
		
		
		
		String jdbcUrl = "jdbc:sqlite:/C:\\sqlite\\sqlite-tools-win32-x86-3380500\\mydb.db";
		try {
			Connection connection = DriverManager.getConnection(jdbcUrl);
			String sql = "SELECT * FROM movie";
			Statement statement = connection.createStatement();
			ResultSet result = statement.executeQuery(sql);
			while (result.next()) {
				String name = result.getString("moviename");
				String actor = result.getString("actor");
				String actress = result.getString("actress");
				String director = result.getString("director");
				String year = result.getString("year");
				System.out.println(name + actor + actress + director + year);
				
				
				
				
				
			}
			
		} catch (SQLException e) {
			System.out.println("error connecting to SQLite database ");
			e.printStackTrace();
		}
		
		

	}

}
