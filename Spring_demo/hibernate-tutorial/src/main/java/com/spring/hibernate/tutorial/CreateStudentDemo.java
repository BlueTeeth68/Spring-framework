package com.spring.hibernate.tutorial;

import com.spring.hibernate.tutorial.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateStudentDemo {

    public static void main(String[] args) {

        //Create session factory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();
        //Create session
        Session session = factory.getCurrentSession();
        
        try {
            //Create student entity
            System.out.println("Creating the student object....");
            Student tmpStudent = new Student("Dao", "Minh Tri", "abc@gmail.com");
            
            //Start transaction
            System.out.println("Starting the transaction....");
            session.beginTransaction();
            
            //Svae student object
            System.out.println("Saving the transaction");
            session.save(tmpStudent);
            
            //Commit the transaction
            session.getTransaction().commit(); 
            System.out.println("Done!");
        } finally {
            factory.close();
        }
    }
}
