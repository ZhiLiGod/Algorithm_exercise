package com.hackerrank.exercise;
import java.util.Scanner;


public class test38 {
	static void solution(int[] arr){
		for(int i = 1 ; i < arr.length ; i++){
			int k = arr[0];
			int index = 0;
			if(arr[i - 1] > arr[i]){
				int temp = arr[i];
				int j = i;
				
				while(j>0 && arr[j - 1] > temp){
					arr[j] = arr[j-1];
					j--;
				}
				arr[j] = temp;
				index = j;
				k = arr[j+1];
			}
			for(int x = 0 ; x < arr.length ; x++){
//				if(x == index){
//					System.out.print(k);
//					continue;
//				}
				System.out.print(arr[x]+" ");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ; i < n ; i++){
			arr[i] = in.nextInt();
		}
		solution(arr);
	}
}
