/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.heroicrealm.javalessons.strings;

/**
 *
 * @author Dmitry
 */
public class C05Competiotions {
    static  int nRounds = 10000;
    public static void main(String[] args) {
        System.out.println("String vs StringBuffer");
        System.out.println("Round 1");
        stringVsBuffer();
        System.out.println("Round 2");
        stringVsBuffer();
        System.out.println("Round 3");
        stringVsBuffer();
        System.out.println("");
        System.out.println("");
        System.out.println("StringBuffer vs StringBuilder");
        nRounds *= 1000;
        
        System.out.println("Round 1");
        builderVsBuffer();
        System.out.println("Round 2");
        builderVsBuffer();
        System.out.println("Round 3");
        builderVsBuffer();
        
    }

    public static String concatWithString()    {  
        String t = "Hello";  
        for (int i=0; i<nRounds; i++){  
            t = t + " World";  
        }  
        return t;  
    }  
    public static String concatWithStringBuffer(){  
        StringBuffer sb = new StringBuffer("Hello");  
        for (int i=0; i<nRounds; i++){  
            sb.append("World");  
        }  
        return sb.toString();  
    }  
    
     public static String concatWithStringBuilder(){  
        StringBuilder sb = new StringBuilder("Hello");  
        for (int i=0; i<nRounds; i++){  
            sb.append("World");  
        }  
        return sb.toString();  
    }  
    private static void stringVsBuffer() {
        long startTime = System.currentTimeMillis();  
        concatWithString();  
        System.out.println("Time taken by Concating with String: "+(System.currentTimeMillis()-startTime)+"ms");  
        startTime = System.currentTimeMillis();  
        concatWithStringBuffer();  
        System.out.println("Time taken by Concating with  StringBuffer: "+(System.currentTimeMillis()-startTime)+"ms");  
        
    }
    private static void builderVsBuffer() {
        long startTime = System.currentTimeMillis();  
        concatWithStringBuffer();  
        System.out.println("Time taken by Concating with StringBuffer: "+(System.currentTimeMillis()-startTime)+"ms");  
        startTime = System.currentTimeMillis();  
        concatWithStringBuilder();  
        System.out.println("Time taken by Concating with  StringBuilder: "+(System.currentTimeMillis()-startTime)+"ms");  
        
    }
    
}
