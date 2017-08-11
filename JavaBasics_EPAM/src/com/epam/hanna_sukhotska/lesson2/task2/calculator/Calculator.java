package com.epam.hanna_sukhotska.lesson2.task2.calculator;

import com.epam.hanna_sukhotska.lesson2.task2.calculator.operators.*;

import java.util.Scanner;

/**
 * Created by sanna on 08.08.2017.
 */
public class Calculator {

    private OperationCalculator getCalc(int a, int b, String operator){
        Operator op = Operator.valueOfString(operator);
        if (op == null){
            throw new IllegalArgumentException("Wrong operator");
        }
        return op.getCalculator(a, b);
    }
    /**
     *
     * @param expr entered expression to calculate
     * @return calculated expression
     */
    public double calculateExpression(String expr){

        ExpressionParser exprParser = new ExpressionParser(expr);
        OperationCalculator opCalc = getCalc(exprParser.getFirstOperand(), exprParser.getSecondOperand(), exprParser.getOperator());
        return opCalc.calculate();
    }
}
