/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.heroicrealm.javalessons.collections.collection;


import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author Dmitry
 */
public class C04IteratorDemo {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        
        ListIterator<Integer> it = list.listIterator();
        
        System.out.println("Get element and go next");
        System.out.println(it.next());
        System.out.println("Get element and go back");
        System.out.println(it.previous());
       
        
        
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        
        while(it.hasPrevious())
        {
            System.out.println(it.previous());
        }
        
        
    }
    
}
