package com.epam.hanna_sukhotska.lesson2.task2.calculator;

/**
 * Created by sanna on 08.08.2017.
 */
public class ExpressionParser {


    private int a;
    private int b;
    private char operator;

    public int getFirstOperand() {
        return a;
    }

    public int getSecondOperand() {
        return b;
    }

    public char getOperator() {
        return operator;
    }

    /**
     * Method parses the expression on operands and operator.
     *
     * @param expr expression to calculate entered by user
     */

    public ExpressionParser(String expr){

        String [] args = expr.split("\\s+");
        try {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[2]);
            operator = args[1].charAt(0);
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e){
            throw new IllegalArgumentException("Wrong format of entered string");
        }
    }
}
