package com.husseinabdallah.SpringBootMasterClass.leetCode;

import java.util.Arrays;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        System.out.println("nums: " + Arrays.toString(nums));
        int n = nums.length;
        System.out.println("length of array: " + n);
        for (int i = 0; i < n - 1 ; i++) {
            System.out.println("index: i " + i + " value: " + nums[i]);
            for (int j = i + 1; j < n; j++) {
                System.out.println("index: j " + j + " value: " + nums[j]);
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{};
    }



}
