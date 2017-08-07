package com.epam.hanna_sukhotska.lesson1.task3;

import java.util.Scanner;

/**
 * @author Hanna Sukhotska
 */
public class Calculator {

    /** Add two numbers */
    public int addition(int a, int b){
        return a+b;
    }

    /** Substract two numbers */
    public int substraction(int a, int b){
        return a-b;
    }

    /** Multiply two numbers */
    public int multiplication(int a, int b){
        return a*b;
    }

    /** Divide two numbers */
    public double division(int a, int b){
        if (a == 0 || b == 0) throw new ArithmeticException("Division on 0");
            return a/b;
    }

    /** Calculate expression */
    public double calculate(int a, int b, char operator){
        switch (operator){
            case '+': return addition(a, b);
            case '-': return substraction(a, b);
            case '*': return multiplication(a, b);
            case '/': return division(a, b);
            default: throw new IllegalArgumentException("Not supported operator");
        }

    }

    /** Method parses expression from console */
    public double parseExpression(String expr){
        String [] args = expr.split(" ");
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[2]);
            char c = args[1].charAt(0);
            return calculate(a, b, c);
        } catch (ArrayIndexOutOfBoundsException e){
            throw new IllegalArgumentException("Wrong format of entered string");
        } catch (NumberFormatException e){
            throw new IllegalArgumentException("Wrong format of entered string");
        }
    }

    /** Test method */
    public static void test(){
        Scanner scan = new Scanner(System.in);
        Calculator c = new Calculator();
        System.out.println("Enter expression to calculate:");
        try {
            System.out.println("Result: " + c.parseExpression(scan.nextLine()));
            scan.close();
        } catch (Exception e){
            System.out.println(e.getMessage());
            test();
        }

    }
}
