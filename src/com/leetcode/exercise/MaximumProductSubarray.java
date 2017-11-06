package com.leetcode.exercise;

public class MaximumProductSubarray {
	
	public static void main(String[] args) {
		int[] nums = {-2,3,-4,-10};
		System.out.println(maxProduct(nums));
	}
	
	static public int maxProduct(int[] A) {
        if(A == null) return 0;
        int max = A[0], min = A[0], result = A[0];
        for (int i = 1; i < A.length; i++) {
            int tmp = max;
            max = Math.max(Math.max(max * A[i], min * A[i]), A[i]);
            min = Math.min(Math.min(tmp * A[i], min * A[i]), A[i]);
            result = Math.max(result, max);
        }
        return result;
    }
}
