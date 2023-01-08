/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.spring.springmvcdemo;

import java.util.LinkedHashMap;

/**
 *
 * @author MINH TRI
 */
public class Student {

    private String firstName;
    private String lastName;
    private String country;
    private String favoriteLanguage;

    private LinkedHashMap<String, String> countryOptions;
    private LinkedHashMap<String, String> favoriteLanguageOptions;
    private String[] operatingSystems;

    public Student() {
        //create and add country to country options
        countryOptions = new LinkedHashMap<>();
        countryOptions.put("Brazil", "Brazil");
        countryOptions.put("VietNam", "VietNam");
        countryOptions.put("India", "India");
        countryOptions.put("USA", "USA");
        countryOptions.put("Mars", "Mars");

        //create and add language to favorite language options 
        favoriteLanguageOptions = new LinkedHashMap<>();
        favoriteLanguageOptions.put("Java", "Java");
        favoriteLanguageOptions.put("C#", "C#");
        favoriteLanguageOptions.put("Python", "Python");
        favoriteLanguageOptions.put("Ruby", "Ruby");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }

    public LinkedHashMap<String, String> getFavoriteLanguageOptions() {
        return favoriteLanguageOptions;
    }

    public String[] getOperatingSystems() {
        return operatingSystems;
    }

    public void setOperatingSystems(String[] operatingSystems) {
        this.operatingSystems = operatingSystems;
    }

}
