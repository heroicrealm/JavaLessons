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
public class Bus extends Vechicle{
    int passagersNumber;

    public int getPassagersNumber() {
        return passagersNumber;
    }

    public void setPassagersNumber(int passagersNumber) {
        this.passagersNumber = passagersNumber;
    }

    @Override
    public String toString() {
        return "Bus{" + "passagersNumber=" + passagersNumber + "}"+"super:"+ super.toString();
    }
    
    
}
