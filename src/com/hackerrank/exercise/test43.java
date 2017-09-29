package com.hackerrank.exercise;
import java.util.Scanner;


public class test43 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for(int i = 0 ; i < n ; i++){
			a[i] = in.nextInt();
		}
		
		int pivot = a[0];
		int left = 0;
		int right = a.length - 1;
		int[] b = new int[n];
		for(int i = 1 ; i < n ; i++){
			if(a[i] >= pivot){
				b[right] = a[i];
				right--;
			}else{
				b[left] = a[i];
				left++;
			}
			
		}
		b[right] = pivot;
		//System.out.println(left + " " + right);
		for(Integer i : b){
			System.out.print(i + " ");
		}
	}
}
