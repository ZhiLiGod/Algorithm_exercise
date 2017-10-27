package com.leetcode.exercise;

import java.util.Arrays;

public class SingleNumber {
	public static void main(String[] args) {
		int[] nums = {1,2,2};
		System.out.println(singleNumber(nums));
	}
	
	static public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 1 ; i+=2){
        	if(nums[i] != nums[i + 1]) return nums[i];
        }
        return nums[nums.length-1];
    }
}
