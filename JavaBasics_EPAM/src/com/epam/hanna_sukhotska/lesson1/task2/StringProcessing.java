package com.epam.hanna_sukhotska.lesson1.task2;

import java.util.Scanner;

/**
 * @author Hanna Sukhotska
 */
public class StringProcessing {
    /** Method reads n strings from console */
    public String[] readStr(){
        Scanner scan = new Scanner(System.in); //to read from console
        System.out.println("Enter n: ");
        int n = scan.nextInt();
        String[] str = new String[n]; // an array of strings
        for (int i = 0; i < n ; i++) {
            System.out.println("Enter string: ");
            str[i] = scan.nextLine();
        }
        scan.close();
        return str;
    }

    /** Method displays strings with more than average length*/
    public void findLengthMoreThanAvg (String[] str){
        int sum = 0;
        for (int i = 0; i < str.length; i++) {
            sum += str[i].length(); // calculate sum of lengths
        }
        int avg = sum / str.length; // calculate average length

        int countStrings = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() > avg) {
                System.out.println("Str: " + str[i] + ". Length:" + str[i].length());
                countStrings++;
            }
        }

        if(countStrings == 0){
            System.out.println("All strings have the same length");
        }
    }

    /** Test method*/
    public static void test(){
        StringProcessing sp = new StringProcessing();
        String[] str = sp.readStr();
        sp.findLengthMoreThanAvg(str);
    }
}
