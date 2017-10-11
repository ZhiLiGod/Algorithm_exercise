package com.leetcode.exercise;

import java.util.ArrayList;
import java.util.List;

public class GrayCode {
	public static void main(String[] args) {
		//System.out.println(Math.pow(3, 2));
		//System.out.println(2>>1);
		//System.out.println(1^7);
		System.out.println(grayCode(2));
	}
	
	static public List<Integer> grayCode(int n) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0 ; i < 1 << n ; i++){
        	list.add(i ^ i >> 1);
        }   
        return list;
	}
	
}
