package com.leetcode.exercise;

import java.util.Arrays;
import java.util.List;

public class JumpGame {
	public static void main(String[] args) {
		int[] nums = {2,0,0,0};
		System.out.println(canJump(nums));
	}
	
	static public boolean canJump(int[] nums) {
		int max = 0;
	    for(int i=0;i<nums.length;i++){
	        if(i>max) {return false;}
	        max = Math.max(nums[i]+i,max);
	    }
	    return true;
    }
}
