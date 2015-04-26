/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.heroicrealm.javalessons.stringprocessing;

import java.util.StringTokenizer;

/**
 *
 * @author Dmitry
 */
public class C01Tokenizer {
    public static void main(String[] args) {
        String str = "Hello world param#pam#pam";
        
        StringTokenizer tk = new StringTokenizer(str,"# ", false);
        
        System.out.print("Number of tokens:"); System.out.println(tk.countTokens());
        
        while(tk.hasMoreTokens())
        {
            System.out.println("Token found:"+tk.nextToken());
        }
    }
    
}
