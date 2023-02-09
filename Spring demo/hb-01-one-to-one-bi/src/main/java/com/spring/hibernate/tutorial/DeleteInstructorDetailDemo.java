package com.spring.hibernate.tutorial;

import com.spring.hibernate.tutorial.entity.Instructor;
import com.spring.hibernate.tutorial.entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteInstructorDetailDemo {

    private static final long THE_ID = 3;

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

            //get instructor detail from database by ID
            InstructorDetail instructorDetail = session.get(InstructorDetail.class, THE_ID);
            System.out.println("The instructor detail infor: " + instructorDetail);

            //get Instructor through instructor detail
            System.out.println("\n\nThe instructor: ");
            System.out.println("Instructor information: " + instructorDetail.getInstructor());

            //delete Instructor detail to see what happen
            System.out.println("Deleting instructor detail.....");
            session.delete(instructorDetail);
            // when we delete instructor detail, hibernate also delete instructor 
            // because of the bi-directional one to one relationship
            // and hibernate delete instructor table first

            //Commit the transaction
            session.getTransaction().commit();
            System.out.println("Done!");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            //close session if error occur
            session.close();

            factory.close();
        }
    }
}
