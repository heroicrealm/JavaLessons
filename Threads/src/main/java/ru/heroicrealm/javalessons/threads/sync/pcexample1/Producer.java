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
public class Producer extends Thread{
   private Storage storage;

    public Producer(Storage manager) {
        this.storage = manager;
    }

    @Override
    public void run() {
        for (int i = 0; i < Storage.COUNT; i++) {
            storage.put(i);
            try {
                Thread.sleep((int) (Math.random() * 100));
            } catch (InterruptedException e) {
            }
        }
    }
    
}
