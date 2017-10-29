package com.leetcode.exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MajorityElement {
	public static void main(String[] args) {
		int[] nums = {3,2,3};
		System.out.println(majorityElement(nums));
	}
	
	static public int majorityElement(int[] nums) {
        int len = nums.length;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0 ; i < len ; i++){
        	if(map.containsKey(nums[i])){
        		int value = map.get(nums[i]) + 1;
        		map.put(nums[i], value);
        	}else
        		map.put(nums[i], 1);
        }
        System.out.println(map);
        int max = Integer.MIN_VALUE;
        int result = 0;
        Set<Integer> s = map.keySet();
        for(Integer i : s){
        	if(map.get(i) > max) {
        		max = map.get(i);
        		result = i;
        	}
        }
        return result;
	}
}
