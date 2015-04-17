/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.heroicrealm.javalessons.variables.somepackage;

/**
 *
 * @author Dmitry
 */
public class SomeClass {
    public int publicVar = 5;
    protected int protectedVar = 6;
    private int privateVar = 7;
    
    public void printVars()
    {
        System.out.println("publicVar="+publicVar);
        System.out.println("protectedVar="+protectedVar);
        System.out.println("privateVar="+this.privateVar);
    }
    
}
