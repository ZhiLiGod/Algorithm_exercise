package com.leetcode.exercise;

public class NumberofLongestIncreasingSubsequence {
	public static void main(String[] args) {
		int[] nums = {1,3,2,7,9};
		System.out.println(findNumberOfLIS(nums));
	}
	
	static public int findNumberOfLIS(int[] nums) {
		int len = nums.length, result = 0, max = 0;
		int[] n1 = new int[len];
		int[] n2 = new int[len];
		for(int i = 0 ; i < len ; i++){
			n1[i] = n2[i] = 1;
			for(int j = 0 ; j < i ; j++){
				if(nums[i] > nums[j]){
					if(n1[i] == n1[j] + 1) n2[i] = n2[j] + 1;
					if(n1[i] < n1[j] + 1){
						n1[i] = n1[j] + 1;
						n2[i] = n2[j];
					}
				}
				
			}
			if(max == n1[i]) result += 1;
			else if(max < n1[i]){
				max = n1[i];
				result = n2[i];
			}
		}
		return result;
    }
}
