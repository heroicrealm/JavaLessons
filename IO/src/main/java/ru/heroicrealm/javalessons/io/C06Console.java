/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.heroicrealm.javalessons.io;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Dmitry
 */
public class C06Console {
    public static void main(String[] args) throws IOException {
        
        System.out.print("Input name:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
                
        System.out.println("Username:"+name);
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number:");
        int i = sc.nextInt();
        System.out.println("You entered:"+i);
    }
    
}
