package com.leetcode.exercise;

public class LowestCommonAncestoofaBinarySearchTree {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(5);
		root.right = new TreeNode(20);
		root.left.left = new TreeNode(2);
		root.left.right = new TreeNode(8);
		TreeNode result = lowestCommonAncestor(root, root.left.left, root.right);
		System.out.println(result.val);
	}
	
	static public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || p == null || q == null) return null;
        return helper(root, p, q);
    } 
	
	static public TreeNode helper(TreeNode root, TreeNode p, TreeNode q){
		if(root == null) return null;
		if(p.val < root.val && q.val < root.val) return helper(root.left, p, q);
		else if(p.val > root.val && q.val > root.val) return helper(root.right, p, q);
		else return root;
	}
}
