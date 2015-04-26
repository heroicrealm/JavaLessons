/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.heroicrealm.javalessons.threads.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author Dmitry
 */
public class C01FixedPool {
    public static void main(String[] args) {
        Worker w1 = new Worker(1);
        Worker w2 = new Worker(1);
        Worker w3 = new Worker(1);
        Worker w4 = new Worker(1);
        
        ExecutorService es = Executors.newFixedThreadPool(3);
        
        es.execute(w1);
        es.execute(w2);
        es.execute(w3);
        es.execute(w4);
        es.shutdown();
    }
    
}
