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
public class LoopExample {
    public static void main(String[] args) {
        //цикл for
        for (int i = 0; i < 10; i++) {
            System.out.print(i+" ");
        }
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        //Цикл while
        int i = 5;
        while(i>0)
        {
            System.out.println(i--);
        }
        System.out.println("");
        System.out.println("");
        
        //цикл do
        i = 5;
        do {
            System.out.println(i--);
        } while (i>0);
        
        System.out.println("");
        System.out.println("");
        
        //Управление циклом
        i = 10;
        while(i >0)
        {
            if (i == 7) {
                i--;
                continue;
            }
            if(i == 4)
                break;
            
            System.out.println("i="+i--);
                        
        }
    }
    
}
