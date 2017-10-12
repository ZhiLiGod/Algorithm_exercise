package com.leetcode.exercise;

public class UniquePathsII {
	public static void main(String[] args) {
		int[][] obstacleGrid = {
				{0,0,0,0,0},{1,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0}
		};
		System.out.println(uniquePathsWithObstacles(obstacleGrid));
	}
	
	static public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid[0][0] == 1) return 0;
		int len = obstacleGrid.length;
        int len1 = obstacleGrid[0].length;
        int[][] result = new int[len][len1];   
        result[0][0] = 1;
        for(int i = 0 ; i < len ; i++){
        	for(int j = 0 ; j < len1 ; j++){
        		if(obstacleGrid[i][j] == 1) result[i][j] = 0;
        		if(i == 0 && j > 0 && obstacleGrid[0][j-1] == 0 && obstacleGrid[0][j] == 0) result[0][j] = result[0][j-1];
        		if(j == 0 && i > 0 && obstacleGrid[i-1][j] == 0 && obstacleGrid[i][0] == 0) result[i][0] = result[i-1][0];
        		if(i > 0 && j > 0 && obstacleGrid[i][j] == 0) result[i][j] = result[i-1][j] + result[i][j-1];
        	}
        }
        for(int i = 0 ; i < len ; i++){
        	for(int j = 0 ; j < len1 ; j++){
        		System.out.print(result[i][j]);
        	}
        	System.out.println();
        }
        return result[len-1][len1-1];
    }
}
