/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.heroicrealm.javalessons.collections.collection;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 ava ArrayList class uses a dynamic array for storing the elements.It extends AbstractList class and implements List interface.
Java ArrayList class can contain duplicate elements.
Java ArrayList class maintains insertion order.
Java ArrayList class is non synchronized.
Java ArrayList allows random access because array works at the index basis.
In Java ArrayList class, manipulation is slow because a lot of shifting needs to be occurred if any element is removed from the array list.
 */
public class C02ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        
        System.out.println("Third element"+list.get(3));
        
        //Iterator exmple
        Iterator<Integer> it = list.listIterator();
        System.out.println("Iterator example");
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        
        it = list.listIterator(3);
        System.out.println("Iterator example 2:");
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        
        
        ArrayList<Integer> list2 = new ArrayList<>(list);
        
        System.out.println("Befor remove:");
        for(int i: list2)
        {
            System.out.println(i);
        }
        
        list2.remove(0);
        list2.remove(1);
        
        System.out.println("After remove:");
        for(int i: list2)
        {
            System.out.println(i);
        }
        
        System.out.println("remove elements of list2 from list");
        
        list.removeAll(list2);
        
        for(int i:list)
        {
            System.out.println(i);
        }
    }
    
}
