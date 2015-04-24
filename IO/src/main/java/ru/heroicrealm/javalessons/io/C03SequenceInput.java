/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.heroicrealm.javalessons.io;

import java.io.FileInputStream;
import java.io.SequenceInputStream;

/**
 *
 * @author Dmitry
 */
public class C03SequenceInput {

    public static void main(String[] args) throws Exception {
        FileInputStream fin1 = new FileInputStream("f1.txt");
        FileInputStream fin2 = new FileInputStream("f2.txt");

        SequenceInputStream sis = new SequenceInputStream(fin1, fin2);
        int i;
        while ((i = sis.read()) != -1) {
            System.out.print((char) i);
        }
        sis.close();
        fin1.close();
        fin2.close();
    }

}
