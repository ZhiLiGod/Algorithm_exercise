package com.leetcode.exercise;

public class SearchInsertPosition {
	public static void main(String[] args) {
		int nums[]  = {1,2,4,5};
		System.out.println(searchInsert(nums, 3));
	}
	
	static public int searchInsert(int[] nums, int target) {
        if(nums == null || nums.length == 0) return 0;
        int low = 0, high = nums.length - 1;
        while(low <= high){
        	int mid = (low + high)/2;
        	if(nums[mid] == target) return mid;
        	else if(target > nums[mid]) low = mid + 1;
        	else high = mid - 1;
        }
        return low;
    }
}
