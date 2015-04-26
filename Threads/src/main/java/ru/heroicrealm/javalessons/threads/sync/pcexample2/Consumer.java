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
public class Consumer extends Thread{
      private Storage storage;

    public Consumer(Storage manager) {
        this.storage = manager;
    }

    @Override
    public void run() {
        int value = 0;
        for (int i = 0; i < Storage.COUNT; i++) {
            value = storage.get();
            try {
                Thread.sleep((int) (Math.random() * 100));
            } catch (InterruptedException e) {
            }
        }
    }
    
}
