package com.hackerrank.exercise;
import java.util.Scanner;


public class test19 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        solution(a, k);
    }
	
	static void solution(int[] a, int k){
		int[] b = new int[a.length];
		k = k % a.length;
		for(int i = 0 ; i < a.length ; i++){
			if(i - k >= 0){
				b[i-k] = a[i];
			}else{
				b[a.length + i - k] = a[i];
			}
			
		}
		
		for(Integer i : b){
			System.out.println(i);
		}
	}
}
