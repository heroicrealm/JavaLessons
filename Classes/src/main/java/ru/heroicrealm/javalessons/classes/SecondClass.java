/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.heroicrealm.javalessons.classes;

/**
 *
 * @author Dmitry
 */
public final class SecondClass  extends FirstClass{
    @Override
    public void sayBye()
    {
        System.out.println("Second class say goodbye");
    }
    
    public int add(int first, int second)
    {
        return first+second;
    }
    
    
}
