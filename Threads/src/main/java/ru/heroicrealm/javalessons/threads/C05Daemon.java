/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.heroicrealm.javalessons.threads;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dmitry
 */
public class C05Daemon implements Runnable{

    @Override
    public void run() {
        while(true)
        {
            try {
                System.out.println("Tic-tac:"+new Date());
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(C05Daemon.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new C05Daemon());
        //t.setDaemon(true);
        t.start();
        Thread.sleep(5000);
        System.out.println("Ending program");
    }
    
}
