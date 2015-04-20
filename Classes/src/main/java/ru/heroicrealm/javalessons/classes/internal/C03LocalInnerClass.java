/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.heroicrealm.javalessons.classes.internal;

/**
 *
 * @author Dmitry
 */
public class C03LocalInnerClass {
    private int data = 30;
    void display()
    {
        class Local
        {
            void msg(){System.out.println("data="+data);} 
        }
        Local l = new Local();
        l.msg();
    }
    public static void main(String[] args) {
        C03LocalInnerClass c03 = new C03LocalInnerClass();
        c03.display();
        
    }
    
}
