/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.heroicrealm.javalessons.reflection;

/**
 *
 * @author Dmitry
 */
public class C02LibImpl02 implements I02Lib{

    int i;

    public C02LibImpl02(int i) {
        this.i = i;
    }

    private C02LibImpl02() {
    }
    
    @Override
    public int getNumber() {
        return i;
    }
    
}
