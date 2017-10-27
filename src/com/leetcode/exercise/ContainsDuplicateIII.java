package com.leetcode.exercise;

import java.util.TreeSet;

public class ContainsDuplicateIII {
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 1};
		System.out.println(containsNearbyAlmostDuplicate(nums, 4, 0));
	}
	
	static public boolean containsNearbyAlmostDuplicate(int[] nums, int kk, int t) {
		if (nums.length < 2) return false;
        if (kk == 0) return false;
        TreeSet<Integer> window = new TreeSet<Integer>();
        
        for(int i=0;i<nums.length;i++) {

            // check dup, window size <= kk right now
        	if ( window.floor(nums[i] + t) !=null && window.floor(nums[i]+t) >= nums[i]-t ) return true;
        	
            window.add(nums[i]);
            
            
            if (i >= kk) {
                //remove one, the size has to be kk on the next fresh step
            	window.remove(nums[i-kk]);
            }
        }
        
        return false;
    }
}
