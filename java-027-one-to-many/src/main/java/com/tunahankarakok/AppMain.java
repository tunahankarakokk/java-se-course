package com.tunahankarakok;

import com.tunahankarakok.entity.Customer;
import com.tunahankarakok.entity.Order;
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

        Order order1 = new Order();
        order1.setProduct("Elma");
        order1.setCode("120");
        order1.setCreateDate(new Date());
        order1.setCustomer(customer1);
        order1.setAmount(10);

        Order order2 = new Order();
        order2.setProduct("Armut");
        order2.setCode("120");
        order2.setCreateDate(new Date());
        order2.setCustomer(customer1);
        order2.setAmount(10);

        Order order3 = new Order();
        order3.setProduct("Vişne");
        order3.setCode("33333");
        order3.setCreateDate(new Date());
        order3.setCustomer(customer1);
        order3.setAmount(15);

        customer1.getOrders().add(order1);
        customer1.getOrders().add(order2);
        customer1.getOrders().add(order3);

        order1.setCustomer(customer1);
        order2.setCustomer(customer1);
        order3.setCustomer(customer1);




        Customer customer2 = new Customer();
        customer2.setFirstName("Tunahan");
        customer2.setLastName("Karakök");




        //customer2 nesne oluşturma şekli customer1 e göre daha pahalıdır.

        Customer customer3 = new Customer();
        customer3.setFirstName("Atilla");
        customer3.setLastName("Güneş");




        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction = null;

        try{
            transaction = session.beginTransaction();

            session.save(customer1);
            session.save(order1);
            session.save(order2);
            session.save(order3);




            //session.save(customer2);
            //session.save(customer3);

            //session.flush(); hangi işlemler olduysa onları yapar ve durur

            transaction.commit();


        }catch (HibernateException e){

        }finally {
            session.close();
        }






    }
}