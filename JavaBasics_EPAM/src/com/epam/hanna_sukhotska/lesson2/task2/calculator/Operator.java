package com.epam.hanna_sukhotska.lesson2.task2.calculator;

import com.epam.hanna_sukhotska.lesson2.task2.calculator.operators.*;

/**
 * Created by sanna on 10.08.2017.
 */
public enum Operator {
    ADDITION("+"){
        @Override
        public OperationCalculator getCalculator(int a, int b){
            return new AdditionCalculator(a, b);
        }
    },
    SUBSTRACTION("-"){
        @Override
        public OperationCalculator getCalculator(int a, int b){
            return new SubstractionCalculator(a, b);
        }
    },
    MULTIPLICATION("*"){
        @Override
        public OperationCalculator getCalculator(int a, int b){
            return new MultiplyCalculator(a, b);
        }
    },
    DIVISION("/"){
        @Override
        public OperationCalculator getCalculator(int a, int b){
            return new DivisionCalculator(a, b);
        }
    };

    private String operatorChar;

    Operator(String op){
        this.operatorChar = op;
    }

    public abstract OperationCalculator getCalculator(int a, int b);

    public static Operator valueOfString(String operator){
        for (Operator op : Operator.values()) {
            if (op.operatorChar.equals(operator)) {
                return op;
            }
        }
        return null;
    }
}
