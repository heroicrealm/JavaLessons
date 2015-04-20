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
public class C02StringConcatination {
    public static void main(String[] args) {
        System.out.println("concat by+");
        String s ="one"+" two";
        System.out.println(s);
        
        s = 50+30 +" = " + 80;
        System.out.println(s);
        
        String s2 ="(.)(.)";
        String s3 = s.concat(s2);
        System.out.println(s3);
    }
    
}
