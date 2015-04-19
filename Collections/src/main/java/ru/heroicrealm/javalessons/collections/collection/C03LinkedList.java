/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.heroicrealm.javalessons.collections.collection;

import java.util.LinkedList;

/**
 *Java LinkedList class

Java LinkedList class uses doubly linked list to store the elements. 
It extends the AbstractList class and implements List and Deque interfaces.
Java LinkedList class can contain duplicate elements.
Java LinkedList class maintains insertion order.
Java LinkedList class is non synchronized.
In Java LinkedList class, manipulation is fast because no shifting needs to be occurred.
Java LinkedList class can be used as list, stack or queue.
* 
* Особенности ArrayList:
* 1.Хранит данные в динамических массивах
* 2.Операции с элементами медленные, так как данные хранятся в массиве
*   и постоянно сдвигаются.
* 3.Может выступать только как List
* 4.Хорошо подходит для хранения и доступа к данным по индексу
* 
* Особенности  LinkedList
* 1) Хранит данные в виде двухсвязного списка
* 2) Операции с элементами быстрее чем в ArrayList так как не нужно сдвигать данные
* 3) LinkedList реализует интерфейсы Deque 
* 4) LinkedList лучше подходит для манипулирования с данными
 * @author Dmitry
 */
public class C03LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list =  new LinkedList<>();
        
        list.add(4);
        list.add(5);
        list.add(6);
        
        System.out.println("initial list");
        
        for(int i:list)
        {
            System.out.println(i);
        }
        
        list.addFirst(1);
        list.addLast(7);
        
        System.out.println("After update");
        
        for(int i:list)
        {
            System.out.println(i);
        }
        
        
        //Используем как стек
        
        
        System.out.println("Stack example");
        list.clear();

        list.push(1);
        list.push(2);
        list.push(3);
                
        while(!list.isEmpty())
        {
            int i = list.poll();
            System.out.println(i);
        }
        
        
        System.out.println("Queue");
        list.clear();

        list.add(1);
        list.add(2);
        list.add(3);
                
        while(!list.isEmpty())
        {
            int i = list.poll();
            System.out.println(i);
        }
        
    }
}
