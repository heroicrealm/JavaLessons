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
public class C02SingleThread {
    public static void main(String[] args) {
        Worker w1 = new Worker(2);
        Worker w2 = new Worker(2);
        Worker w3 = new Worker(2);
        Worker w4 = new Worker(2);
        
        ExecutorService es = Executors.newSingleThreadExecutor();
        
        es.execute(w1);
        es.execute(w2);
        es.execute(w3);
        es.execute(w4);
        es.shutdown();
    }
    
}
