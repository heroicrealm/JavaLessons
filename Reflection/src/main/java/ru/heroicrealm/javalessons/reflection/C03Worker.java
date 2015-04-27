/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.heroicrealm.javalessons.reflection;

/**
 *
 * @author Dmitry
 */
@A03Worker
public class C03Worker {
    
    @A03SimpleAnotation(group = "personal")
    String name;
    @A03SimpleAnotation(group = "personal", decription = "Home address")
    String address;    
    @A03SimpleAnotation(group = "personal")
    byte age;
    
    @A03SimpleAnotation(group = "organization")
    String company;
    
    @A03SimpleAnotation(group = "organization")
    String vacancy;
    
    @A03SimpleAnotation(group = "organization", decription = "month salary")
    double mSalary;
    
    @A03SimpleAnotation(group = "organization", decription = "year salary")
    double ySalary;
    
    
    String some_var;
    
    void saySomeVar()
    {
        System.out.println(some_var);
    }
    @A03HireMethod
    void hireWorker()
    {
        name = "Jack";
        address = "Broadway 10-22, NY, USA";
        age = 25;
        company = "Abidas";
        vacancy = "Manager";
        mSalary =  1000;
        ySalary = 12000;
        System.out.println("I am hired!!");
    }
    @A03FireMethod
    void fireWorker()
    {
        System.out.println("I am fired!");
    }
    
}
