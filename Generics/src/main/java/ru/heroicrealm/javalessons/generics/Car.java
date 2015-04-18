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
public class Car extends Vechicle{
    int maxSpeed;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" + "maxSpeed=" + maxSpeed + '}' +"super:"+ super.toString();
    }
    
    
}
