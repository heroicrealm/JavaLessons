/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.heroicrealm.javalessons.controlstatements;

/**
 *
 * @author Dmitry
 */
public class IfExample {
    public static void main(String[] args) {
        int i = 4;
        
        
        //1. Условие
        
        if(i == 4)
        {
            System.out.println("i = 4");
        }
        
        if( i >5)
        {
            System.out.println("i>5");
        }
        else
        {
            System.out.println("i <= 5");
        }
        
        if(i > 5)
        {
            System.out.println("i > 5");
        }
        else if(i<5)
        {
            System.out.println("i < 5");
        }
        else
        {
            System.out.println("i = 5");
        }
        
        // Операция и
        if (i > 4 && i <=7) {
            System.out.println("i > 4 i< 7");
        }
        
        //Операция или
        if (i < 4 || i > 6) {
            System.out.println("i < 4 || i > 6");
        }
        
        //операция не
        if (i != 6)
        {
            System.out.println("i не равно 6");
        }
        if(!(i >6)) 
        {
            System.out.println("i<= 6");  
        }
        
        System.out.println("case example");
        switch(i)
        {
            case 3: System.out.println("i ==3");break;
            case 4: System.out.println("i ==4"); 
            case 5: System.out.println(" i== 5");                
        }
    }
}
