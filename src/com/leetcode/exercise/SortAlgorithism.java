package com.leetcode.exercise;

import java.util.ArrayList;
import java.util.List;

public class SortAlgorithism {
	
	static private int[] arr = {5,4,8,3,2,1,0};
	static private int[] arr1 = new int[7];
	static private int[] arr2 = {1,2,5,6,7,8,9};
	static private int[] arr3 = {2,3,4};
	public static void main(String[] args) {
		//bubble(arr);
		//select(arr);
		//insert(arr);
		//quick(arr, 0, 5);
		//separate(arr, arr1, 0, arr.length-1);
//		System.out.println(binarySearch(arr2, 90));
//		for(Integer i : arr){
//			System.out.print(i + " ");
//		}
		System.out.println(permutation(arr3));
	}
	
	static public void bubble(int[] arr){
		for(int i = 0 ; i < arr.length - 1 ; i++){
			int min = i;
			for(int j = i + 1 ; j < arr.length ; j++){
				if(arr[j] < arr[i]) min = j;
			}
			int tmp = arr[i];
			arr[i] = arr[min];
			arr[min] = tmp;
		}
	}
	
	static public void select(int[] arr){
		int min, j;
		for(int i = 0 ; i < arr.length ; i++){
			min = arr[i];
			for(j = i ; j > 0 && min < arr[j-1] ; j--){
				arr[j] = arr[j-1];
			}
			arr[j] = min;
		}
	}
	
	static public void insert(int[] arr){
		int tmp, j;
		for(int i = 0 ; i < arr.length ; i++){
			tmp = arr[i];
			for(j = i ; j>0 && tmp < arr[j-1] ; j--){
				arr[j] = arr[j-1];
			}
			arr[j] = tmp;
		}
	}
	
	static public void quick(int[] arr, int left, int right){
		int i = left, j = right;
		int pivat = arr[(i+j)/2];
		while(i <= j){
			while(arr[i] < pivat) i++;
			while(arr[j] > pivat) j--;
			if(i <= j){
				int tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
				i++;
				j--;
			}
		}
		if(left < j) quick(arr, left, j);
		if(right > i) quick(arr, i, right);
	}
	
	static public void separate(int[] arr, int[] arr1, int left, int right){
		if(left < right){
			int mid = (left + right)/2;
			separate(arr, arr1, left, mid);
			separate(arr, arr1, mid + 1, right);
			merge(arr, left, mid, right, arr1);
		}
	}
	
	static public void merge(int[] arr, int left, int mid, int right, int[] arr1){
		int i = left, j = mid + 1;
		int k = 0;
		while(i <= mid && j <= right){
			if(arr[i] <= arr[j]) arr1[k++] = arr[i++];
			else arr1[k++] = arr[j++];
		}
		while(i <= mid) arr1[k++] = arr[i++];
		while(j <= right) arr1[k++] = arr[j++];
		for(int x = 0 ; x < k ; x++) arr[left++] = arr1[x];
	}
	
	static public int binarySearch(int[] arr, int target){
		int i = 0, j = arr.length-1;
		while(i <= j){
			int mid = (i + j)/2;
			if(arr[mid] == target) return mid;
			else if(arr[mid] > target) j = mid - 1;
			else if(arr[mid] < target) i = mid + 1;
		}
		return -1;
	}
	
	static public List<List<Integer>> permutation(int[] nums){
		if(nums == null || nums.length == 0) return null;
		List<List<Integer>> lists = new ArrayList<List<Integer>>();
		List<Integer> list = new ArrayList<Integer>();
		helper(lists, list, nums);
		return lists;
	}
	
	static public void helper(List<List<Integer>> lists, List<Integer> list, int[] nums){
		if(list.size() == nums.length){
			lists.add(new ArrayList<Integer>(list));
			return;
		}
		for(int i = 0 ; i < nums.length ; i++){
			if(list.contains(nums[i])) continue;
			list.add(nums[i]);
			helper(lists, list, nums);
			list.remove(list.size()-1);
		}
	}
}
