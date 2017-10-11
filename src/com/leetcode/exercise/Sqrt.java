package com.leetcode.exercise;

public class Sqrt {
	public static void main(String[] args) {
		System.out.println(mySqrt(0));
	}
	
	static public int mySqrt(int x) {
        for(int i = 1 ; i <= x ; i++){
        	if(Math.pow(i, 2) == x || Math.pow(i+1, 2) > x){
        		return i;
        	}
        }	
		return 0;
    }
}
