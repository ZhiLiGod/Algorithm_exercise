package com.leetcode.exercise;

import java.util.ArrayList;
import java.util.List;

public class UniquePaths {
	public static void main(String[] args) {
		System.out.println(uniquePaths1(3, 3));
		//System.out.println(uniquePaths(23,12));
	}
	
	
	
	static public int uniquePaths(int m, int n) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(0);
        generate(1, 1, list, m, n);
        return list.get(0);
    }
	
	static public void generate(int r, int c, List<Integer> list, int m, int n){
		if(r == m && c == n){
			list.set(0, list.get(0) + 1);
			return;
		}
		if(r < m){
			generate(r + 1, c, list, m, n);
		}
		if(c < n){
			generate(r, c + 1, list, m, n);
		}
	}
	
	static public int uniquePaths1(int m, int n) {
	    int[][] grid = new int[m][n];
	    for(int i = 0; i<m; i++){
	        for(int j = 0; j<n; j++){
	            if(i==0||j==0)
	                grid[i][j] = 1;
	            else
	                grid[i][j] = grid[i][j-1] + grid[i-1][j];
	        }
	    }
	    return grid[m-1][n-1];
	}
}
