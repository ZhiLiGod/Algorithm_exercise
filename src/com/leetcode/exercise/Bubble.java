package com.leetcode.exercise;

public class Bubble {
	public static void main(String[] args) {
		int[] nums = {9,8,7,6,5};
		bubble(nums);
	}
	
	static public void bubble(int[] a){
		for(int i = 0; i < a.length - 1; i++){
			for(int j = 0; j < a.length - i - 1; j++){
				if(a[j] > a[j+1]){
					int tmp = a[j];
					a[j] = a[j+1];
					a[j+1] = tmp;
				}
			}
		}
		for(Integer i : a){
			System.out.print(i);
		}
	}
}
