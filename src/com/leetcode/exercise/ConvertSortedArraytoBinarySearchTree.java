package com.leetcode.exercise;

public class ConvertSortedArraytoBinarySearchTree {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(5);
		root.right = new TreeNode(20);
		print(root);
	}
	
	static public TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null) return null;
		TreeNode root = helper(nums, 0, nums.length-1);
        
        
        return root;
    }
	
	static public TreeNode helper(int[] nums, int low, int high){
		if(low > high) return null;
		int mid = (low+high)/2;
		TreeNode node = new TreeNode(nums[mid]);
		node.left = helper(nums, low, mid-1);
		node.right = helper(nums, mid+1, high);
		return node;
	}
	
	static public void print(TreeNode root){
		if(root == null) return;
		
		print(root.left);
		System.out.println(root.val);
		print(root.right);
	}
}
