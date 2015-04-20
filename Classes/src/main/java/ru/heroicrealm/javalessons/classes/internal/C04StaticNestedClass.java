/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.heroicrealm.javalessons.classes.internal;

/**
 *
 * @author Dmitry
 */
public class C04StaticNestedClass {
    public static class NestedStatic
    {
        public void sayHello(){
            System.out.println("Nested hello");
        }
    }
    public void sayBye()
    {
        System.out.println("Outher bye");
    }
    
}
