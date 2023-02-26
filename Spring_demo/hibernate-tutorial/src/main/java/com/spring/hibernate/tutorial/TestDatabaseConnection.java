/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.spring.hibernate.tutorial;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author MINH TRI
 */
public class TestDatabaseConnection {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
        String userName = "hbstudent";
        String password = "hbstudent";
        
        try {
            System.out.println("Connecttion start: ");
            
            Connection con = DriverManager.getConnection(jdbcUrl, userName, password);
            
            System.out.println("Connect successful");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
