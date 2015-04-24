/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.heroicrealm.javalessons.io;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dmitry
 */
public class C02ByteArrayOutput {
    public static void main(String[] args) {
         FileOutputStream fout1=null;  
        try {
            fout1 = new FileOutputStream("f1.txt");
            FileOutputStream fout2=new FileOutputStream("f2.txt");
            ByteArrayOutputStream bout=new ByteArrayOutputStream();
            bout.write("Hello".getBytes());
            bout.writeTo(fout1);
            bout.writeTo(fout2);
            bout.flush();
            bout.close();//has no effect  
            System.out.println("success...");  
        } catch (FileNotFoundException ex) {
            System.out.println("error");
        } catch (IOException ex) {
            System.out.println("error");
        } finally {
            try {
                fout1.close();
            } catch (IOException ex) {
                   System.out.println("errror");
            }
        }
    }
}
