/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.heroicrealm.javalessons.generics;

/**
 *
 * @author Dmitry
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("===================");
        System.out.println("generic class example");
        System.out.println("===================");
        GenericClass<Integer> gint = new GenericClass<Integer>();
        gint.set(5);
        gint.say();
        
        GenericClass<String> gstr = new GenericClass<>();
        gstr.set("hello");
        gstr.say();
        
        
        
        System.out.println("===================");
        System.out.println("generic class with extendfs example");
        System.out.println("===================");
        
        Garage<Car> carGarage = new Garage<>();
        Garage<Bus> busGarage = new Garage<>();
        Garage<Vechicle> vechGarage = new Garage<>();
        
        //Garage<String> vechGarage = new Garage<>();
        
        
        Car car = new Car();
        car.setName("BMW");
        car.setMaxSpeed(300);
        
        Bus bus = new Bus();
        bus.setName("MAN");
        bus.setPassagersNumber(50);
        
        carGarage.setPlace(car);
        carGarage.say();
        
        busGarage.setPlace(bus);
        busGarage.say();
        System.out.println("Vechicle garage");
        //carGarage.setPlace(bus);
        vechGarage.setPlace(car);
        vechGarage.say();
        vechGarage.setPlace(bus);
        vechGarage.say();
                  
        System.out.println("===================");
        System.out.println("generic method example");
        System.out.println("===================");
        Vechicle v1 = sayAndReturn(car);
        
        System.out.println("===================");
        System.out.println("generic wildcard example");
        System.out.println("===================");
        
        GenericClass<Car> gcc = new GenericClass<>();
        gcc.set(car);
        sayGeneric(gcc);
        
    }
    
    public static <T> T sayAndReturn(T whatToSay)
    {
        System.out.println( whatToSay.toString());
        return whatToSay;
    }
    public static void sayGeneric(GenericClass<?> gen)            
    {
        gen.say();
    }
}
