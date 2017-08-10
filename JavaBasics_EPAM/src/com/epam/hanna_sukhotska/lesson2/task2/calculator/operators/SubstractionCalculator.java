package com.epam.hanna_sukhotska.lesson2.task2.calculator.operators;

/**
 * Created by sanna on 08.08.2017.
 */
public class SubstractionCalculator extends OperationCalculator{
    public SubstractionCalculator(int a, int b) {
        super(a, b);
    }

    /**
     *
     * @return the result of substraction of two numbers
     */
    @Override
    public double calculate() {
        return a - b;
    }

}
