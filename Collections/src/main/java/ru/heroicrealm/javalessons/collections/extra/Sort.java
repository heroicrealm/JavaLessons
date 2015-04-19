/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.heroicrealm.javalessons.collections.extra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author Dmitry
 */
public class Sort {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Zebra");
        al.add("Bober");
        al.add("Dog");
        al.add("Cat");

        Collections.sort(al);
        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        
        //comparable demo
        System.out.println("comparable demo");
        
        LinkedList<ComparableCar> ll = new LinkedList<>();
        ll.add(new ComparableCar("03 Bmv",240));
        ll.add(new ComparableCar("01 Ferrary",230));
        ll.add(new ComparableCar("02 Lada-Putin Edtion",300));
        
        Collections.sort(ll);
        
        for(ComparableCar cc : ll)
        {
            System.out.println(cc);
        }
        
        System.out.println("ComparatorDemo");
        
        Collections.sort(ll, new CarComparator());
        for(ComparableCar cc : ll)
        {
            System.out.println(cc);
        }
        
    }
}
