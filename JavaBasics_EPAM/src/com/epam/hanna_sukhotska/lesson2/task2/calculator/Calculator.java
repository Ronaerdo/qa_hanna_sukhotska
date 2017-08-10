package com.epam.hanna_sukhotska.lesson2.task2.calculator;

import com.epam.hanna_sukhotska.lesson2.task2.calculator.operators.*;

import java.util.Scanner;

/**
 * Created by sanna on 08.08.2017.
 */
public class Calculator {


    private OperationCalculator getCalc(int a, int b, char operator){
        switch (operator){
            case '+': return new AdditionCalculator(a, b);
            case '-': return new SubstractionCalculator(a, b);
            case '*': return new MultiplyCalculator(a, b);
            case '/': return new DivisionCalculator(a, b);
            default: throw new IllegalArgumentException("Not supported operator");
        }
    }

    public void readAndCalculateExpression(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter expression to calculate: ");
        String expr = scanner.nextLine();
        ExpressionParser exprParser = new ExpressionParser(expr);
        OperationCalculator opCalc = getCalc(exprParser.getFirstOperand(), exprParser.getSecondOperand(), exprParser.getOperator());
        System.out.println("Result: " + opCalc.calculate());
        scanner.close();
    }
}
