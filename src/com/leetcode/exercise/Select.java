package com.leetcode.exercise;

public class Select {
	public static int[] arr = {0, 10, 5, 20, 1, 0};
	public static void main(String[] args) {
		int[] nums = {1,2,3,6,5,10};
		//select(arr);
		quicksort(arr, 0, arr.length-1);
		print(arr);
		//insertsort(arr);
	}
	
	static public void select(int[] a){
		for(int i = 0; i < a.length - 1; i++){
			int min = i;
			for(int j = i+1; j < a.length ; j++){
				if(a[min] > a[j]) min = j;
			}
			int tmp = a[i];
			a[i] = a[min];
			a[min] = tmp;
		}
		print(a);
		//System.out.println();
	}
	
	static public void quick(int[] a, int start, int end){
		int pivot = a[(start+end)/2];
		int i = start;
		int j = end;
		while(i <= j){
			while(a[i] < pivot){
				i++;
			}
			while(a[j] > pivot){
				j--;
			}
			if(i <= j){
				int tmp = a[i];
				a[i] = a[j];
				a[j] = tmp;
				i++;
				j--;
			}
		}
		if(start < j){
			quick(a, start, j);
		}
		if(end > i){
			quick(a, i, end);
		}
		
	}
	
	
	static public void print(int[] a){
		for(Integer i : a){
			System.out.print(i + " ");
		}
	}
	
	static public void quicksort(int[] a, int start, int end){
		int i = start;
		int j = end;
		int pivot = a[(i+j)/2];
		while(i <= j){
			while(a[i] < pivot){
				i++;
			}
			while(a[j] > pivot){
				j--;
			}
			if(i <= j){
				int tmp = a[i];
				a[i] = a[j];
				a[j] = tmp;
				i++;
				j--;
			}
		}
		if(start < j){
			quicksort(a, start, j);
		}
		if(end > i){
			quicksort(a, i, end);
		}
	}
	
	static public void insert(int[] a){
		int j = 0;
		for(int i=0; i<a.length; i++){
			int tmp = a[i];
			for(j = i; j > 0 && tmp < a[j-1]; j-- ){
				a[j] = a[j-1];
			}
			a[j] = tmp;
		}
		print(a);
		
	}
	
	static public void insertsort(int[] a){
		int j = 0;
		for(int i = 0 ; i < a.length ; i++){
			int tmp = a[i];
			for(j = i ; j>0 && tmp < a[j-1] ; j--){
				a[j] = a[j-1];
			}
			a[j] = tmp;
		}
		print(a);
	}
}
