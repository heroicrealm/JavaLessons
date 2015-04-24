/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.heroicrealm.javalessons.io;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.nio.CharBuffer;

/**
 *
 * @author Dmitry
 */
public class C05FileWriter {
    public static void main(String[] args) throws Exception{
        FileWriter fw = new FileWriter("fw.txt");
        fw.write("Hello");
        fw.close();;
        
        FileReader fr = new FileReader("fw.txt");
        int i;
        while((i= fr.read())!=-1)
        {
            System.out.print((char)i);
        }
        fr.read();
        fr.close();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
       BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("fw.txt")));
        System.out.println(br.readLine());
        br.close();
        
        
        
        
        
        
                
        
    }
    
}
