package com.maximus.qicportaltestautomation.qic_app_manager;

import java.sql.*;

public class QicDbConnector {
    private Connection connection = null;
    private Statement statement = null;
    private ResultSet resultSet = null;
    private String dbUrl;
    private String dbUserName;
    private String dbPassword;


    public QicDbConnector(String dbUrl, String dbUserName, String dbPassword) {
        this.dbUrl = dbUrl;
        this.dbUserName = dbUserName;
        this.dbPassword = dbPassword;

    }

    public void initializeDbConnection() throws SQLException, ClassNotFoundException {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
        statement = connection.createStatement();
    }

    public ResultSet executeQuery(String query) {
        try {
            resultSet = statement.executeQuery(query);
            resultSet.next();
            return resultSet;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    public void closeDbConnAll() {
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
