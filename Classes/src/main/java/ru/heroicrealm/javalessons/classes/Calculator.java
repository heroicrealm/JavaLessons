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
public class Calculator implements AddMulInterface, DivSubInterface{

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int mul(int a, int b) {
        return a * b;
    }

    @Override
    public int div(int a, int b) {
        return (int)(a/b);
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }
    
}
