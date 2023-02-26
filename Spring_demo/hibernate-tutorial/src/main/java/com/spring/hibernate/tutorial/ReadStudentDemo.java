package com.spring.hibernate.tutorial;

import com.spring.hibernate.tutorial.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadStudentDemo {

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
            Student tmpStudent = new Student("Dao", "Minh Tri", "abc@gmail.com");
            
            //READ THE STUDENT FROM DATABASE
            
            System.out.println("\nRead the student form database");
            System.out.println("Starting the transaction....");
            session = factory.getCurrentSession();
            
            session.beginTransaction();
            
            //get Student
            
            System.out.println("Getting the student from database....");
            
            //get student from database by ID
            Student myStudent = session.get(Student.class, tmpStudent.getId());
            
            //print out student information
            System.out.println("Printing out student's information....");
            System.out.println("The student information: " + myStudent.toString());
            
            //commit the transaction
            System.out.println("Commiting the transaction....");
            session.getTransaction().commit();
            
            System.out.println("Done!");
        } finally {
            factory.close();
        }
    }
}

// Note that the Student class must have default constructor 
