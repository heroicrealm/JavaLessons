/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.heroicrealm.javalessons.collections.extra;


/**
 *
 * @author Dmitry
 */
public class ComparableCar implements Comparable{
    
    String name;
    int maxSpeed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public ComparableCar(String name, int maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    public ComparableCar() {
    }

    @Override
    public String toString() {
        return "ComparableCar{" + "name=" + name + ", maxSpeed=" + maxSpeed + '}';
    }

    
    @Override
    public int compareTo(Object o) {
        ComparableCar c = (ComparableCar) o;
        if(c.maxSpeed > this.maxSpeed)
        {
            return -1;
        }else if(c.maxSpeed < this.maxSpeed)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    
    
    
    
}
