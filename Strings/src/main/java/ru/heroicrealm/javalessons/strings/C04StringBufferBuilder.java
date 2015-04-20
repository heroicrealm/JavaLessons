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
public class C04StringBufferBuilder {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
              
        //important methods
        sb.append(" world");
        sb.append(5);
        System.out.println(sb);
        
        sb.insert(2, "LOL");
        System.out.println(sb);
        
        sb.replace(2, 6, "*****");
        System.out.println(sb);
        
        sb.delete(0, 2);
        System.out.println(sb);
        
        sb.reverse();
        System.out.println(sb);
        
        System.out.println("sb cap="+sb.capacity());
        
        sb.ensureCapacity(10);
        System.out.println("sb cap="+sb.capacity());
        sb.ensureCapacity(30);//increaces sise*2+2
        System.out.println("sb cap="+sb.capacity());
        System.out.println(sb.length());
        
        System.out.println(sb.charAt(3));
        System.out.println(sb.substring(3, 9));
        
        
        
    }
    
}
