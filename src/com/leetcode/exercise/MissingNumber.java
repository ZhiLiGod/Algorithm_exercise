package com.leetcode.exercise;

import java.util.Arrays;

public class MissingNumber {
	public static void main(String[] args) {
		int[] nums = {0,1,2,3,4,6};
		System.out.println(missingNumber(nums));
	}
	
	static public int missingNumber(int[] nums) {
		Arrays.sort(nums);
        if(nums == null || nums.length == 0 || nums[0] != 0) return 0;      
        int i;
        for(i = 0 ; i < nums.length - 1 ; i++){
        	if(nums[i+1]-1 != nums[i]) break;
        }
        return nums[i] + 1;
    }
}
