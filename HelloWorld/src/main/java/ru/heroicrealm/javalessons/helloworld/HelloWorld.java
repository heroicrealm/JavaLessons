/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
  Название пакета.
  Пакет служит для логической структуризации классов
  и для предотвращения конфликтов имен.
  Пакет должен соответствовать папкам на фаиловой системе.
*/
package ru.heroicrealm.javalessons.helloworld;

/**
 *Объявим класс HelloWorld
 * Область видимости public означает, что класс будет виден вне паета
 */
public class HelloWorld {
    /*
    * Входная точка в программу
    * public - Метод виден вне класса
    * static  - Метод принадлежит классу, а не объекту класса
    * void - Ничего не возвращает
    * String[] args - Параметры, массив строк
    */
    public static void main(String[] args) {
        /**
         Выводим на консоль
         * 
         */
        System.out.println("Hello World!");
    }
    
}
