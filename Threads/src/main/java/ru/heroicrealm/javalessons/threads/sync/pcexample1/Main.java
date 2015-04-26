/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.heroicrealm.javalessons.threads.sync.pcexample1;

/**
 *
 * @author Dmitry
 */
public class Main {
    public static void main(String[] args) {
        Storage s = new Storage();
        Producer p1 = new Producer(s);
        Consumer c1 = new Consumer(s);

        
        p1.start();

       
        try {
           Thread.sleep(100);
        } catch (InterruptedException ex) {
        }

        c1.start();
    }
}
