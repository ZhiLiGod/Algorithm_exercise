package com.leetcode.exercise;

import java.util.HashSet;
import java.util.Set;

public class NimGame {
	public static void main(String[] args) {
		System.out.println(canWinNim(5));
	}
	
	static public boolean canWinNim(int n) {
        /*if(n <= 0) return false;
        Set<Integer> set = new HashSet<Integer>();
        set.add(1);
        set.add(2);
        set.add(3);
        int i = 4;
        while(i <= n){
        	if(!set.contains(i-1)||
        			!set.contains(i-2)||
        			!set.contains(i-3)){
        		set.add(i);
        	}
        	i++;
        }
        return set.contains(n);*/
		return n % 4 == 0 ? false : true;
    }
}
