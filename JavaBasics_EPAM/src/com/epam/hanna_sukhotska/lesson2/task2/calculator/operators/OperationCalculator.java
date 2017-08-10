package com.epam.hanna_sukhotska.lesson2.task2.calculator.operators;

/**
 * Created by sanna on 08.08.2017.
 */
public abstract class OperationCalculator {

    protected int a;
    protected int b;

    public OperationCalculator(int a, int b){
        this.a = a;
        this.b = b;
    }

    public abstract double calculate();
}
