package com.leetcode.exercise;

import java.util.ArrayList;
import java.util.List;

public class Practice {
	
	static int[] arr = {5,4,8,3,2,1};
	static int[] arr1 = new int[arr.length];
	public static void main(String[] args) {
		//System.out.println(permutation("abc"));
		//bubblesort(arr);
		//select(arr);
		//insert(arr);
		quick(arr, 0, arr.length-1);
		//separate(arr, arr1, 0, arr.length-1);
		for(Integer i : arr){
			System.out.print(i+ " ");
		}
	}
	
	static public List<List<Character>> permutation(String a){
		char[] c = a.toCharArray();
		List<List<Character>> lists = new ArrayList<List<Character>>();
		List<Character> list = new ArrayList<Character>();
		helper(c, lists, list);
		return lists;
	}
	
	static public void helper(char[] c, List<List<Character>> lists, List<Character> list){
		if(list.size() == c.length){
			lists.add(new ArrayList<Character>(list));
			return;
		}
		for(int i = 0 ; i < c.length ; i++){
			if(list.contains(c[i])) continue;
			list.add(c[i]);
			helper(c, lists, list);
			list.remove(list.size()-1);
		}
		
	}
	
	
	static public void bubblesort(int[] a){
		for(int i = 0 ; i < a.length - 1 ; i++){
			for(int j = 0 ; j < a.length - i - 1; j++){
				if(a[j] > a[j+1]){
					int tmp = a[j];
					a[j] = a[j+1];
					a[j+1] = tmp;
				}
			}
		}
	}
	
	static public void select(int[] a){
		for(int i = 0 ; i < a.length - 1 ; i++){
			int min = i;
			for(int j = i+1; j< a.length ; j++){
				if(a[min] > a[j]) min = j;
			}
			int tmp = a[i];
			a[i] = a[min];
			a[min] = tmp;
		}
	}
	
	static public void insert(int[] a){
		int j;
		for(int i = 0 ; i < a.length ; i++){
			int tmp = a[i];
			for(j = i; j > 0 && tmp < a[j-1] ; j--){
				a[j] = a[j-1];
			}
			a[j] = tmp;
		}
	}
	
	static public void quick(int[] a, int left, int right){
		int i = left;
		int j = right;
		int pivot = a[(i+j)/2];
		while(i <= j){
			while(a[i] < pivot) i++;
			while(a[j] > pivot) j--;
			if(i <= j){
				int tmp = a[i];
				a[i] = a[j];
				a[j] = tmp;
				i++;
				j--;
			}
		}
		if(left < j){
			quick(a, left, j);
		}
		if(right > i){
			quick(a, i, right);
		}
	}
	
	
	public static void separate(int[] a, int[] a1, int left, int right){
		if(left < right){
			int middle = (left+right)/2;
			separate(a, a1, left, middle);
			separate(a, a1, middle+1, right);
			merge(a, a1, left, middle, right);
		}
	}
	
	public static void merge(int[] a, int[] a1, int left, int middle, int right){
		int i = left;
		int j = middle + 1;
		int k = 0;
		while(i <= middle && j <= right){
			if(a[i] <= a[j]){
				a1[k] = a[i];
				i++;
				k++;
			}else{
				a1[k] = a[j];
				j++;
				k++;
			}
		}
		while(i <= middle){
			a1[k] = a[i];
			k++;
			i++;
		}
		while(j <= right){
			a1[k] = a[j];
			k++;
			j++;
		}
		for(int x = 0 ; x < k ; x++){
			a[left] = a1[x];
			left++;
		}
	}
}
