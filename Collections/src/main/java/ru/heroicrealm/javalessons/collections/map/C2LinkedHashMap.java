/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.heroicrealm.javalessons.collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

/**
 *
 * @author Dmitry
 */
public class C2LinkedHashMap {
        public static void main(String[] args) {
        LinkedHashMap<String,String> hm = new LinkedHashMap<>();
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
