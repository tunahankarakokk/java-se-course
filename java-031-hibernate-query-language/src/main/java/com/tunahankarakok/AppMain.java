package com.tunahankarakok;

import com.tunahankarakok.entity.Customer;
import com.tunahankarakok.entity.CustomerDetail;
import com.tunahankarakok.util.HibernateUtil;
import jakarta.persistence.Table;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class AppMain {
    public static void main(String[] args) {

        Customer customer1 = new Customer();
        customer1.setFirstName("Adem");
        customer1.setLastName("Kök");
        customer1.setAge((short) 24);

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
        customer2.setAge((short) 28);

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
        customer3.setAge((short) 30);

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

            System.out.println("================= SELECT ============================" );
            Query query = session.createQuery("FROM Customer ");

            List<Customer> customers = query.list();

            for(Customer customer : customers){
                System.out.println(customer.getCustomerId() + " - " + customer.getFirstName() + " - " + customer.getLastName());
            }


            System.out.println("================= WHERE ============================" );
 /*
            ESKİ SÜRÜMLERDE
            Query query2 = session.createQuery("FROM Customer WHERE customerId = :customerId");
            query2.setLong("customerId",1);


             */
            /*
            Random rand = new Random();
            int randId = rand.nextInt(4);
            */
            //Yeni sürüm hali tek kayıt getirir
            Query query2 = session.createQuery("FROM Customer WHERE customerId = :customerId").
                    setParameter("customerId",1);//1 yerine randId verip rastgele veriyi de getirebilirdim

            Customer cust2 = (Customer) query2.uniqueResult();
            System.out.println(cust2.getCustomerId() + " - " + cust2.getFirstName() + " - " + cust2.getLastName());

            /*
            //Birden fazla sonuç getirir
            List<Customer> customers2 = query2.list();

            for(Customer customer : customers2){
                System.out.println(customer.getCustomerId() + " - " + customer.getFirstName() + " - " + customer.getLastName());
            }
            */

            System.out.println("================= DELETE ============================" );
            //FIXME  cascade = CascadeType.ALL yapmaya çalışılacak.
            Query query3 = session.createQuery("DELETE FROM CustomerDetail WHERE customerId = :customerId").
                    setParameter("customerId",4);//1 yerine randId verip rastgele veriyi de getirebilirdim

            int queryResult3 = query3.executeUpdate();
            System.out.println("CustomerDetail tablosunda : " + queryResult3);

            Query query4 = session.createQuery("DELETE FROM Customer WHERE customerId = :customerId").
                    setParameter("customerId",4);//1 yerine randId verip rastgele veriyi de getirebilirdim

            int queryResult4 = query4.executeUpdate();
            System.out.println("Customer tablosunda : " + queryResult4);




            System.out.println("================= AVG SUM MIN MAX COUNT ============================" );

            Query query5 = session.createQuery("SELECT COUNT(*) FROM Customer");
            Long countResult = (long) query5.uniqueResult();
            System.out.println("COUNT : " + countResult);

            //TODO : SUM MIN MAX COUNT sorguları eklenecek....

            System.out.println("================= JOIN ============================" );

              /*
            //Java 10 + son sürümlerde 3 tırnak kullanılır
            Query query6 = session.createQuery("""
                                      SELECT c.firstName,c.lastName
                                      FROM Customer c
                                      RIGHT JOIN CustomerDetail d
                                      ON c.customerId = d.customerId """);
            */


                    /*
                    SELECT *
                    FROM Table A
                    RIGHT JOIN Table B
                    ON A.id = B.id
                    */

            Query query6 = session.createQuery(" SELECT c.firstName,c.lastName "+
                                                  "FROM Customer c " +
                                                  "RIGHT JOIN CustomerDetail d  " +
                                                  "ON c.customerId = d.customerId ");

            List<Customer> custList6 = query6.list();

            //FIXME Object - Customer arasında yazdırma için kod geliştirilecek.
            /*
            for(Customer cust6 : custList6){
                System.out.println(cust6.getFirstName() + " - " + cust6.getLastName() + " - " + cust6.getAge() + " " +
                        cust6.getCustomerDetail().getAdress() +
                        cust6.getCustomerDetail().getCreateDate());
            }

             */







            transaction.commit();
        }catch (HibernateException e){

        }finally {
            session.close();
        }






    }
}