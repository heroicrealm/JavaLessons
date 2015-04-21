/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.heroicrealm.javalessons.exceptiondemo;

/**
 *
 * @author Dmitry
 */
public class C03Propagation {
    void a()
    {
        System.out.println("50/0="+(50/0));
    }
    void b()
    {
        a();
    }
    void c()
    {
        b();
    }
    
    public static void main(String[] args) {
        C03Propagation c03 = new C03Propagation();
        try{
        c03.b();
        }catch(Exception e)
        {
            System.out.println("div by 0");
        }
    }
    
            
    
}
