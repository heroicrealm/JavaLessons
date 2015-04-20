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
public class C04OutherMain {
    public static void main(String[] args) {
        C04StaticNestedClass outher = new C04StaticNestedClass();
        C04StaticNestedClass.NestedStatic ns = new C04StaticNestedClass.NestedStatic();
        ns.sayHello();
        outher.sayBye();
    }
    
}
