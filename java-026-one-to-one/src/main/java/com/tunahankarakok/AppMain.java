package com.tunahankarakok;

import com.tunahankarakok.entity.Customer;
import com.tunahankarakok.entity.CustomerDetail;
import com.tunahankarakok.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Date;

public class AppMain {
    public static void main(String[] args) {

        Customer customer1 = new Customer();
        customer1.setFirstName("Adem");
        customer1.setLastName("Kök");

        CustomerDetail customerDetail1 = new CustomerDetail();
        customerDetail1.setAdress("Berlin");
        customerDetail1.setPhoneNumber("111111");
        customerDetail1.setEmail("abc@gmail.com");
        customerDetail1.setCreateDate(new Date());

        customerDetail1.setCustomer(customer1);
        customer1.setCustomerDetail(customerDetail1);




        Customer customer2 = new Customer();
        customer2.setFirstName("Tunahan");
        customer2.setLastName("Karakök");

        CustomerDetail customerDetail2 = new CustomerDetail();
        customerDetail2.setAdress("Ankara");
        customerDetail2.setPhoneNumber("999999");
        customerDetail2.setEmail("ankara06@gmail.com");
        customerDetail2.setCreateDate(new Date());


        customerDetail2.setCustomer(customer2);
        customer2.setCustomerDetail(customerDetail2);


        //customer2 nesne oluşturma şekli customer1 e göre daha pahalıdır.

        Customer customer3 = new Customer();
        customer3.setFirstName("Atilla");
        customer3.setLastName("Güneş");

        CustomerDetail customerDetail3 = new CustomerDetail();
        customerDetail3.setAdress("İzmir");
        customerDetail3.setPhoneNumber("35353535");
        customerDetail3.setEmail("İzmir35@gmail.com");
        customerDetail3.setCreateDate(new Date());


        customerDetail3.setCustomer(customer3);
        customer3.setCustomerDetail(customerDetail3);


        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction = null;

        try{
            transaction = session.beginTransaction();

            session.save(customer1);
            session.save(customer2);
            session.save(customer3);




            transaction.commit();
        }catch (HibernateException e){

        }finally {
            session.close();
        }






    }
}