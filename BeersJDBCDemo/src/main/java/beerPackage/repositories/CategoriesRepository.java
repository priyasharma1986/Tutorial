package beerPackage.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import beerPackage.data.Brewers;
import beerPackage.data.Categories;

public class CategoriesRepository {
	

    private Connection connection = ConnectionFactory.getConnection();
    
    public CategoriesRepository() throws SQLException{
    	  	
    }

    public void createOne(Categories catagories) throws SQLException {
    	
    	  PreparedStatement preparedStatement =
                  connection.prepareStatement
                          ("INSERT INTO Categories(Id, Category) VALUES(?,?);");
          preparedStatement.setInt(1, catagories.getId());
          preparedStatement.setString(2, catagories.getCategory());
          preparedStatement.executeUpdate();
    }

    public Categories findOneById(int id) throws SQLException {
        Statement statement = connection.createStatement();
        String query = "SELECT * FROM Categories WHERE Id ="+id;
        ResultSet resultSet = statement.executeQuery(query);
        Categories catagories = null;
        while (resultSet.next()){
        	catagories = new Categories(resultSet.getInt("Id"), resultSet.getString("Category"));
        }
        return catagories;
    }
    
    public List<Categories> findAll() throws SQLException {
        Statement statement = connection.createStatement();
        String query = "SELECT * FROM Categories";
        ResultSet resultSet = statement.executeQuery(query);
        List<Categories> categoriesList = new ArrayList<Categories>();
        while (resultSet.next()){
        	categoriesList.add(new Categories(resultSet.getInt("Id"), resultSet.getString("Category")));
        }
        return  categoriesList;
    }
    
    public void updateOne(Categories categories, int id) throws SQLException {
   	 PreparedStatement preparedStatement =
                connection.prepareStatement
                        ("UPDATE Categories SET Id=?,Category=? WHERE Id =?;");
        preparedStatement.setInt(1, categories.getId());
        preparedStatement.setString(2, categories.getCategory());
        preparedStatement.setInt(5, id);
        preparedStatement.executeUpdate();

    }
    

    public  void deleteOne(int id) throws SQLException {
        Statement statement = connection.createStatement();
        String query = "DELETE FROM Categories Where id="+id+";";
        statement.executeUpdate(query);

    }
    
}

