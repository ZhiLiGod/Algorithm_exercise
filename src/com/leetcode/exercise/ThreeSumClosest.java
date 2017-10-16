package com.leetcode.exercise;

public class ThreeSumClosest {
	public static void main(String[] args) {
		int target = 20;
		int[] nums = {8,1,2,14};
		int res = threeSumClosest(nums, target);
		System.out.println(res);
	}
	
	static public int threeSumClosest(int[] nums, int target) {
		if(nums == null || nums.length == 0) return 0;
        int cha = Integer.MAX_VALUE;
        int result = 0;
        for(int i = 0 ; i < nums.length - 2 ; i++){
        	for(int j = i + 1 ; j < nums.length - 1 ; j++){
        		for(int k = j + 1 ; k < nums.length ; k++){
        			if(nums[i] + nums[j] + nums[k] == target){
        				return target;
        			}else if(Math.abs((nums[i] + nums[j] + nums[k]) - target) < cha){
        				cha = Math.abs((nums[i] + nums[j] + nums[k]) - target);
        				result = nums[i] + nums[j] + nums[k];
        			}
        		}
        	}
        }
        return result;
    }
}
