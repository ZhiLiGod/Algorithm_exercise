package com.hackerrank.exercise;
import java.util.Scanner;


public class test9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        long[] arr = new long[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        solution(arr);
	}
	
	static void solution(long[] arr){
		long result[] = new long[arr.length];
		int count = 0;
		while(count < arr.length){
			for(int i = 0 ; i < arr.length ; i++){
				if(i != count){
					result[count] += arr[i];
				}
			}
			count++;
		}
		long min = result[0];
		long max = result[0];
		for(int i = 1 ; i < result.length ; i++){
			if(min>result[i]){
				min = result[i];
			}else if(max < result[i]){
				max = result[i];
			}
		}
		System.out.println(min + " " + max);
	}
}
