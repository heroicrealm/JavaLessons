/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.heroicrealm.javalessons.threads.executors;

import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dmitry
 */
public class Worker implements Runnable {

    int id;
    int starts;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Worker(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        switch (id) {
            case 1:
                for (int i = 0; i < 10; i++) {
                    System.out.println("Thread " + Thread.currentThread().getName() + " time:" + new Date());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                    }
                }
                break;
            case 2:                
                int r = new Random().nextInt(100);
                for (int i = 0; i < 10; i++) {
                    System.out.println("Thread " + r + " time:" + new Date());
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException ex) {
                    }
                }
                break;
            case 3:
                System.out.println("Work");
                break;
         
                
        }
    }

}
