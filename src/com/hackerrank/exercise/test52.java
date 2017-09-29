package com.hackerrank.exercise;
import java.util.Arrays;
import java.util.Scanner;


public class test52 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for(int i = 0 ; i < n ; i++){
			a[i] = in.nextInt();
		}
		
		Arrays.sort(a);
		int min = a[1] - a[0];
		for(int i = 1 ; i < a.length ; i++){
			if(a[i]-a[i-1]<min){
				min = a[i] - a[i-1];
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 1 ; i < a.length ; i++){
			if(a[i] - a[i-1] == min){
				sb.append(a[i-1]).append(" ").append(a[i]).append(" ");
			}
		}
		//System.out.println(min);
		System.out.println(sb);
	}
}
