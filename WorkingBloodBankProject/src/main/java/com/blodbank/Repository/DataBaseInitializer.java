package com.blodbank.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDate;

@Repository
public class DataBaseInitializer {
    @Autowired
    private DataSource dataSource;
    public DataBaseInitializer(){
    }
    public DataBaseInitializer(DataSource dataSource){
        this.dataSource=dataSource;
    }
    public void print(){
        System.out.println("checking table creation");
    }

//    public void createTable() throws SQLException {
//        try {
//            Connection connection = dataSource.getConnection();
//
//            Statement statement = connection.createStatement();
//
//            String query = "CREATE TABLE user1 (\n" +
//                    "  id bigint AUTO_INCREMENT,\n" +
//                    "  username varchar(15), \n" +
//                    "  name varchar(40) ,\n" +
//                    "  dob DATE,\n" +
//                    "  role_alias varchar(255) ,\n" +
//                    "  password varchar(100) ,\n" +
//                    "  PRIMARY KEY (id)\n" +
//                    ");";
//            System.out.println(query);
//            statement.execute(query);
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }


    public void insert(String username, String name, LocalDate dob, String role, String password) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = dataSource.getConnection();
            System.out.println("insert method");

            // Prepare the SQL statement with placeholders
            String sql = "INSERT INTO user1 (username, name, dob, role_alias, password) VALUES (?, ?, ?,?, ?)";
            preparedStatement = connection.prepareStatement(sql);

            // Set values for the prepared statement
//            preparedStatement.setString(1, "1");
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, name);
            preparedStatement.setDate(3, Date.valueOf(dob)); // Assuming dob is a LocalDate
            preparedStatement.setString(4, role);
            preparedStatement.setString(5, password);

            // Execute the statement
            preparedStatement.executeUpdate();
        } finally {
            // Close the prepared statement and connection in a finally block
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
    }
}