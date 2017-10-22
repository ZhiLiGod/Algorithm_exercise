package com.leetcode.exercise;

public class Merge {
	public static void main(String[] args) {
		int[] nums = {10,9,100,20,50,0};
		int[] nums1 = new int[nums.length];
		separate(nums, nums1, 0, nums.length-1);
		for(Integer i : nums){
			System.out.print(i + " ");
		}
	}
	
	static public void separate(int[] arr , int[] arr1 , int left , int right){
		if(left < right){//when left less than right
			int middle;//declare middle virable
			middle = (left + right)/2;//set middle's value
			//recursive separate() in order to divide left part
			separate(arr , arr1 , left , middle);
			//recursive separate() in order to divide right part
			separate(arr , arr1 , middle + 1 , right);
			//call merge to merge two subarrays
			merge(arr,arr1,left,middle,right);
		}
	}
	
	static public void merge(int[] arr , int[] arr1 , int left , int middle , int right){
		int i = left;//declare i equals left
		int j = middle + 1;//declare j equals middle+1
		int k = 0;//declare k equals 0		
		while (i <= middle && j <= right){//while loop
			if(arr[i] <= arr[j]){
				//compare two subarrays and sorting
				//store result in arr1
				arr1[k] = arr[i];
				k++;
				i++;
			}else {
				arr1[k] = arr[j];
				k++;
				j++;
			}		
		}		
		while(i <= middle){
			//if there is still number in arr,
			//then store them in arr1
			arr1[k] = arr[i];
			k++;
			i++;
		}		
		while(j <= right){
			//if there is still number in arr,
			//then store them in arr1
			arr1[k] = arr[j];
			k++;
			j++;
		}	
		for(int m = 0 ; m < k ; m++){
			//save whole arr1's values in arr
			arr[left++] = arr1[m];
		}		
		
	}
}
