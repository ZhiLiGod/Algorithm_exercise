package com.leetcode.exercise;

import java.util.Arrays;

public class MaximumProductofThreeNumbers {
	public static void main(String[] args) {
		
		int[] nums = {-1,-2,-3};
		System.out.println(maximumProduct(nums));
		
	}
	
	static public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int a = nums[len-1]*nums[len-2]*nums[len-3];
        int b = nums[0]*nums[1]*nums[len-1];
        return a > b ? a : b;
    }
}
