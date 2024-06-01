package com.tunahankarakok.v2;


import java.sql.*;

// SQL INSERT - SELECT - UPDATE - DELETE
//JAVA CREATE - READ   - UPDATE - DELETE
public class MyCrud {

    Connection connection = null;
    PreparedStatement preparedstatement = null;
    ResultSet resultSet = null;
    private boolean openConnection() {
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(
                    //"jdbc:postgresql://127.0.0.1:5432/postgres",
                    "jdbc:postgresql://localhost:5432/postgres?currentSchema=companydb",
                    "postgres", "123456789");

            return true;

        } catch (SQLException e) {
            System.out.println("Hata : " + e);
            return false;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private boolean closeConnection(){
            try{
                if(resultSet != null){
                    resultSet.close();
            }
                if(preparedstatement != null){
                    preparedstatement.close();
                }
                if(connection != null){
                    connection.close();

                }
                return true;
            }catch (SQLException e){
                System.out.println("Hata : " + e);
                return false;
        }

    }



    public ResultSet findFromResultALl (String sql) throws SQLException {
        if(openConnection()){
            System.out.println("Bağlantı Açıldı.");

            preparedstatement = connection.prepareStatement(sql);

            resultSet = preparedstatement.executeQuery();

        }

        if(closeConnection()){
            System.out.println("Bağlantı Kapatıldı");
        }

        return resultSet;

    }


}

