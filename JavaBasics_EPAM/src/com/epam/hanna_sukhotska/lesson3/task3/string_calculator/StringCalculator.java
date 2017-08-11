package com.epam.hanna_sukhotska.lesson3.task3.string_calculator;

/**
 * Created by sanna on 11.08.2017.
 */
public class StringCalculator {
    private static int[] parser(String str){
        str = str.replace('\n', ',');
        String [] args = str.split(",");
        int[] numbers = new int[args.length];
        if (args[0].isEmpty()){
            numbers[0] = 0;
        }
        else {
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = Integer.parseInt(args[i]);
            }
        }
        return numbers;
    }

    public int add(String numbers){
        int[] nums = parser(numbers);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        StringCalculator c = new StringCalculator();
        System.out.println(c.add("1,\n"));
    }
}
