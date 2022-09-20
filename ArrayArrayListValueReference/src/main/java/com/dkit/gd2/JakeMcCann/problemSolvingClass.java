package com.dkit.gd2.JakeMcCann;

import java.util.Arrays;
import java.util.Scanner;

public class problemSolvingClass {
    private static Sanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        /*
        Create a program using arryas that sorts a list of ints in descending order.
        Descending order is highest to the lowest value.
        {1,2,3,4,5} > {5,4,3,2,1}
        Set up the program so that the numbers are read in from the keyboard.
        Implement the following method - getIntegers, printArray and sortIntegers
        getIntegers returns an array of ints entered via keyboard
        printArray prints the contents of the Array
        sortIntegers will sort the array and return a new array with the sorted values
        you will need to figure out how to copy the array elements from the passed
        to the new array , sort them and return the new sorted array
         */

        int[] myIntegers = getIntegers(5);
        int[] sorted = sortIntegers(myIntegers);

        sortIntegers(getIntegers);
        System.out.println(Arrays.toString(sortIntegers(getIntegers)));
    }

    private static int[] sortIntegers(int[] getIntegers)
    {
        int[] sortedNumbers = new int[getIntegers.length];

        for (int i = 0; i < getIntegers.length;  i++)
        {
            sortedNumbers[i] = getIntegers[i];
        }

        boolean flag =true;
    }


}
