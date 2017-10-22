package com.leetcode.exercise;

public class MergeSort {
	public static void main(String[] args) {
		int[] nums = {10,9,100,20,50,0};
		int[] nums1 = new int[nums.length];
		separate(nums, nums1, 0, nums.length-1);
		for(Integer i : nums){
			System.out.print(i + " ");
		}
	}

	public static void separate(int[] nums, int[] nums1, int i, int j) {
		
		if(i < j){
			int middle = (i + j)/2;
			separate(nums, nums1, i, middle);
			separate(nums, nums1, middle+1, j);
			merge(nums, nums1, i, middle, j);
		}
		
	}

	public static void merge(int[] nums, int[] nums1, int i, int middle, int j) {
		int left = i;
		int right = middle+1;
		int k = 0;
		while(left <= middle && right <= j){
			if(nums[left] <= nums[right]){
				nums1[k] = nums[left];
				left++;
				k++;
			}else{
				nums1[k] = nums[right];
				right++;
				k++;
			}
		}
		while(left <= middle){
			nums1[k] = nums[left];
			k++;
			left++;
		}
		while(right <= j){
			nums1[k] = nums[right];
			right++;
			k++;
		}
		for(int x = 0; x < k ; x++){
			nums[i++] = nums1[x];
		}
	}
}
