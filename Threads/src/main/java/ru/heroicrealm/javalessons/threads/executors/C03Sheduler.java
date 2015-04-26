/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.heroicrealm.javalessons.threads.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Dmitry
 */
public class C03Sheduler {

    public static void main(String[] args) {
          Worker w1 = new Worker(3);
        
        
        ScheduledExecutorService  es = Executors.newScheduledThreadPool(3);
        
        //es.schedule(new Worker(3), 3, TimeUnit.SECONDS);        
        es.scheduleAtFixedRate(new Worker(3), 3, 1, TimeUnit.SECONDS);
     //   es.scheduleWithFixedDelay(new Worker(3), 3, 2, TimeUnit.SECONDS);
        
    }
}
