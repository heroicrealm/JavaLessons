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
public class Garage <T extends Vechicle>{
    T place;

    public T getPlace() {
        return place;
    }

    public void setPlace(T place) {
        this.place = place;
    }
    
    
    public void say()
    {
        System.out.println("Vechicle in garage:"+place.toString());
    }
}
