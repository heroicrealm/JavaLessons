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
public class Main {
    public static void main(String[] args) {
        System.out.println("=======================");
        System.out.println("Fist class usage");
        System.out.println("=======================");
        FirstClass fc = new FirstClass();
        
        fc.sayHello();
        fc.sayBye();
        System.out.println("=======================");
        System.out.println("Second class usage");
        System.out.println("=======================");
        
        SecondClass sc = new SecondClass();
        sc.sayHello();
        System.out.println(sc.add(4, 4));
        sc.sayBye();
        System.out.println("=======================");
        System.out.println("Polimorf example");
        System.out.println("=======================");
        fc = sc;
        fc.sayHello();
        fc.sayBye();
        
        System.out.println("=======================");
        System.out.println("Abstract example");
        System.out.println("=======================");
        
        AbstractClass as;
        as =  new AbstractSuccessor1();
        as.sayHello();
        as.sayGoodbye();
        
        System.out.println("SECONS SUCCESSOR");
        as = new AbstractSuccessor2();
        as.sayHello();
        as.sayGoodbye();
        
    
        
        as.sayHello();
        as.sayGoodbye();
        
        System.out.println("=======================");
        System.out.println("Interface example");
        System.out.println("=======================");
        
        AddMulInterface ami;
        DivSubInterface dsi;
        ami = new Calculator();
        dsi = (DivSubInterface) ami;
        
        System.out.println("5+5="+ami.add(5, 5));
        System.out.println("6*5="+ami.mul(6, 5));
        System.out.println("6-5="+dsi.sub(6, 5));
        System.out.println("10/5="+dsi.div(10, 5));
        
     
       
        
    }
}
