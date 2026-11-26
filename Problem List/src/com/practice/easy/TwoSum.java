package com.practice.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Leet Code Problem Number: 1
 * <p>
 * You are given an array of integers nums and an integer target, return indices of the two numbers such that they
 * add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 */
public class TwoSum {

    public static void main(String[] args) {
        // Test 1
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        // Expected Output: [0,1]
        System.out.println(Arrays.toString(twoSum(nums1, target1)));

        // Test 2
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        // Expected Output: [0,1]
        System.out.println(Arrays.toString(twoSum(nums2, target2)));

        // Test 3
        int[] nums3 = {3, 3};
        int target3 = 6;
        // Expected Output: [0,1]
        System.out.println(Arrays.toString(twoSum(nums3, target3)));
    }

    private static int[] twoSum(int[] nums, int target) {

        // 3 - using map to store value in <value, index>
        Map<Integer, Integer> numMap = new HashMap<>();

        // 1 - Iterating through loop
        for (int i = 0; i < nums.length; i++) {
            // 2 - checking reminder ( 9 - 2 = 7 )
            int reminder = target - nums[i];

            // 4 - getting the index, if the value is not there in the map
            // it will return null, else will return the index
            Integer index = numMap.get(reminder);
            if (index != null)
                // 6 - returning matching index
                return new int[]{index, i};

            // 5 - storing the value and index of that value in map
            numMap.put(nums[i], i);
        }
        // 7 - if no match returning empty
        return new int[]{};
    }
}
