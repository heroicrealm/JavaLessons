/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.heroicrealm.javalessons.threads.sync.pcexample2;

/**
 *
 * @author Dmitry
 */
public class Storage {
    public static final int COUNT = 10;
    //
    private int contents;
    private boolean available = false;

    public synchronized int get() {
        System.out.println("GET");
        while (available == false) {
            try {
                System.out.println("WAIT for GET");
                wait();
            } catch (InterruptedException e) {
            }
        }
        available = false;
        System.out.println("Consumer got: " + contents);
        notifyAll();
        return contents;
    }

    public synchronized void put(int value) {
        System.out.println("PUT");
        while (available == true) {
            try {
                System.out.println("WAIT for PUT");
                wait();
            } catch (InterruptedException e) {
            }
        }
        contents = value;
        available = true;
        System.out.println("Producer put: " + value);
        notifyAll();
    }
}
