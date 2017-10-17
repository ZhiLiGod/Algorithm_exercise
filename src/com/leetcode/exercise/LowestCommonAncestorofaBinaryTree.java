package com.leetcode.exercise;

public class LowestCommonAncestorofaBinaryTree {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(5);
		root.right = new TreeNode(1);
		root.left.left = new TreeNode(20);
		root.left.right = new TreeNode(3);
		TreeNode result = lowestCommonAncestor(root, root.left.left, root.right);
		System.out.println(result.val);
	}
	
	static public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || q == null || p == null) return null;
        return helper(root, p, q);
    }
	
	static public TreeNode helper(TreeNode root, TreeNode p, TreeNode q){
		if(root == null || root == q || root == p) return root;
		TreeNode left = helper(root.left, p, q);
		TreeNode right = helper(root.right, p, q);
		if(left != null && right != null) return root;
		else return left == null ? right : left;
	}
}
