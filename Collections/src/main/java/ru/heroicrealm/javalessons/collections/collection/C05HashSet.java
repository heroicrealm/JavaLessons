/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.heroicrealm.javalessons.collections.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * uses hashtable to store the elements.It extends AbstractSet class and implements Set interface.
   contains unique elements only.
 * @author Dmitry
 */
public class C05HashSet {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();
        
        hs.add("One");        
        hs.add("Three");
        hs.add("Two");
        hs.add("One");
       
        
          
        Iterator<String> it = hs.iterator();
        
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        
        
        //LinkedHashSet - поддерживает порядок вставки
        
        System.out.println("Usage of LinkedHashSet");
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        
        
        lhs.add("One");        
        lhs.add("Three");
        lhs.add("Two");
        lhs.add("One");
       
        
          
        it = lhs.iterator();
        
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        
        
    }
 
}
