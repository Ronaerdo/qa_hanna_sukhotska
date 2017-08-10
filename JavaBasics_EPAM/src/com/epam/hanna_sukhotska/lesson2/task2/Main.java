package com.epam.hanna_sukhotska.lesson2.task2;

import com.epam.hanna_sukhotska.lesson2.task2.calculator.Calculator;
import com.epam.hanna_sukhotska.lesson2.task2.house_appliances.Flat;
import com.epam.hanna_sukhotska.lesson2.task2.house_appliances.Room;
import com.epam.hanna_sukhotska.lesson2.task2.house_appliances.appliances.ElectronicAppliance;
import com.epam.hanna_sukhotska.lesson2.task2.house_appliances.appliances.flat_appliances.*;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by sanna on 08.08.2017.
 */
public class Main {

    private static final String STOP_KEYWORD = "--q";

    /**
     * Method for testing calculator
     */

    public static void testCalculator(){
        Calculator c = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter expression to calculate: ");
        String expr = scanner.nextLine();
        while (!expr.equals(STOP_KEYWORD)) {
            try {
                System.out.println("Result: " + c.calculateExpression(expr));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Enter expression to calculate: (enter \"--q\"  to quit)");
            expr = scanner.nextLine();
        }
        scanner.close();
    }

    /**
     * Method to test flat appliances
     */
    public static void testFlat(){
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
        System.out.println();
        System.out.println("Now you have such appliances in your flat: ");
        f.removeAppliance("Fridge Nord");
        f.print();
    }
    public static void main(String[] args) {
        testCalculator();
      //testFlat();
    }
}
