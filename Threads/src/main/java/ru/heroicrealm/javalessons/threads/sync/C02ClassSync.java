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
public class C02ClassSync implements Runnable{
    SharedObject so;
    
    public static void main(String[] args) {
        C02ClassSync t1 = new C02ClassSync();
        C02ClassSync t2 = new C02ClassSync();
        t1.so =  new SharedObject();
        t2.so = new SharedObject();
        
        new Thread(t1).start();
        new Thread(t2).start();
    }

    @Override
    public void run() {
        so.count2();
    }
    
}
