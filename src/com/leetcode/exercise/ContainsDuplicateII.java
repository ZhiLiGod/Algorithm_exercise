package com.leetcode.exercise;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII {
	public static void main(String[] args) {
		int[] nums = {5, 0, 1, 2, 3, 4, 5};
		System.out.println(containsNearbyDuplicate(nums, 10));
	}
	//Given an array of integers and an integer k, 
	//find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] 
	//and the absolute difference between i and j is at most k.
	static public boolean containsNearbyDuplicate(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	    for (int i = 0; i < nums.length; i++) {
	        if (map.containsKey(nums[i])) {
	            if (i - map.get(nums[i]) <= k) return true;
	        }
	        map.put(nums[i], i);
	    }
	    return false;
    }
	
}
