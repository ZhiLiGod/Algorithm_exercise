package com.leetcode.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
	
	public static void main(String[] args) {
		int[] nums = {0,0,0,0};
		int target = 0;
		List<List<Integer>> lists = fourSum(nums, target);
		for(List<Integer> list : lists){
			System.out.println(list);
		}
	}
	
	static public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        if(nums.length < 4){
        	return lists;
        }
        for(int i = 0 ; i < nums.length - 3 ; i++){
        	if( (nums[i] + nums[i+1] + nums[i+2] + nums[i+3]) > target){
        		break;
        	}
        	if( (nums[i] + nums[nums.length-1] + nums[nums.length-1]+nums[nums.length-2]+nums[nums.length-3]<target)){
        		continue;
        	}
        	if( i > 0 && nums[i] == nums[i-1] ){
        		continue;
        	}
        	for(int j = i + 1 ; j < nums.length - 2 ; j++){
        		if( (nums[i] + nums[j] + nums[j+1] + nums[j+2]) > target){
        			break;
        		}
        		if(nums[i]+nums[j]+nums[nums.length-1]+nums[nums.length-2]<target){
        			continue;
        		}
        		if(j > i + 1 && nums[j] == nums[j-1]){
        			continue;
        		}
        		int low = j+1, high = nums.length - 1;
        		while(low < high){
        			int sum = nums[i] + nums[j] + nums[low] + nums[high];
        			if(sum == target){
        				lists.add(Arrays.asList(nums[i], nums[j], nums[low], nums[high]));
        				while(low < high && nums[low] == nums[low+1]){
        					low++;
        				}
        				while(low < high && nums[high] == nums[high-1]){
        					high--;
        				}
        				low++;
        				high--;
        			}
        			else if(sum < target){
        				low++;
        			}else{
        				high--;
        			}
        		}
        	}
        }
        
        
        return lists;
        
    }
}
