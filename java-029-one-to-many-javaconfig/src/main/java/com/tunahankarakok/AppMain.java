package com.tunahankarakok;

import com.tunahankarakok.entity.Customer;
import com.tunahankarakok.entity.Order;
import com.tunahankarakok.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Date;
import java.math.BigDecimal;

public class AppMain {

    public static void main(String[] args) {

        Customer customer1 = new Customer();
        customer1.setFirstName("Adem");
        customer1.setLastName("Kok");

        Order order1 = new Order();
        order1.setProduct("Elma");
        order1.setCode("99999");
        order1.setCreateDate(new Date());
        order1.setAmount(BigDecimal.valueOf(10.2));

        Order order2 = new Order();
        order2.setProduct("Armut");
        order2.setCode("44444");
        order2.setCreateDate(new Date());
        order2.setAmount(BigDecimal.valueOf(6.77));

        Order order3 = new Order();
        order3.setProduct("Vişne");
        order3.setCode("33333");
        order3.setCreateDate(new Date());
        order3.setAmount(BigDecimal.valueOf(15.12));

        customer1.getOrders().add(order1);
        customer1.getOrders().add(order2);
        customer1.getOrders().add(order3);

        order1.setCustomer(customer1);
        order2.setCustomer(customer1);
        order3.setCustomer(customer1);



        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();

            session.save(customer1);
            session.save(order1);
            session.save(order2);
            session.save(order3);

            transaction.commit();

        } catch (HibernateException e) {

        } finally {
            session.close();
        }


    }


}