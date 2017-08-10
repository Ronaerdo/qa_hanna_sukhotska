package com.epam.hanna_sukhotska.lesson2.task2.calculator.operators;

/**
 * Created by sanna on 08.08.2017.
 */
public class AdditionCalculator extends OperationCalculator {

    public AdditionCalculator(int a, int b) {
        super(a, b);
    }

    /**
     *
     * @return the result of addition of two numbers
     */
    @Override
    public double calculate() {
        return a + b;
    }
}
