package com.leetcode.exercise;

public class LongestContinuousIncreasingSubsequence {
	public static void main(String[] args) {
		int[] nums = {1,3,5,4,7};
		System.out.println(findLengthOfLCIS(nums));
	}
	
	static public int findLengthOfLCIS(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int max = 1;
        int tmp = 1;
        for(int i = 1 ; i < nums.length ; i++){
        	if(nums[i] > nums[i-1]) tmp++;
        	else {
        		max = tmp > max ? tmp : max;
        		tmp = 1;
        	}
        }
        max = tmp > max ? tmp : max;
        return max;
    }
}
