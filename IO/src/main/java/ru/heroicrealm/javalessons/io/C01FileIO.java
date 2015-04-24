/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.heroicrealm.javalessons.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Dmitry
 */
public class C01FileIO {
    public static void main(String[] args) {
        try {
            //Open file
            FileOutputStream fos = new FileOutputStream("Test.txt");
            String s="Hello world";  
            byte b[]=s.getBytes();//converting string into byte array              
            fos.write(b);   
            fos.close();  
            System.out.println("success...");  
            
            FileInputStream fis = new FileInputStream("Test.txt");
            int i =0;
            while((i=fis.read())!=-1)
            {
                System.out.print((char)i);
            }
        } catch (FileNotFoundException ex) {
            
        } catch (IOException ex) {

        }
        
    }
    
}
