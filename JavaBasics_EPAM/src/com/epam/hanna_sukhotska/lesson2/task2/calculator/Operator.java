package com.epam.hanna_sukhotska.lesson2.task2.calculator;

import com.epam.hanna_sukhotska.lesson2.task2.calculator.operators.*;

/**
 * Created by sanna on 10.08.2017.
 */
public enum Operator {
    Addition('+'){
        @Override
        public OperationCalculator getCalculator(int a, int b){
            return new AdditionCalculator(a, b);
        }
    },
    Substraction('-'){
        @Override
        public OperationCalculator getCalculator(int a, int b){
            return new SubstractionCalculator(a, b);
        }
    },
    Multiply('*'){
        @Override
        public OperationCalculator getCalculator(int a, int b){
            return new MultiplyCalculator(a, b);
        }
    },
    Division('/'){
        @Override
        public OperationCalculator getCalculator(int a, int b){
            return new DivisionCalculator(a, b);
        }
    };

    private char operatorChar;

    Operator(char op){
        this.operatorChar = op;
    }

    public abstract OperationCalculator getCalculator(int a, int b);

    public static Operator valueOf(char operator){
        for (Operator op : Operator.values()) {
            if (op.operatorChar == operator) {
                return op;
            }
        }
        return null;
    }
}
