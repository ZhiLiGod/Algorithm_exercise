package com.hackerrank.exercise;
import java.util.Arrays;
import java.util.Scanner;


public class test55 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i = 0 ; i < n ; i++){
			int t = in.nextInt();
			int[] a = new int[t];
			for(int j = 0 ; j < t ; j++){
				a[j] = in.nextInt();
			}
			System.out.println(solution(a));
		}
		
	}
	
	static int solution(int[] a){
		int count = 0;
		int[] b = a;
		Arrays.sort(b);
		if(a.toString().equals(b.toString())){
			return 0;
		}
		for(int i = 1 ; i < a.length ; i++){
			if(a[i]<a[i-1]){
				int temp = a[i];
				int j = i;
				while(j>0&&a[j-1]>temp){
					a[j] = a[j-1];
					j--;
					count++;
				}
				a[j] = temp;
			}
		}
		
		return count;
	}
}
