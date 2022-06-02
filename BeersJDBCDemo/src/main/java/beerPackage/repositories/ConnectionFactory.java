package beerPackage.repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public static Connection getConnection() throws SQLException{
		
		return DriverManager.getConnection("jdbc:mysql://db.intecbrussel.be:33100/student01", 
				"student01", "student2452");

		
	}

}
