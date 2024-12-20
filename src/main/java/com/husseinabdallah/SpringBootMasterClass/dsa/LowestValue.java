package com.husseinabdallah.SpringBootMasterClass.dsa;

import java.util.Arrays;

public class LowestValue {

    // Implementation
    // 1. Create a variable 'minVal' and set it equal to the first value of the array.
    // 2. Go through every element in the array.
    // 3. If the current element has a lower value than 'minVal', update 'minVal' to this value.
    // 4. After looking at all the elements in the array, the 'minVal' variable now contains the lowest value.

//    Variable 'minVal' = array[0]
//    For each element in the array
//    If current element < minVal
//            minVal = current element


    public static void lowestValue(int[] arr) {
        int minVal = arr[0];

//        for(int i : arr){
//            if (i < minVal){
//                minVal = i;
//            }
//        }

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < minVal) {
                    minVal = arr[i];
                }
            }

        System.out.println(minVal);
    }

    public static void main(String[] args) {

        lowestValue(new int[]{7, 12, 9, 4, 5, 11}
        );
    }


}
