package com.leetcode.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
	public static void main(String[] args) {
		int[] nums = {-1, 0, 1, 2, -1, -4};
		List<List<Integer>> lists = threeSum(nums);
		for(List<Integer> list : lists){
			System.out.println(list);
		}
	}
	
	static public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        for(int i = 0 ; i < nums.length - 2 ; i++){
        	for(int j = i+1 ; j < nums.length - 1 ; j++){
        		for(int k = j+1 ; k < nums.length ; k++){
        			if((nums[i] + nums[j] + nums[k] == 0) && k != i && k != j && i != j){      				
        				if(!lists.contains(Arrays.asList(nums[i], nums[j], nums[k]))){
        					lists.add(Arrays.asList(nums[i], nums[j], nums[k]));
        					break;
        				}     				
        			}
        		}
        	}
        }
        return lists;
    }
}
