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
public class Storage {
    
    public static final int COUNT = 10;
    //
    private int contents;

    // Метод отдает последнее число, переданное от Producer
    // Вызывается из Consumer
    public synchronized int get() {
        System.out.println("GET");
        System.out.println("Consumer got: " + contents);
        return contents;
    }

    // Метод сохраняет последнее число, переданное от Producer
    // Вызывается из Producer
    // Ключевое слово "synchronized" говорит о том, что пока мы находимся
    // внутри этого метода, метод блокируется для использования другими потоками
    public synchronized void put(int value) {
        System.out.println("PUT");
        System.out.println("Producer put: " + value);
        contents = value;
    }
}
