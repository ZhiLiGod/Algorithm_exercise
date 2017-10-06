package com.leetcode.exercise;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;

public class Permutations {
	public static void main(String[] args) {
		int[] nums = {1,2,3};
		List<List<Integer>> list = permute(nums);
		for(List ll : list){
			System.out.println(ll);
		}
	}
	
	static public List<List<Integer>> permute(int[] nums) {
		
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		List<Integer> l = new ArrayList<Integer>();
		
		generate(list, l, 0, nums);
	    return list;
	}
	
	static public void generate(List<List<Integer>> list, List<Integer> l, int i, int[] nums){
		if(l.size() == nums.length){
			list.add(l);
			return;
		}
		for(int k = 0 ; k <= l.size() ; k++){
			List<Integer> dummy = new ArrayList<Integer>(l);
			dummy.add(k, nums[i]);
			generate(list, dummy, i + 1, nums);
		}
		
	}
}
