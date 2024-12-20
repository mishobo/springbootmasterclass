package com.husseinabdallah.SpringBootMasterClass.dsa;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSorting {

    // implementation
    // 1. An array with values to sort.
    // 2. An inner loop that goes through the array and swaps values if the first value is higher than the next value.
    // This loop must loop through one less value each time it runs.
    // 3. An outer loop that controls how many times the inner loop must run. For an array with n values,
    // this outer loop must run n-1 times.

    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90, 5};
        int[] array2 = {7, 3, 9, 12, 11};
       // bubbleSort(array);
        bubbleSorting(array2);
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j ++ ){
                if ( array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        System.out.print("Sorted array: "+ Arrays.toString(array));
    }


    public static void bubbleSorting(int[] array){
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if(array[j] > array[j+1]){
                    array[j] = array[j+1];
                    array[j+1] = array[j];
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }

        System.out.print("Sorted array: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

}
