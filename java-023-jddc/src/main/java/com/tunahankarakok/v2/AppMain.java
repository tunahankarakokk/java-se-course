package com.tunahankarakok.v2;


// SQL INSERT - SELECT - UPDATE - DELETE
//JAVA CREATE - READ   - UPDATE - DELETE


import java.sql.ResultSet;
import java.sql.SQLException;

public class AppMain {

    static final String QUERY_SELECT_CUSTOMERS_ALL = "SELECT * FROM customer";
    static final String QUERY_SELECT_CUSTOMERS_ALL_BY_ID_ASC = "SELECT * FROM customer ORDER BY id ASC";
    static final String QUERY_SELECT_CUSTOMERS_ALL_BY_ID_DESC = "SELECT * FROM customer ORDER BY id DESC";

    static final String QUERY_UPDATE_CUSTOMERS_ALL_BY_ID_YENI = """
            UPDATE customers
            	SET 
            	first_name= "Musa",
            	last_name= "Karaş"
            	WHERE customer_id=1;
            	""";

    static final String QUERY_UPDATE_CUSTOMERS_ALL_BY_ID = "UPDATE customers + SET + first_name= 'Musa', + last_name= 'Karaş' WHERE customer_id=1;";







    static final String QUERY_INSERT_NEW_CUSTOMER = " INSERT INTO customers(first_name, last_name) VALUES ( 'Samet' , 'Furkan'); ";

    static final String QUERY_DELETE_A_CUSTOMER_BY_ID = "DELETE FROM customers WHERE customer_id = 1;";

    public static void main(String[] args) throws SQLException {
        MyCrud myCrud = new MyCrud();

        ResultSet resultSet = myCrud.findFromResultALl(QUERY_SELECT_CUSTOMERS_ALL);

        while(resultSet.next()){
            System.out.println(resultSet.getString("customer_id") +" - "
            +resultSet.getString("first_name") + " "
            +resultSet.getString("last_name"));
        }
    }
}
