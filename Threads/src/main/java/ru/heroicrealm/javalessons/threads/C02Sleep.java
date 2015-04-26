/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.heroicrealm.javalessons.threads;

import java.util.Date;



/**
 *
 * @author Dmitry
 */
public class C02Sleep {
    class ThreadImpl1 implements Runnable
    {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hello from Thread 1:"+ new Date());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    
                }
            }
        }        
    }
    
     class ThreadImpl2 extends Thread
    {

        @Override
        public void run() {            
            for (int i = 0; i < 10; i++) {
                System.out.println("Hello from Thread 2" + new Date());
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ex) {                    
                }
            }
        }
        
    }
     
     public static void main(String[] args) {
        C02Sleep c = new C02Sleep();
        C02Sleep.ThreadImpl1 t1 = c.new ThreadImpl1();
        C02Sleep.ThreadImpl2 t2 = c.new ThreadImpl2();
        
        new Thread(t1).start();
        new Thread(t2).start();
        
    }
}
