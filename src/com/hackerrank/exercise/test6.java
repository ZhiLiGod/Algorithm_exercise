package com.hackerrank.exercise;
import java.util.Scanner;


public class test6 {
	public static void main(String[] args) {
		int n = 0;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		int[][] a = new int[n][n];
		for(int i = 0 ; i < n ; i++){
			for(int j = 0 ; j < n ; j++){
				a[i][j] = in.nextInt();
			}
		}
		System.out.println(result(n, a));
		
	}
	
	public static int result(int n, int[][] a){
		int result = 0;
		for(int i = 0 ; i < n ; i++){
			for(int j = 0 ; j < n ; j++){
				if(i == j){
					result += a[i][j];
					//System.out.println(result);
				}
				if(i + j == n-1){
					result -= a[i][j];
					//System.out.println(result);
				}
			}
		}
		
		return Math.abs(result);
		
	}
}
