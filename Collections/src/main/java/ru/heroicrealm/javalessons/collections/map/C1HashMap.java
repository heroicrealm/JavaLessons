/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.heroicrealm.javalessons.collections.map;

import java.util.HashMap;
import java.util.Set;

/**

* A HashMap contains values based on the key. It implements the Map interface and extends AbstractMap class.
It contains only unique elements.
It may have one null key and multiple null values.
It maintains no order.
 * @author Dmitry
 */
public class C1HashMap {
    public static void main(String[] args) {
        HashMap<String,String> hm = new HashMap<>();
        hm.put("Jack", "Apple");
        hm.put("Vasya", "Orange");
        hm.put("Oleg", "Apple");
        
        System.out.println("Vasya has an "+hm.get("Vasya"));
        
        Set<String> keys = hm.keySet();
        
        for(String k: keys)
        {
            System.out.println(k+ " has an "+ hm.get(k));
        }
                
                
        
    }
    
}
