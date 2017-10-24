package com.leetcode.exercise;

import java.util.HashMap;
import java.util.Map;

public class ClimbingStairs {
	public static void main(String[] args) {
		System.out.println(climbStairs(5));
	}
	public static Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	static public int climbStairs(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 2;
        if(map.containsKey(n)) return map.get(n);
        int result = climbStairs(n-1) + climbStairs(n-2);
        map.put(n, result);
        return result;
        
    }
	
	
}
