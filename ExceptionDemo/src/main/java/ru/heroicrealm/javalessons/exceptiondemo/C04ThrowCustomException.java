/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.heroicrealm.javalessons.exceptiondemo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dmitry
 */
public class C04ThrowCustomException {
    public static class MyException extends Exception
    {
        String msg;

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }        
    }
    
    public static void myMethod() throws C04ThrowCustomException.MyException
    {
        MyException ex = new MyException();
        ex.setMsg("Error");
        throw ex;        
    }
    
    public static void main(String[] args) {
        
        try {
            myMethod();
        } catch (MyException ex) {
            System.out.println(ex.getMsg());
        }
        
    }
    
}
