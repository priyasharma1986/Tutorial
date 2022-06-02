package be.intecbrussels;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("JDBC Connection");
         /*
           
          * 3 delen:
          * Database url: jdbc:mysql://adrressOfdatabse:port/database
          * Username: your username
          * Password: your password
           
          */
		
		String url = "moktok.intecbrussel.org";
		String port = "33062";
		String database = "JAVAJANPriyanka";
		
		String databaseURL = String.format("jdbc:mysql://%s:%s/%s",url,port,database );
		
		try {
			
			Connection  connection = DriverManager.getConnection(databaseURL, "JAVAJANPriyanka", scanner.nextLine());
			System.out.println(connection.isValid(5));
		
			String query = "SELECT * FROM Brewers WHERE Turnover > 5000;";
			
			PreparedStatement statement = connection.prepareStatement(query);
			ResultSet resultSet = statement.executeQuery();
			
			
			while(resultSet.next()) {
				
				int Id = resultSet.getInt("Id");
				int turnover = resultSet.getInt("turnover");
				
				System.out.println("ID: " + Id + " - Turnover: " + turnover);
				
			}
		
			
		} catch (SQLException exception) {
			exception.printStackTrace();
			
		}
		
		}
		

}
