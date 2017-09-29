package com.hackerrank.exercise;
import java.util.Scanner;


public class test57 {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i = 0 ; i < n ; i++){
			int money = in.nextInt();
			int number = in.nextInt();
			int[] a = new int[number];
			for(int j = 0 ; j < number ; j++){
				a[j] = in.nextInt();
				//System.out.println(a[i]);
			}
			
			solution(a, money);
		}
	
	
	}
	
	static void solution(int[] a, int money){
		
		
		
		for(int i = 0 ; i < a.length - 1 ; i++){
			for(int j = i + 1 ; j < a.length ; j++){
				if(a[i] + a[j] == money){
					System.out.println(i+1 + " " + (j+1));
				}
			}
		}
	}
}
