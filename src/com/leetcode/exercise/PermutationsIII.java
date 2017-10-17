package com.leetcode.exercise;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;

public class PermutationsIII {
	public static void main(String[] args) {
		int[] nums = {1,1,2};
		List<List<Integer>> lists = permute(nums);
		System.out.println(lists);
	}
	
	static public List<List<Integer>> permute(int[] nums) {
		
		List<List<Integer>> lists = new ArrayList<List<Integer>>();
		List<Integer> list = new ArrayList<Integer>();
		
		helper(nums, lists, list);
	    return lists;
	}
	
	static public void helper(int[] nums, List<List<Integer>> lists, List<Integer> list){
		if(nums.length == list.size()){
			
			lists.add(new ArrayList<Integer>(list));
				
			return;
		}
		
		for(int i = 0 ; i < nums.length ; i++){
			if(list.contains(nums[i])) continue;
			list.add(nums[i]);
			helper(nums, lists, list);
			list.remove(list.size() - 1);
		}
	}
	
	
}
