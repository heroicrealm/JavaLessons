/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.heroicrealm.javalessons.variables;

import ru.heroicrealm.javalessons.variables.somepackage.OtherClass;
import ru.heroicrealm.javalessons.variables.somepackage.SomeClass;

/**
 *
 * @author Dmitry
 */
public class VariablesExample {
    int var; //По умолчанию стоит protected
    static int svar; //Статическая переменная, принадлежит классу, а не объекту
    
    public static void main(String[] args) {
        /** типы переменных
         * 
         * Целочисленные
         */
        byte byteVar = 15; // 1 байт. от -128 до 127
        short shortVar = 512; // 2 байта. от -32 768 до 32 767
        int  intVar = 65536; //4 байта. от -2 147 483 648 до 2 147 483 647
        long longVar = 50L; // 8 байт.от -9223372036854775808 до 9223372036854775807
                                                                            
        /*дробные*/
        float floatVar = 4.5f; // 4 байта от 3.4е-038 до 3.4е+038
        double doubleVar = 5.22d; // 8 байт от 1.7е-308 до 1.7е+308
            
        boolean bool =true; //логический тип
        
        //Строковые
        char c = '4'; //Символ Unicode
        String s = "Hello"; //Строка
        
        //обект
        SomeClass sc = new SomeClass(); //Создаем объект класса SomeClass
        OtherClass oc = null;  // Объявляем ссылку на объект, но объект пока не создаем
        //Создадим объект  указав полное имя
        oc = new ru.heroicrealm.javalessons.variables.somepackage.OtherClass();
        
        /* демонстрация статических переменных        
        */
        VariablesExample.svar = 5;
        //Если раскоментировать эту строку - будет ошибка
        // так как переменная не статическая.
        // VariablesExample.var = 6;
        
        VariablesExample ve = new VariablesExample();
        
        ve.var = 2;
        ve.svar = 2; // Позволительно, но так лучше не делать!!!!
        
        
        
        //Пример с final
        // Переменные с модификатором final нельзя изменять
        
        final int constant = 6;
        
        //Если раскоментировать эту строку будет ошибка
        // constant = 3;
        

        // примеры области видимости
        System.out.println("sc.publicvar"+sc.publicVar);
        
        //Если раскоментировать эти строки - будет ошибка
        //System.out.println("sc.protectedvar"+sc.protectedVar);
        //System.out.println("sc.privatevar"+sc.privateVar());
        
        oc.accessVarsOfSomeClass();        
        
        new ExtraClass().sayProtected();
        
    }
    
}
