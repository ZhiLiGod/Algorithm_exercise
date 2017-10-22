package com.leetcode.exercise;

public class BinarySearch {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6};
		System.out.println(binarySearch(a, 0));
	}
	
	static public int binarySearch(int[] a, int target){
		if(a == null) return -1;
		int left = 0;
		int right = a.length-1;
		while(left <= right){
			int middle = (left+right)/2;
			if(target == a[middle]){
				return middle;
			}else if(target > a[middle]){
				left = middle + 1;
			}else{
				right = middle - 1;
			}
		}
		return -1;
	}
}
