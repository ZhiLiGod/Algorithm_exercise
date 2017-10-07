package com.leetcode.exercise;

import java.util.ArrayList;
import java.util.List;

public class MinimumPathSum {
	public static void main(String[] args) {
		int[][] grid = {
				{1, 2},
				{3, 4}
		};
		System.out.println(minPathSum(grid));
	}
	
	static public int minPathSum(int[][] grid) {
		int m=grid.length, n=grid[0].length;
	    for(int i=0;i<m;i++){
	        for(int j=0;j<n;j++){
	            if(i==0 || j==0){
	                if(i==0 && j==0) grid[i][j] = grid[i][j];
	                if(i>0 && j==0) grid[i][j] = grid[i][j]+grid[i-1][j];
	                if(i==0 && j>0) grid[i][j] = grid[i][j] + grid[i][j-1];
	            } else grid[i][j] = grid[i][j] + Math.min(grid[i][j-1], grid[i-1][j]);
	        }
	    }
//	    for(int i = 0 ; i < 2 ; i++){
//	    	for(int j = 0 ; j < 2 ; j++){
//	    		System.out.print(grid[i][j]);
//	    	}
//	    	System.out.println();
//	    }
	    return grid[m-1][n-1];
    }

	
}
