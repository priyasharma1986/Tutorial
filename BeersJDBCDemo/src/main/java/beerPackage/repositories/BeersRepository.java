package beerPackage.repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import beerPackage.data.Beers;

public class BeersRepository {
	
	private Connection connection = ConnectionFactory.getConnection(); //DriverManager.getConnection("jdbc:mysql://db.intecbrussel.be:33100/student01", "student01", "student2452");

	public BeersRepository () throws SQLException{
		
	}
	
	
	public void creatOne(Beers beers) throws SQLException {
		/*
		Statement statemnt = connection.createStatement();
		String query = "INSERT INTO Beers(Id,Name,BrewerId, CategoryId) VALUES (" +beers.getId()+",'"
				+ " "+beers.getName()+ " ' ,"+ beers.getBrewerId()+","+ beers.getCategory
		
		statement.executeUpdate(query);
		*/
		
		PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO Beers(Id, Name,BrewerId, CategoryId) VALUES(?,?,?,?);");
		
		preparedStatement.setInt(1, beers.getId());
		preparedStatement.setString(2, beers.getName());
		preparedStatement.setInt(3, beers.getBrewerId());
		preparedStatement.setInt(4, beers.getCategoryId());
		preparedStatement.executeUpdate();

		
	}
	
	public Beers findOneById(int id) throws SQLException {
		
		Statement statement = connection.createStatement();
		String query = "SELECT * FROM Beers WHERE Id = "+id;
		ResultSet resultSet = statement.executeQuery(query);
		Beers beers = null;
		
		while(resultSet.next()) {
			beers = new Beers(resultSet.getInt("Id"), resultSet.getString("Name"),resultSet.getInt("BrewerId"),
					resultSet.getInt("CategoryId"));
		}
		
		return beers;
	}
	
	
	public List<Beers> findAll() throws SQLException{
		Statement statement = connection.createStatement();
		String query = "SELECT * FROM Beers";
		ResultSet resultSet = statement.executeQuery(query);
        List<Beers> beersList = new ArrayList<Beers>();
		    while (resultSet.next()){
		        beersList.add(new Beers(resultSet.getInt("Id"), resultSet.getString("Name"),
		        		resultSet.getInt("BrewerId"), resultSet.getInt("CategoryId")));
		}
		
		return beersList;
		
	}
	public void updateOne(Beers beers, int id) throws SQLException {
		
PreparedStatement preparedStatement = connection.prepareStatement("UPDATE  Beers SET Id = ?, Name = ?,BrewerId = ?, WHERE Id = ?;");
		
		preparedStatement.setInt(1, beers.getId());
		preparedStatement.setString(2, beers.getName());
		preparedStatement.setInt(3, beers.getBrewerId());
		preparedStatement.setInt(4, beers.getCategoryId());
		preparedStatement.executeUpdate();

		
	}
	
	public void deleteOne(int id) throws SQLException {
		
		Statement statement = connection.createStatement();
		
		String query = "DELETE FROM Beers Where id = " +id +";";
		

	}
	
	
	
	
}
