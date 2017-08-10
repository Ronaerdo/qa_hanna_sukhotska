package com.epam.hanna_sukhotska.lesson2.task2.calculator.operators;

/**
 * Created by sanna on 08.08.2017.
 */
public class DivisionCalculator extends OperationCalculator {
    public DivisionCalculator(int a, int b) {
        super(a, b);
    }
    /**
     *
     * @return the result of division of two numbers
     */
    @Override
    public double calculate() {
        if (b == 0) throw new ArithmeticException("Division on 0");
        return a/b;
    }


}
