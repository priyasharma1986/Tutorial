package beerPackage.repositories;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import beerPackage.data.Beers;
import beerPackage.data.Brewers;

public class BrewersRepository {
	
	private Connection connection = ConnectionFactory.getConnection();
	
    public BrewersRepository () throws SQLException{
		
	}

    
    public void creatOne(Brewers brewers) throws SQLException {
    

       PreparedStatement preparedStatement =
               connection.prepareStatement
                       ("INSERT INTO Beers(Id, Name) VALUES(?,?);");
       preparedStatement.setInt(1, brewers.getId());
       preparedStatement.setString(2, brewers.getName());
       preparedStatement.executeUpdate();
    	
    }
    
    public Brewers findOneById(int id) throws SQLException {
    	
    	Statement statement = connection.createStatement();
        String query = "SELECT * FROM Brewers WHERE Id ="+id;
        ResultSet resultSet = statement.executeQuery(query);
        Brewers brewers = null;
        while (resultSet.next()){
        	brewers = new Brewers(resultSet.getString("Name"),resultSet.getInt("Id"));
        }
        return brewers;
    	
    }
    
    public List<Brewers> findAll() throws SQLException {
    	Statement statement = connection.createStatement();
        String query = "SELECT * FROM Brewers";
        ResultSet resultSet = statement.executeQuery(query);
        List<Brewers> brewersList = new ArrayList<Brewers>();
        while (resultSet.next()){
            brewersList.add(new Brewers(resultSet.getString("Name"), resultSet.getInt("Id")));
        }
        return  brewersList;
    }
    
    public void updateOne(Brewers brewers, int id) throws SQLException {
    	 PreparedStatement preparedStatement =
                 connection.prepareStatement
                         ("UPDATE Brewers SET Id=?,Name=? WHERE Id =?;");
         preparedStatement.setInt(1, brewers.getId());
         preparedStatement.setString(2, brewers.getName());
         preparedStatement.setInt(5, id);
         preparedStatement.executeUpdate();


    	
    }
    
    
    public  void deleteOne(int id) throws SQLException {
    	
    	Statement statement = connection.createStatement();
        String query = "DELETE FROM Brewers Where id="+id+";";
        statement.executeUpdate(query);
    	
    }
    
    
    
    
    
    
}
