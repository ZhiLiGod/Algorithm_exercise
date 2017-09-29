package com.hackerrank.exercise;
import java.util.Arrays;
import java.util.Scanner;


public class test26 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int x = in.nextInt();
		int[] a = new int[n];
		for(int i = 0 ; i < n ; i++){
			a[i] = in.nextInt();
		}
		System.out.println(solution(a, x));
	}
	
	static int solution(int[] a, int x){
		int count = 0;
		Arrays.sort(a);
		for(int i = 0 ; i < a.length - 1 ; i++){
			for(int j = i+1 ; j < a.length ; j++){
				if( a[i] == a[j] - x ){
					count++;
					break;
				}
				
			}
		}
		
		return count;
		
		
	}
}
