package com.leetcode.exercise;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
	public static void main(String[] args) {
		System.out.println(isHappy(2));
	}
	
	static public boolean isHappy(int n) {
        Set<Integer> s = new HashSet<Integer>();
        int result = 0;
        while(s.add(n)){   	
        	while(n > 0){
        		result += Math.pow(n%10, 2);
        		n = n/10;
        	}
        	if(result == 1) return true;
        	else{
        		n = result;
        		result = 0;
        	}
        }
        return false;
    }
}
