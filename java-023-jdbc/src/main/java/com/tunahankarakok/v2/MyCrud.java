package com.tunahankarakok.v2;

//SQL   INSERT  - SELECT  - UPDATE - DELETE
//JAVA  CREATE  - READ    - UPDATE - DELETE

import java.sql.*;

public class MyCrud {
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    static final String DB_NAME ="postgresql";
    static final String DB_USERNAME ="postgres";
    static final String DB_PASSWORD ="123456789";
    static final String DB_PORT ="5432";
    static final String DB_IP ="127.0.0.1";//LOCALHOST
    static final String DB_SCHEMA ="companydb";
    static final String DB_URL = "jdbc:postgresql://localhost:5432/postgres?currentSchema=companydb";


    private boolean openConnection() {

        try {

          //  Class.forName("org.postgresql.Driver");
            Class.forName("com.mysql.cj.jdbc.Driver");
/*
            connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/postgres?currentSchema=companydb",
                    "postgres",
                    "123456789");
*/
/*
            connection = DriverManager.getConnection(
                    "jdbc:"+DB_NAME+"://"+DB_IP+":"+DB_IP+"/"+DB_USERNAME+"?currentSchema=companydb",
                    DB_USERNAME,DB_PASSWORD);
  */
            connection = DriverManager.getConnection(//bağlantıyı açtık
                    "jdbc:mysql://localhost:3306/companydb",
                    "root",
                    "123456789");
            return true;
        } catch (SQLException e) {
            System.out.println("Hata: " + e);
            return false;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }


    private boolean closeConnection() {
        try {
       /*             if (resultSet != null) {
                        resultSet.close();
                    }
                    if (preparedStatement != null) {//prepared statement amacı içeriye parametre almaktır
                        preparedStatement.close();
                    }


            if (!connection.isClosed()) {
                connection.close();

            }

        */
            return true;
        } catch (Exception e) {
            System.out.println("Hata: " + e);
            return false;
        }

    }

    //READ (SELECT)
    public ResultSet findFromTableRecordAll(String sql) throws SQLException {
        if (openConnection()) {
            System.out.println("Bağlantı açıldı select. ");
            preparedStatement = connection.prepareCall(sql);
            resultSet = preparedStatement.executeQuery();
            if (closeConnection()) {
                System.out.println("Bağlantı kapatıldı select. ");
            }
            return resultSet;
        } else {
            System.out.println("Bağlantı kapatıldı select. ");
            return null;
        }


    }

    // UPDATE
    public void updateFromTableRecord(String sql) throws SQLException {

        if (openConnection()) {
            System.out.println("Bağlantı açıldı update.");
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();

            if (closeConnection()) {
                System.out.println("Bağlantı kapatıldı update.");
            }

        } else {
            System.out.println("Bağlantı kapalı update.");
        }

    }

    public void deleteFromTableRecord(String sql) throws SQLException {

        if (openConnection()) {
            System.out.println("Bağlantı açıldı delete.");
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();

            if (closeConnection()) {
                System.out.println("Bağlantı kapatıldı delete.");
            }

        } else {
            System.out.println("Bağlantı kapalı delete.");
        }

    }

    public void insertFromTableRecord(String sql) throws SQLException {

        if (openConnection()) {
            System.out.println("Bağlantı açıldı insert.");
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();

            if (closeConnection()) {
                System.out.println("Bağlantı kapatıldı insert.");
            }

        } else {
            System.out.println("Bağlantı kapalı insert.");
        }

    }
}