/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.heroicrealm.javalessons.strings;

/**
 *
 * @author Dmitry
 */
public class C03StringOperations {
    public static void main(String[] args) {
        String s1 = "0123456789";        
        String s2 = s1.substring(0,6);
        String s3 = s1.substring(6);
        System.out.println(s2);
        System.out.println(s3);
        
        s1 = "hello".toUpperCase();
        System.out.println(s1);
        System.out.println(s1.toLowerCase());
        
        System.out.println("    hello   ".trim());
        
        System.out.println("OneTwo".startsWith("One"));
        
        System.out.println("Hello".length());
        
        System.out.println("Hello world".replace("world", "java"));
        
    }
    
}
