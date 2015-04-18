/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.heroicrealm.javalessons.classes;

/**
 *
 * @author Dmitry
 */
public class InternalClassExample {
    public class Internal1
    {
        public void sayHello()
        {
            System.out.println("Internal1 hello");
        }
    }
    
    public static class Internal2
    {
        public void sayBye()
        {            
            System.out.println("Internal2 bye");
        }        
    }
    
    public void func()
    {
        Internal1 it = new Internal1();
        it.sayHello();
    }
    
}
