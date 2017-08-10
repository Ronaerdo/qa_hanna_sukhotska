package com.epam.hanna_sukhotska.lesson2.task2;

import com.epam.hanna_sukhotska.lesson2.task2.calculator.Calculator;

/**
 * Created by sanna on 08.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        try {
            c.readAndCalculateExpression();
        } catch (Exception e){
            System.out.println(e.getMessage());
            c.readAndCalculateExpression();
        }
    }
}
