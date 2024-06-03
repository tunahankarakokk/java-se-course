package com.tunahankarakok;


import com.tunahankarakok.entity.Employee;
import com.tunahankarakok.entity.Owner;
import com.tunahankarakok.entity.Person;
import com.tunahankarakok.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Date;
import org.hibernate.SessionFactory;

public class AppMain {

    public static void main(String[] args) {




        Person person = new Person();
        person.setPersonId(1L);
        person.setFirstname("Abdullah");
        person.setLastname("Demirel");


       // Employee employee = new Employee("Oğuz", "Akkaya", "Marketing", new Date());


        Employee employee = new Employee();
        employee.setPersonId(2L);
        employee.setFirstname("Oğuz");
        employee.setLastname("Akkaya");
        employee.setDepartmentName("Marketing");
        employee.setJoiningDate(new Date());



        //Owner owner = new Owner("Sadık", "Kuzu", 300L, 20L);
        Owner owner = new Owner();
        owner.setPersonId(3L);
        owner.setFirstname("Sadık");
        owner.setLastname("Kuzu");


        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();

        session.save(person);
        session.save(employee);
        session.save(owner);


        session.getTransaction().commit();
        session.close();

    }
}