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
public class C01StringCompare {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
        String s4 = "world";
        
        //compare with equals
        System.out.println("compare with equals");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        
        System.out.println("Compare with ==");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1==s3);
        
        System.out.println("Compare with compareTo");
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.compareTo(s4));
                
    }
    
}
