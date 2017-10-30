package com.leetcode.exercise;

public class BestTimetoBuyandSellStock {
	public static void main(String[] args) {
		int[] a = {1, 2, 2, 2, 2, 4};
		System.out.println(maxProfit(a));
	}
	
	static public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0) return 0;
        int max = 0, min = prices[0];
        for(int i = 0 ; i < prices.length ; i++){
        	if(prices[i] > min){
        		max = Math.max(max, prices[i] - min);
        	}else{
        		min = prices[i];
        	}
        }
        return max;
    }
}
