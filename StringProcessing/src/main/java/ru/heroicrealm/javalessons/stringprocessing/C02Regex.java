/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.heroicrealm.javalessons.stringprocessing;

import java.io.IOException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Dmitry
 */
public class C02Regex {
    public static void main(String[] args) throws IOException {
        Pattern p = Pattern.compile("[1234567890]+");
        Matcher m = p.matcher("12345aa");
        System.out.println("Matches:"+m.matches());
        if (m.matches()) {
            System.out.println("found:"+m.group());
        }
        
        /***
         * Классы симполов:
         * 
         * [abc] - любой символ из группы ( a,b,c
         * [^abc] -любой символ кромк груаппы
         * [a-zA-Z] - диапазон
         * [a-d[x-z]] - объединение диапазонов 
         * [a-z&&[def]] - пересечение -: только def
         * [a-z&&[^d-f]] - пересечения от a до z, кроме d-f
         */
        
        /**
          X? - X может быть 1 раз или 0 раз
          X+ - X может быть 1 раз и больше
          Х* - Х может быть 0 раз и больше
          Х{n} - X дожен бить n раз
          X{n,} - Х должен быть n раз и больше
          Х{a,b} - X - должен быть от a до b раз
         */
        
        /**
         * 
         * . - любой символ
         * \\d - любая цифра
         * \\D - любая не цифра
         * \\s - любой пустой символ ( пробел, табуляция, перенос строки
         * \\S - любой непустой символ
         * \\w - любая буква
         * \\W - любая не-буква
         * \\\ - слеш
         * ^ - начало строки
         * $ - конец строки
         */
        
         System.out.println("email test");
         System.out.println(Pattern.matches("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$", "Test11.asd@mail.ru"));
         System.out.println(Pattern.matches("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$", "Test11.asd@mail"));
         
         
        
    }
    
}
