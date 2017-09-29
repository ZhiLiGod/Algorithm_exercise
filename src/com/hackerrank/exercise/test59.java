package com.hackerrank.exercise;
import java.util.Arrays;
import java.util.Scanner;


public class test59 {
	public static void main(String[] args) {
		//Scanner in = new Scanner(System.in);
		int[] a = {1,2,3,4,7,8};
		int[] b = {4, 1, 3, 3, 8};
		String T = "pXpqp";
		System.out.println(solution(a));
		
	}
	
	static public int solution(int[] A) {
        Arrays.sort(A);
        int[] b = new int[A.length];
        int k = 0;
        int j = A.length-1;
        for(int i = 0 ; i < A.length ; i++){
        	if(A[i]>0){
        		b[k] = A[i];
        		k++;
        	}
        }
        for(Integer i : b){
        	System.out.print(i);
        }
        System.out.println();
        if(b[0]!=1){
        	return 1;
        }else{
        	for(int i = 1 ; i < b.length ; i++){
        		if(b[i] == 0){
        			j = i-1;
        			break;
        		}
        		if(b[i]>b[i-1]+1){
        			return b[i-1]+1;
        		}
        		
        	}
        	return b[j]+1;
        }
        
    }
	
}
