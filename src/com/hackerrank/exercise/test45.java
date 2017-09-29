package com.hackerrank.exercise;
import java.util.Scanner;


public class test45 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		int[] count = new int[100];
		for(int i = 0 ; i < n ; i++){
			a[i] = in.nextInt();
		}
		
		for(Integer i : a){
			count[i]++;
		}
		
		for(Integer i : count){
			System.out.print(i + " ");
		}
	}
}
