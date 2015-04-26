/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.heroicrealm.javalessons.threads;

/**
 *
 * @author Dmitry
 */
public class C01SimpleThread {
    class ThreadImpl1 implements Runnable
    {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hello from Thread 1");
            }
        }        
    }
    
     class ThreadImpl2 extends Thread
    {

        @Override
        public void run() {            
            for (int i = 0; i < 10; i++) {
                System.out.println("Hello from Thread 2");
            }
        }
        
    }
    public static void main(String[] args) {
        C01SimpleThread ct = new C01SimpleThread();
        C01SimpleThread.ThreadImpl1 tr1 = ct.new ThreadImpl1();
        C01SimpleThread.ThreadImpl2 tr2 = ct.new ThreadImpl2();
        new Thread(tr1).start();
        new Thread(tr2).start();
    }
}
