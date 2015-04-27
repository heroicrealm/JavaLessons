/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.heroicrealm.javalessons.reflection;

import java.lang.annotation.*;

/**
 *
 * @author Dmitry
 */
@Target(value=ElementType.FIELD)
@Retention(value= RetentionPolicy.RUNTIME)
@Inherited
public @interface A03SimpleAnotation {
    String group();
    String decription() default "";    
}
