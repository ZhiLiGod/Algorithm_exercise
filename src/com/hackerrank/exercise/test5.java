package com.hackerrank.exercise;
import java.util.Arrays;


public class test5 {
	public static void main(String[] args) {
		int[] A = {0,1,1,1,1,5};
		int[] a = solve(10,12,50,20,20,10);
		System.out.println(a[0] + " " + a[1]);
//		long[] a = {1000000001, };
//		System.out.println(aVeryBigSum());
	}
	
	static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2){
	       int[] a = {0 , 0};
	       if(a0>b0)
	           a[0]++;
	        else if(a0<b0)
	            a[1]++;
	        if(a1>b1)
	           a[0]++;
	        else if(a1<b1)
	            a[1]++;
	        if(a2>a2)
	           a[0]++;
	        else if(a2<b2)
	            a[1]++;
	        return a;
	    }
	
	static public long aVeryBigSum(int n, long[] ar) {
        // Complete this function
		long sum = 0;
		for(Long l : ar){
			sum += l;
		}
		return sum;
    }
}
