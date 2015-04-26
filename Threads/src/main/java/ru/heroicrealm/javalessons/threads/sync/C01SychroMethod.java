
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
public class C01SychroMethod implements Runnable{

    SharedObject so;
    @Override
    public void run() {
        so.count();     
    }
    
    
   
    public static void main(String[] args) {
        SharedObject so = new SharedObject();
        C01SychroMethod t1 = new C01SychroMethod();
        C01SychroMethod t2 = new C01SychroMethod();
        t1.so =so;
        t2.so = so;
        
        new Thread(t1).start();
        new Thread(t2).start();
        
    }
    
}
