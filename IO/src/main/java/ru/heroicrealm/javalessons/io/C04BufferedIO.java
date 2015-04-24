/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.heroicrealm.javalessons.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author Dmitry
 */
public class C04BufferedIO {
    public static void main(String[] args) throws Exception{
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("bufout.txt"));
        bos.write("Buffered output".getBytes());
        bos.close();
        
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("bufout.txt"));
        int i;
        while((i=bis.read())!=-1)
        {
            System.out.print((char)i);
        }
        bis.close();
        
        
    }
    
}
