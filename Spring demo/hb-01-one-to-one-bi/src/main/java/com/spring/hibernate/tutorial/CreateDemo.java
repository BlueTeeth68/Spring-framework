package com.spring.hibernate.tutorial;

import com.spring.hibernate.tutorial.entity.Instructor;
import com.spring.hibernate.tutorial.entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateDemo {

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
            Instructor tempInstructor = new Instructor("Dao Minh", "Tri", "abc@gmail.com");

            InstructorDetail tempInstructorDetail = new InstructorDetail("youtube.com", "Learn every thing");

            tempInstructor.setInstructorDetail(tempInstructorDetail);

            //Start transaction
            session.beginTransaction();

            //Because of cascade.all, tempInstructorDetail also be saved
            System.out.println("Saving instructor.....");
            session.save(tempInstructor);

            //Commit the transaction
            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            factory.close();
        }
    }
}
