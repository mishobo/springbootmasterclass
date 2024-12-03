package com.husseinabdallah.SpringBootMasterClass.leetCode.sumoftwo;

import java.util.Arrays;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        System.out.println("nums: " + Arrays.toString(nums));
        System.out.println("target: " + target);
        int n = nums.length;
        System.out.println("length of array: " + n);
        for (int i = 0; i < n - 1 ; i++) {
            System.out.println("index: i " + i + " value: " + nums[i]);
            for (int j = i + 1; j < n; j++) {
                System.out.println("index: j " + j + " value: " + nums[j]);
                int sum = nums[i] + nums[j];
                System.out.println(nums[i] + " + " + nums[j] + " = " + sum);
                if (sum == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{};
    }



}
