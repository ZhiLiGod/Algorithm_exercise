package com.hackerrank.exercise;
import java.util.Scanner;


public class test7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for(int i = 0 ; i < n ; i++){
			a[i] = in.nextInt();
		}
		solution(n, a);
	}
	
	static public void solution(int n, int[] a){
		int[] number = {0,0,0};
		for(int i = 0 ; i < n ; i++){
			if(a[i]>0)
				number[0]++;
			else if(a[i]<0)
				number[1]++;
			else 
				number[2]++;
		}
		//System.out.println("" + number[0]+number[1]+number[2]);
		for(int i = 0 ; i < 3 ; i++)
		{
			double result = 0.0;
			result = number[i]*1.0/n;
			System.out.println(String.format("%.6f", result));
		}
		
	}
}
