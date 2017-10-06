package com.leetcode.exercise;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicatesfromSortedArray {
	public static void main(String[] args) {
		int[] nums = {1,1,2,2};
		System.out.println(removeDuplicates(nums));
	}
	
	static public int removeDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0 ; i < nums.length ; i++){
        	set.add(nums[i]);
        }
        return set.size();
    }
}
