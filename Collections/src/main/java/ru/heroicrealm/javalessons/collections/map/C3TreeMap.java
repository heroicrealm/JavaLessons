/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.heroicrealm.javalessons.collections.map;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author Dmitry
 */
public class C3TreeMap {
        public static void main(String[] args) {
        TreeMap<String,String> hm = new TreeMap<>();
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
