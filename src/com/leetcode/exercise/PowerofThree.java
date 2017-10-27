package com.leetcode.exercise;

public class PowerofThree {
	public static void main(String[] args) {
		System.out.println(isPowerOfThree(29));
	}
	
	static public boolean isPowerOfThree(int n) {
		if(n == 0) return false;
        if(n == 1 || n == 3) return true;
        int i = 3;
        while(i < n/2){
        	if(i * 3 == n) return true;
        	i *= 3;
        }
        return false;
    }
}
