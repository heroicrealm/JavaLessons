/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.heroicrealm.javalessons.variables;

import ru.heroicrealm.javalessons.variables.somepackage.SomeClass;

/**
 *
 * @author Dmitry
 */
public class ExtraClass extends SomeClass{
    
    public void sayProtected()
    {
        System.out.println("prot_val="+this.protectedVar);
    }
}
