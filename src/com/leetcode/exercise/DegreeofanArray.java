package com.leetcode.exercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DegreeofanArray {
	public static void main(String[] args) {
		int nums[] = {1, 2, 2, 3, 1, 1};
		System.out.println(findShortestSubArray(nums));
	}
	
	static public int findShortestSubArray(int[] nums) {
		if(nums == null) return -1;
        Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
        for(int i = 0 ; i < nums.length ; i++){
        	if(map.containsKey(nums[i])){
        		map.get(nums[i]).add(i);
        	}else{
        		List<Integer> l = new ArrayList<Integer>();
        		l.add(i);
        		map.put(nums[i], l);
        	}
        }
        System.out.println(map);
        List<Integer> list = new ArrayList<Integer>();
        for(List<Integer> l : map.values()){
        	if(l.size() > list.size()) list = l;
        	else if(l.size() == list.size()){
        		if((l.get(l.size()-1) - l.get(0)) < (list.get(list.size()-1) - list.get(0))){
        			list = l;
        		}
        	}
        }
        return list.get(list.size()-1) - list.get(0) +1;
        
    }
}
