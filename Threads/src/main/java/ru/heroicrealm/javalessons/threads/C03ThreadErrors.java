package ru.heroicrealm.javalessons.threads;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dmitry
 */
public class C03ThreadErrors implements Runnable{

    @Override
    public void run() {
        System.out.println("Hello");
    }
    
    public static void main(String[] args) {
        Thread t1 = new Thread(new C03ThreadErrors());
        
        t1.run();
        t1.start();
        t1.start();
        
    }
}
