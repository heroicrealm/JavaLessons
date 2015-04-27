/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.heroicrealm.javalessons.reflection;

import java.lang.reflect.*;

/**
 *
 * @author Dmitry
 */

public class C03AnotatedClass {

 
    
    public static void main(String[] args) throws Exception{
      Class workerClass = Class.forName("ru.heroicrealm.javalessons.reflection.C03Worker");
      Object worker = workerClass.newInstance();
        if (workerClass.isAnnotationPresent(A03Worker.class)) {
            System.out.println("Worker class found");
            Method[] methods = workerClass.getDeclaredMethods();
            //hire worker
            for(Method m: methods)
            {                
                if (m.isAnnotationPresent(A03HireMethod.class)) {
                    m.invoke(worker, null);
                }
            }
           
            Field[] fields = workerClass.getDeclaredFields();
            
            System.out.println("Personal info");
            for(Field f: fields)
            {
                if(f.isAnnotationPresent(A03SimpleAnotation.class))
                {
                    A03SimpleAnotation fld_desc = f.getAnnotation(A03SimpleAnotation.class);
                    if("personal".equals(fld_desc.group()))
                    {
                        if ("".equals(fld_desc.decription())) {
                            System.out.println(f.getName()+"="+f.get(worker));
                        }
                        else
                        {
                            System.out.println(f.getName()+"("+fld_desc.decription()+")="+f.get(worker));
                        }
                    }
                }
            }
            
            System.out.println("Organiztion info");
            for(Field f: fields)
            {
                if(f.isAnnotationPresent(A03SimpleAnotation.class))
                {
                    A03SimpleAnotation fld_desc = f.getAnnotation(A03SimpleAnotation.class);
                    if("organization".equals(fld_desc.group()))
                    {
                        if ("".equals(fld_desc.decription())) {
                            System.out.println(f.getName()+"="+f.get(worker));
                        }
                        else
                        {
                            System.out.println(f.getName()+"("+fld_desc.decription()+")="+f.get(worker));
                        }
                    }
                }
            }
            
            //fire worker
            for(Method m: methods)
            {                
                if (m.isAnnotationPresent(A03FireMethod.class)) {
                    m.invoke(worker, null);
                }
            }
            
        }
        else
        {
            System.out.println("This not worker!");
        }
      
      
        
      
     
    }
    
}
