/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.heroicrealm.javalessons.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dmitry
 */
public class C01ReflectionDemo {
    int a;
    static char b = 'd';
    
    int func(int t, int y)
    {
        return t+y;
    }
    
    public static void main(String[] args) {
        C01ReflectionDemo c01 = new C01ReflectionDemo();
        c01.a = 5;
        Class cl = c01.getClass();
        
        System.out.println("Class name="+cl.getCanonicalName());
        System.out.println("Shortname="+cl.getSimpleName());
        
        System.out.println("Fields of class");
        
        for(Field f: cl.getDeclaredFields())
        {
            try {
                System.out.println("Field name:"+f.getName());
                System.out.println("Field type:"+f.getGenericType());
                if ("a".equals(f.getName())) {
                    System.out.println("Field value:"+f.getInt(c01));
                }else
                {
                    System.out.println("Field value:"+f.getChar(c01));
                }                
                System.out.println("====================");
            } catch (IllegalArgumentException ex) {
                ex.printStackTrace();
            } catch (IllegalAccessException ex) {
                Logger.getLogger(C01ReflectionDemo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("Methods:");
        for(Method m: cl.getDeclaredMethods())
        {
            System.out.println("Name:"+m.getName());
            System.out.println("Return type:"+m.getReturnType());
            System.out.println("======================");
        }
    }
    
}
