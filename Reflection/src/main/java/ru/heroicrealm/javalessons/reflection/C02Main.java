/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.heroicrealm.javalessons.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 *
 * @author Dmitry
 */
public class C02Main {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException,
                                              NoSuchMethodException, IllegalArgumentException, InvocationTargetException {
        Class libv01_cls = Class.forName("ru.heroicrealm.javalessons.reflection.C02LibImpl01");
        I02Lib libv01 = (I02Lib) libv01_cls.newInstance();
        System.out.println("Libv01:"+libv01.getNumber());
        
        
     //   Class libv02_cls = Class.forName("ru.heroicrealm.javalessons.reflection.C02LibImpl02");
     //    I02Lib libv02 = (I02Lib) libv02_cls.newInstance();
      //  System.out.println("Libv01:"+libv02.getNumber());
  
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
      /*  Constructor c = libv02_cls.getConstructor(new Class[]{int.class});
        I02Lib libv03 =(I02Lib) c.newInstance(50);
        
        System.out.println("libvo3:"+libv03.getNumber());
              */
        
    }
    
    
}
