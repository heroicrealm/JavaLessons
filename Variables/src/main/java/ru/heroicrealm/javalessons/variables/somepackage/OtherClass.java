/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.heroicrealm.javalessons.variables.somepackage;

/**
 *
 * @author Dmitry
 */
public class OtherClass {
    public void accessVarsOfSomeClass()
    {
        SomeClass sc = new SomeClass();
        System.out.println("SomeClass-publicVar="+sc.publicVar);
        //Классы в одном пакете - доступ разрешен
        System.out.println("SomeClass-protectedVar="+sc.protectedVar);
        //Если раскоменетировать эту строку будет ошибка
        //Попытка доступа к приватному члену
        //System.out.println("SomeClass-privateVar"+sc.privateVar);
    }
    
}
