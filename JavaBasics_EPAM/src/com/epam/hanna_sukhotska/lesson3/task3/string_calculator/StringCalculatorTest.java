package com.epam.hanna_sukhotska.lesson3.task3.string_calculator;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

/**
 * Created by sanna on 11.08.2017.
 */
public class StringCalculatorTest {
    @Rule
    public ExpectedException exceptions = ExpectedException.none();

    @Test
    public void emptyString(){
        StringCalculator stringCalculator = new StringCalculator();
        int result = stringCalculator.add("");
        assertEquals(0, result);
    }

    @Test
    public void oneString(){
        StringCalculator stringCalculator = new StringCalculator();
        int result = stringCalculator.add("1");
        assertEquals(1, result);
    }

    @Test
    public void twoString(){
        StringCalculator stringCalculator = new StringCalculator();
        int result = stringCalculator.add("1,2");
        assertEquals(1 + 2, result);
    }

    @Test
    public void unknownAmountOfNumbers(){
        StringCalculator stringCalculator = new StringCalculator();
        int result = stringCalculator.add("1,2,3,4,5,6,7,8,9");
        assertEquals(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9, result);
    }

    @Test
    public void newLineInsteadOfComma(){
        StringCalculator stringCalculator = new StringCalculator();
        int result = stringCalculator.add("1,2\n3");
        assertEquals(1 + 2 + 3, result);
    }

    @Test
    public void notAllowedNewLineAfterComma(){
        StringCalculator stringCalculator = new StringCalculator();
        stringCalculator.add("1,2,\n");
    }

    

}
