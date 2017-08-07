package com.epam.hanna_sukhotska.lesson1.task1;

/**
 * @author Hanna Sukhotska
 */

public class ArraysUtil{

    /** Method generates an array of a given length and fills it with random numbers */
    public int[] generateArray(int length){
        int[] array = new int[length];
        for (int i = 0; i < array.length ; i++) {
            array[i] = (int)(Math.random() * 20) - 10; //generating numbers from -10 to 10
        }
        return array;
    }

    /** Method displays an array in console */
    public void print(int[] array){
        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i] + " ");
        }
    }

    /** Method returns sum of elements on even positions*/
    public int sumOfEvenElements(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length ; i+= 2) {
            sum += array[i];
        }
        return sum;
    }

    /** Test-method */
    public static void test() {
        ArraysUtil util = new ArraysUtil();

        int[] array = util.generateArray(20);
        util.print(array);
        System.out.println("\nSum of elements on even positions: " + util.sumOfEvenElements(array));
    }
}
