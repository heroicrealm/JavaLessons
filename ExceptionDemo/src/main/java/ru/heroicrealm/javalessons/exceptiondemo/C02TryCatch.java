/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.heroicrealm.javalessons.exceptiondemo;

/**
 *
 * @author Dmitry
 */
public class C02TryCatch {

    public static void main(String[] args) {

        fixcrushDemo01();
        System.out.println("=======================");
        finallyDemo();
        System.out.println("=======================");
        nestedTry();
    }

    private static void fixcrushDemo01() {
        try {
            int i = 50 / 0;

        } catch (ArithmeticException e) {
            System.out.println("Divide by zero");
        }
        System.out.println("Continue...");
    }

    private static void finallyDemo() {
        try {
            int i = 50 / 0;

        } catch (ArithmeticException e) {
            System.out.println("Divide by zero");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("This cannont happen!!");
        } catch (Exception e) {
            System.out.println("No one cought error :(");
        } finally {
            System.out.println("This block will work anyway");
        }
    }

    private static void nestedTry() {
        try {
            try {
                System.out.println("going to divide");
                int b = 39 / 0;
            } catch (ArithmeticException e) {
                System.out.println(e);
            }

            try {
                int a[] = new int[5];
                a[5] = 4;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }

            System.out.println("other statement");  
  }catch (Exception e) {
            System.out.println("handeled");
        }

        System.out.println("normal flow..");
    }

}
