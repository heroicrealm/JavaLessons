/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.heroicrealm.javalessons.collections.extra;

import java.util.Comparator;

/**
 *
 * @author Dmitry
 */
public class CarComparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        ComparableCar c1 = (ComparableCar) o1;
        ComparableCar c2 = (ComparableCar) o2;
        return c1.getName().compareTo(c2.getName());
    }
    
}
