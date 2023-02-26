/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.spring.hibernate.tutorial;

import com.spring.hibernate.tutorial.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author MINH TRI
 */
public class PrimatyKeyDemo {

    public static void main(String[] args) {
        //Create session factory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();
        //Create session
        Session session = factory.getCurrentSession();

        try {
            //Create student object
            System.out.println("Creating the student object....");
            Student tmpStudent1 = new Student("Number", "One", "one@gmail.com");
            Student tmpStudent2 = new Student("Number", "Two", "two@gmail.com");
            Student tmpStudent3 = new Student("Number", "Three", "three@gmail.com");

            //Start transaction
            System.out.println("Starting the transaction....");
            session.beginTransaction();

            //Save student object
            System.out.println("Saving the transaction");
            session.save(tmpStudent1);
            session.save(tmpStudent2);
            session.save(tmpStudent3);

            //Commit the transaction
            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            factory.close();
        }
    }

}
