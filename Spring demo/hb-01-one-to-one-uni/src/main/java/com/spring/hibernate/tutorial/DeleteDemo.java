package com.spring.hibernate.tutorial;

import com.spring.hibernate.tutorial.entity.Instructor;
import com.spring.hibernate.tutorial.entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteDemo {

    public static void main(String[] args) {

        //Create session factory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .buildSessionFactory();
        //Create session
        Session session = factory.getCurrentSession();

        try {
            //Start transaction
            session.beginTransaction();

            //get instructor from database by ID
            long theID = 2;

            Instructor tmp = session.get(Instructor.class, theID);
//            InstructorDetail tmp = session.get(InstructorDetail.class, theID);
            //Cannot delete instructorDetail first because 
            // it will cause foreign key exception in db

            //delete tmp from database
            // note that we will also delete instructorDetail 
            // because of cascade.all
            System.out.println("Deleting intructor " + tmp);
            if (tmp != null) {
                session.delete(tmp);
            }

            //Commit the transaction
            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            factory.close();
        }
    }
}
