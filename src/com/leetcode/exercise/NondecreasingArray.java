package com.leetcode.exercise;

public class NondecreasingArray {
	public static void main(String[] args) {
		int[] nums = {3,4,2,3};
		System.out.println(checkPossibility(nums));
	}
	
	static public boolean checkPossibility(int[] nums) {
		if(nums == null || nums.length == 0) return false;
        for(int i = 1 ; i < nums.length ; i++){
        	if(nums[i] < nums[i-1]){
        		return helper(nums, i, nums[i-1]) || helper(nums, i-1, nums[i]);
        	}
        }
        return true;
    }
	
	static public boolean helper(int[] nums, int index, int num){
		int tmp = nums[index];
		nums[index] = num;
		for(int i = 0 ; i < nums.length - 1 ; i++){
			if(nums[i] > nums[i+1]) {
				nums[index] = tmp;
				return false;
			}
		}
		return true;
	}
}
