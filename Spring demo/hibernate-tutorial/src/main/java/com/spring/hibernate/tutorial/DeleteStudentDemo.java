package com.spring.hibernate.tutorial;

import com.spring.hibernate.tutorial.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteStudentDemo {

    public static final long STUDENT_ID = 1;

    public static void main(String[] args) {

        //Create session factory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();
        //Create session
        Session session = factory.getCurrentSession();

        try {

            //DELETE STUDENT
            session = factory.getCurrentSession();

            session.beginTransaction();

            //get student from database by ID
            Student myStudent = session.get(Student.class, STUDENT_ID);

//            System.out.println("Deleting student: " + myStudent);
//            session.delete(myStudent);

            //Another way
            System.out.println("Deleting student 3");
            session.createQuery("delete from Student where id = 3").executeUpdate();
            
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
