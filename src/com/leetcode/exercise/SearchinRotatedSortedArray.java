package com.leetcode.exercise;

import java.util.Arrays;

public class SearchinRotatedSortedArray {
	public static void main(String[] args) {
		int[] nums = {4 ,5 ,6 ,7 ,0 ,1 ,2};
		int[] nums1 = {1,3};
		System.out.println(search(nums, 12));
		System.out.println(search1(nums1, 2, 2));
	}
	
	static public int search(int[] nums, int target) {
		if(nums == null || nums.length == 0) return -1;
		//Arrays.sort(nums);
		for(int i = 0 ; i < nums.length ; i++){
			if(nums[i] == target) return i;
		}
		return -1;
    }
	
	static int search1(int A[], int n, int target) {
        int lo=0,hi=n-1;
        // find the index of the smallest value using binary search.
        // Loop will terminate since mid < hi, and lo or hi will shrink by at least 1.
        // Proof by contradiction that mid < hi: if mid==hi, then lo==hi and loop would have been terminated.
        while(lo<hi){
            int mid=(lo+hi)/2;
            if(A[mid]>A[hi]) lo=mid+1;
            else hi=mid;
        }
        // lo==hi is the index of the smallest value and also the number of places rotated.
        int rot=lo;
        if(A[rot] <= target && target <= A[A.length - 1]) {
        	hi = n - 1;
        	lo = rot;
        }
        else {
        	hi = rot - 1;
        	lo=0;
        }
        
        
        // The usual binary search and accounting for rotation.
        while(lo <= hi){
            int mid = (lo + hi) / 2;
            if(A[mid] == target) return mid;
            if(A[mid] > target) hi = mid - 1;
            else lo = mid + 1;
        }
        return -1;
    }
}
