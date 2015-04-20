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
public class C01MemberInnerClass {
    private int data = 30;
    class Inner
    {
        public void sayData()
        {
            System.out.println("Data is "+data);
        }
    }
    
    public static void main(String[] args) {
        C01MemberInnerClass c01 = new C01MemberInnerClass();
        C01MemberInnerClass.Inner in = c01.new Inner();        
        in.sayData();
        
        c01.data = 20;
        C01MemberInnerClass.Inner in2 = c01.new Inner();
        in2.sayData();        
    }
    
}
