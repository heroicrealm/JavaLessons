/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.heroicrealm.javalessons.threads.sync;

/**
 *
 * @author Dmitry
 */
public class SharedObject {
     void count()
    {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread:"+Thread.currentThread().getName()+"i="+i);
        }
    }
     
     void count2()
    {
        
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread:"+Thread.currentThread().getName()+"\ti="+i);
        }
        
    }

    
}
