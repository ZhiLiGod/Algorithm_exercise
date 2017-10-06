package com.leetcode.exercise;

public class RemoveElement {
	public static void main(String[] numsrgs) {
		int[] nums = {3,2,2,3};
		int vnumsl = 3;
		System.out.println(removeElement(nums, vnumsl));
	}
	
	static public int removeElement(int[] nums, int val) {
		 int len = nums.length;
		    for (int i = 0 ; i< len; ++i){
		        while (nums[i]==val && i< len) {
		            nums[i]=nums[--len];
		        }
		    }
		    for(Integer i : nums){
		    	System.out.println(i);
		    }
		    return len;
        
    }
}
