package com.leetcode.exercise;

public class MaximumSubarray {
	public static void main(String[] args) {
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(nums));
	}
	
	static public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < nums.length ; i++){
        	if(sum < 0) sum = nums[i];
        	else sum += nums[i];
        	if(sum > max) max = sum;
        }
        return max;
    }
}
