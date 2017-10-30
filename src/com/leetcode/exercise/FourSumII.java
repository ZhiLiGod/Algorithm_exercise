package com.leetcode.exercise;

import java.util.HashMap;
import java.util.Map;

public class FourSumII {
	public static void main(String[] args) {
		int[] a = {1,2};
		int[] b = {-2,-1};
		int[] c = {-1,2};
		int[] d = {0,2};
		System.out.println(fourSumCount(a, b, c, d));
	}
	
	static public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int count = 0;
        for(int i = 0 ; i < A.length ; i++){
        	for(int j = 0 ; j < B.length ;j++){
        		if(map.containsKey(A[i] + B[j])){
        			int value = map.get(A[i] + B[j]) + 1;
        			map.put(A[i] + B[j], value);
        		}else{
        			map.put(A[i]+B[j], 1);
        		}
        	}
        }
        for(int i = 0 ; i < C.length ; i++){
        	for(int j = 0 ; j < D.length ; j++){
        		if(map.containsKey(-1*(C[i] + D[j]))){
        			count += map.get(-1*(C[i] + D[j]));
        		}
        	}
        }
        return count;
        
    }
}
