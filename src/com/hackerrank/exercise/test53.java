package com.hackerrank.exercise;
import java.util.Arrays;
import java.util.Scanner;


public class test53 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for(int i = 0 ; i < n ; i++){
			a[i] = in.nextInt();
		}
		Arrays.sort(a);
		System.out.println(a[a.length/2]);
	}
}
