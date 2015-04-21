/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.heroicrealm.javalessons.exceptiondemo;

/**
 *
 * @author Dmitry
 */
public class C01Exception {
    public static void main(String[] args) {
        crushDemo01();
        
    }
    private static void crushDemo01() {
        int i = 50/0;
        System.out.println("i="+i);
    }
}
