package com.leetcode.exercise;

public class SortAlgorithism {
	
	static private int[] arr = {5,4,8,3,2,1};
	static private int[] arr1 = new int[6];
	public static void main(String[] args) {
		//bubble(arr);
		//select(arr);
		//insert(arr);
		//quick(arr, 0, 5);
		separate(arr, arr1, 0, arr.length-1);
		for(Integer i : arr){
			System.out.print(i + " ");
		}
	}
	
	static public void bubble(int[] arr){
		for(int i = 0 ; i < arr.length - 1 ; i++){
			for(int j = 0 ; j < arr.length - 1 - i ; j++){
				if(arr[j] > arr[j+1]){
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
	}
	
	static public void select(int[] arr){
		int min;
		for(int i = 0 ; i < arr.length ; i++){
			min = i;
			for(int j = i + 1 ; j < arr.length ; j++){
				if(arr[j] < arr[min]) min = j;
			}
			int tmp = arr[i];
			arr[i] = arr[min];
			arr[min] = tmp;
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
		int pivit = arr[(i+j)/2];
		while(i <= j){
			while(arr[i] < pivit) i++;
			while(arr[j] > pivit) j--;
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
			separate(arr, arr1, mid+1, right);
			merge(arr, left, mid, right, arr1);
		}
	}
	
	static public void merge(int[] arr, int left, int mid, int right, int[] arr1){
		int i = left, j = mid + 1;
		int k = 0;
		while(i <= mid && j <= right){
			if(arr[i] <= arr[j]){
				arr1[k] = arr[i];
				i++;
				k++;
			}else{
				arr1[k] = arr[j];
				j++;
				k++;
			}
		}
		while(i <= mid){
			arr1[k] = arr[i];
			i++;
			k++;
		}
		while(j <= right){
			arr1[k] = arr[j];
			j++;
			k++;
		}
		for(int x = 0 ; x < k ; x++){
			arr[left++] = arr1[x];
		}
	}
}
