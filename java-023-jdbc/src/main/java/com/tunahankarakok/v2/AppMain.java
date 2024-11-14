package com.tunahankarakok.v2;


//SQL   INSERT  - SELECT  - UPDATE - DELETE
//JAVA  CREATE  - READ    - UPDATE - DELETE

import javax.xml.transform.Result;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AppMain {
    static final String QUERY_SELECT_CUSTOMERS_ALL = "SELECT * FROM customers";
    static final String QUERY_SELECT_CUSTOMERS_BY_ID_ASC = "SELECT * FROM customers ORDER BY id ASC";
    static final String QUERY_SELECT_CUSTOMERS_BY_ID_DESC = "SELECT * FROM customers ORDER BY id DESC";

    static final String QUERY_UPDATE_CUSTOMERS_ALL_BY_YENI = """
            UPDATE customers
            SET
            first_name= 'Aşkın',
            last_name= 'Hanım'
            WHERE customer_id=1;
            """;
    //YENİ USUL KOD
    static final String QUERY_UPDATE_CUSTOMERS_ALL_BY_ID = "UPDATE customers " +
            "SET " +
            "first_name   = 'Aşkın'," +
            "last_name    = 'Hanım' " +
            "WHERE  customer_id=1; ";


    static final String QUERY_INSERT_NEW_CUSTOMER = "INSERT INTO customers(first_name,last_name) VALUES ('Samet','Furkan');";

    static final String QUERY_DELETE_CUSTOMER_BY_ID = "DELETE FROM customers WHERE customer_id=1;";
//staticleri doğrudan çağırabilmek için koyuyoruz static olmasa bu sınıf tipinde nesne oluşturup AppMain nesnesi üzerinden çağırmalıydık
    //bu işlem staticden daha masraflı birşey o yüzden static yapmak daha mantıklı


    public static void main(String[] args) throws SQLException {


        MyCrud myCrud = new MyCrud();

        System.out.println("SELECT -----------------");
        ResultSet resultSet = myCrud.findFromTableRecordAll(QUERY_SELECT_CUSTOMERS_ALL);

        if (resultSet != null) {
            while (resultSet.next()) {
                System.out.println(resultSet.getString("customer_id")
                        + "-" + resultSet.getString("first_name")
                        + "-" + resultSet.getString("last_name"));

            }
        }




        System.out.println("UPDATE -------------------------");
        myCrud.updateFromTableRecord(QUERY_UPDATE_CUSTOMERS_ALL_BY_ID);


        System.out.println("SELECT -------------------------");
        resultSet = myCrud.findFromTableRecordAll(QUERY_SELECT_CUSTOMERS_ALL);


        if(resultSet != null ) {

            while (resultSet.next()) {
                System.out.println(
                        resultSet.getString("customer_id") + " " +
                                resultSet.getString("first_name") + " " +
                                resultSet.getString("last_name"));
            }
        }

        System.out.println("DELETE -------------------------");
        myCrud.deleteFromTableRecord(QUERY_DELETE_CUSTOMER_BY_ID);

        System.out.println("SELECT --------------------------");
        resultSet = myCrud.findFromTableRecordAll(QUERY_SELECT_CUSTOMERS_ALL);

        if(resultSet != null ) {

            while (resultSet.next()) {
                System.out.println(
                        resultSet.getString("customer_id") + " " +
                                resultSet.getString("first_name") + " " +
                                resultSet.getString("last_name"));
            }
        }

        System.out.println("INSERT -------------------------");
        myCrud.insertFromTableRecord(QUERY_INSERT_NEW_CUSTOMER);

        System.out.println("SELECT --------------------------");
        resultSet = myCrud.findFromTableRecordAll(QUERY_SELECT_CUSTOMERS_ALL);

        if(resultSet != null ) {

            while (resultSet.next()) {
                System.out.println(
                        resultSet.getString("customer_id") + " " +
                                resultSet.getString("first_name") + " " +
                                resultSet.getString("last_name"));
            }
        }
    }



}

