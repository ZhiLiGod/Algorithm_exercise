package com.leetcode.exercise;

public class PowerofTwo {
	public static void main(String[] args) {
		System.out.println(8 & 1);
		System.out.println(isPowerOfTwo(16));
	}
	
	static public boolean isPowerOfTwo(int n) {
        if(n <= 0) return false;
        int bitCount = 0;
        for(int i = 0 ; i < 32 ; i++){
        	if((n & 1) == 1) bitCount++;
        	n = n >> 1;
        }
        return bitCount == 1;
    }
}
