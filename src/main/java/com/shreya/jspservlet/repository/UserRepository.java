package com.shreya.jspservlet.repository;

import com.shreya.jspservlet.connection.DbConnection;
import com.shreya.jspservlet.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserRepository {
    public boolean isValidUser(User user){

        String query = "INSERT INTO users ( username, password) VALUES (?, ?)";

        try (Connection connection = new DbConnection().getConnection();  // GET connection here
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, user.getUsername());
            preparedStatement.setString(2, user.getPassword());

            return preparedStatement.executeUpdate() > 0;

        } catch (SQLException e) {
            throw new RuntimeException("Error inserting customer: " + e.getMessage(), e);
        }
    }
}

