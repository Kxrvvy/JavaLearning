package org.example;
import java.util.Arrays;

public class ArraysDemo {
    public void arraysDemo() {
        /* One Dimensional Array */
        //arrays to list of items
        // arrays = fixed length
        // use toSt
        int [] numbers = {1,2,5,3,4};
        System.out.println(numbers.length); // show the length of array
        Arrays.sort(numbers); //sort the arrays
        System.out.println(Arrays.toString(numbers)); //use toString to output one-dimensional array


        /* Two Dimensional Array */
        // [2][3] = rows, cols

        //old way
        int [][] rowCol = new int[2][3];
        rowCol[0][0] = 1;
        System.out.println(Arrays.deepToString(rowCol)); //deepToString to output multi-dimensional Array

        // new way
        int [][] rowCol2 = {{1,4,2}, {3,5,6}};
        System.out.println(Arrays.deepToString(rowCol2));
    }
}
