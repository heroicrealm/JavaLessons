/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.heroicrealm.javalessons.generics;

/**
 *
 * @author Dmitry
 */
public class GenericClass<T> {
    private T storage;
    
    public T get()
    {
        return storage;
    }
    
    public void set(T storage)
    {
        this.storage = storage;
    }
    public void say()
    {
        System.out.println(storage);
    }
    
    
}
