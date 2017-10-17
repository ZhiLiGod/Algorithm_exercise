package com.leetcode.exercise;

public class SearchinRotatedSortedArrayII {
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5};
		System.out.println(search(nums, 3));
	}
	
	static public boolean search(int[] nums, int target) {
        if(nums.length == 0 || nums == null) return false;
		int len = nums.length;
        int left = 0;
        int right = len - 1;
        while(left < right){
        	int m = (left + right)/2;
        	if(nums[left] == nums[right]){
        		left++;
        	}else{
        		if(nums[m] > nums[right]) left = m + 1;
            	else right = m;
        	}  	
        }
        if(nums[left] <= target && nums[len-1] >= target) right = len - 1;
        else {
        	left = 0;
        	right -= 1;
        }
        while(left <= right){
        	int mid = (left + right)/2;
        	if(nums[mid] == target) return true;
        	if(nums[mid] > target) right = mid - 1;
        	else left = mid + 1;
        }
        return false;
    }
}
