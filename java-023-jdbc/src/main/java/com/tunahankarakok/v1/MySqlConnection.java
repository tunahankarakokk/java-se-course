package com.tunahankarakok.v1;

import java.sql.*;

public class MySqlConnection {
    public static void main(String[] args) {
        Connection  connection = null;//bağlantı kurmak için
        Statement statement = null; //bağlantının SELECT,INSERT,DELETE GİBİ bir cümlesini belirlerim
        ResultSet resultSet = null; //bağlantı sonucumu getiririm
        String sqlAllCustomers = "SELECT * FROM customers";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");//java eski sürümlerinde bunu kullanmam lazım

            connection = DriverManager.getConnection(//bağlantıyı açtık
                            "jdbc:mysql://localhost:3306/companydb",
                            "root",
                            "123456789");

            statement = connection.createStatement();//statement nesnesini oluşturduk


            resultSet = statement.executeQuery(sqlAllCustomers);// SQL sorgusu çalıştırma

            // Sonuç setini işleme
            while(resultSet.next()){
                System.out.println(
                        resultSet.getString("customer_id") + " " +
                        resultSet.getString("first_name") + " "  +
                        resultSet.getString("last_name"));
            }
        }catch (SQLException e){
            System.out.println("Hata : " + e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            // Kaynakları kapatma
            try{
                if(resultSet != null || statement != null || connection!= null){//bu kod daha iyi olabilir
                    resultSet.close();
                    statement.close();
                    connection.close();
                }
            }catch (SQLException e){
                System.out.println("Hata : " + e);
            }

        }


    }
}