package com.leetcode.exercise;

public class SymmetricTree {
	public static void main(String[] args) {
		
	}
	
	static public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return isMirror(root.left, root.right);
    }
	
	static public boolean isMirror(TreeNode left, TreeNode right){
		if(left == null && right == null) return true;
		if(left == null || right == null) return false;
		if(left.val == right.val) return isMirror(left.left, right.right) && isMirror(left.right, right.left);
		return false;
	}
}
