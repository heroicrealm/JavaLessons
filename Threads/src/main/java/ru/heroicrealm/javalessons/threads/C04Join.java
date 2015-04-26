/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.heroicrealm.javalessons.threads;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dmitry
 */
public class C04Join implements Runnable{

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
            System.out.println("Work");
        } catch (InterruptedException ex) {            
        }
    }
    
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new C04Join());
        
        t.start();
        
        
        t.join();
        
        System.out.println("End");
    }
    
}
