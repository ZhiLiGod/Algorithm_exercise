package com.leetcode.exercise;

public class BalancedBinaryTree {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		//root.right = new TreeNode(3);
		root.left.right = new TreeNode(5);
		root.left.left = new TreeNode(4);
//		root.left.left.left = new TreeNode(20);
//		root.left.left.right = new TreeNode(50);
		//System.out.println(isBalanced(root));
		System.err.println(findDeep(root));
	}
	
	static private boolean result = true;

	static public boolean isBalanced(TreeNode root) {
	    maxDepth(root);
	    return result;
	}

	static public int maxDepth(TreeNode root) {
	    if (root == null)
	        return 0;
	    int l = maxDepth(root.left);
	    int r = maxDepth(root.right);
	    if (Math.abs(l - r) > 1)
	        result = false;
	    return 1 + Math.max(l, r);
	}
	
	static public int findDeep(TreeNode root){
		int deep = 0;  
		if(root != null){  
			int lchilddeep = findDeep(root.left);  
			int rchilddeep = findDeep(root.right);  
			deep = Math.max(lchilddeep, rchilddeep) + 1;  
		}  
		return deep;  
	}
}
