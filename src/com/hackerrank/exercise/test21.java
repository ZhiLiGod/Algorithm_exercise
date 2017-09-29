package com.hackerrank.exercise;
import java.util.Scanner;


public class test21 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for(int i = 0 ; i < n ; i++){
			a[i] = in.nextInt();
		}
		int count = 0;
		for(int i = 0 ; i < n ; i++){
			for(int j = 0 ; j < n - 1 ; j++){
				if(a[j]>a[j+1]){
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					count++;
				}
			}
		}
		System.out.println("Array is sorted in " + count + " swaps");
		System.out.println("First Element: " + a[0]);
		System.out.println("Last Element: " + a[n - 1]);
	}
}
