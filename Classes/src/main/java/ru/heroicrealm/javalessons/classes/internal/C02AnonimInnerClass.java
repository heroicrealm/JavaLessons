/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.heroicrealm.javalessons.classes.internal;

import ru.heroicrealm.javalessons.classes.AbstractClass;
import ru.heroicrealm.javalessons.classes.AddMulInterface;

/**
 *
 * @author Dmitry
 */
public class C02AnonimInnerClass {
    public static void main(String[] args) {
        AbstractClass ac = new AbstractClass() {
            @Override
            public void sayGoodbye() {
                System.out.println("GoodBye");
            }
        };
        ac.sayHello();
        ac.sayGoodbye();
        
        AddMulInterface ami = new AddMulInterface() {

            @Override
            public int add(int a, int b) {
                return a+b;
            }

            @Override
            public int mul(int a, int b) {
                return a*b;
            }
        };
        
        System.out.println(ami.add(5, 5));
    }
}
