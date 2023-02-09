package com.spring.hibernate.tutorial;

import com.spring.hibernate.tutorial.entity.Student;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class QueryStudentDemo {

    public static void main(String[] args) {

        //Create session factory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();
        //Create session
        Session session = factory.getCurrentSession();

        try {
            //Start transaction
            System.out.println("Starting the transaction....");
            session.beginTransaction();

            //Query student list from database
            List<Student> studentList = session.createQuery("from Student").list();
            //Note that "from Student" with Student is Captitalized

            //Print all student on the screen
            System.out.println("The list students: ");
            displayStudent(studentList);

            //Query student with condition
            studentList = session.createQuery("from Student s where s.firstName = 'Dao'").list();

            //display list of student that have first name of 'Dao'
            System.out.println("\n\nStudents that have first name of Dao");
            displayStudent(studentList);

            //Query student who have email that end with e@gmail.com
            studentList = session.createQuery("from Student s where"
                    + " s.email LIKE '%e@gmail.com'").list();

            System.out.println("\n\nStudents whose email that end with e@gmail.com");
            displayStudent(studentList);

            //Commit the transaction
            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            factory.close();
        }
    }

    public static void displayStudent(List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
