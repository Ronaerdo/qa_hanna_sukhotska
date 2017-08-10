package com.epam.hanna_sukhotska.lesson2.task2;

import com.epam.hanna_sukhotska.lesson2.task2.calculator.Calculator;
import com.epam.hanna_sukhotska.lesson2.task2.house_appliances.Flat;
import com.epam.hanna_sukhotska.lesson2.task2.house_appliances.Room;
import com.epam.hanna_sukhotska.lesson2.task2.house_appliances.appliances.ElectronicAppliance;
import com.epam.hanna_sukhotska.lesson2.task2.house_appliances.appliances.flat_appliances.*;

import java.util.Arrays;

/**
 * Created by sanna on 08.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        /*Calculator c = new Calculator();
        try {
            c.readAndCalculateExpression();
        } catch (Exception e){
            System.out.println(e.getMessage());
            c.readAndCalculateExpression();
        }*/

        Flat f = new Flat();
        f.addAppliance(new Blender());
        f.addAppliance(new Fridge());
        f.addAppliance(new Heater());
        f.addAppliance(new TV());
        f.addAppliance(new WashingMachine());
        f.addAppliance(new Microwave());
        System.out.println("In your flat there are such electronic appliances: ");
        f.print();
        System.out.println();
        System.out.println("Sorted appliances by power: ");
        f.sort();
        f.print();
        ElectronicAppliance a = f.search(Room.Kitchen, "Fridge Nord", null, null);
        a.plugIn(true);
        System.out.println();
        System.out.println("Found appliance with given name: " + a);
        System.out.println("Plugged in appliances in your flat: " + Arrays.toString(f.pluggedInAppliances()));
    }
}
