package com.leetcode.exercise;
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}
public class IsTheSameTree {
	public static void main(String[] args) {
		TreeNode root1 = new TreeNode(5);
		root1.left = new TreeNode(3);
		root1.right = new TreeNode(10);
		root1.left.left = new TreeNode(1);
		
		TreeNode root2 = new TreeNode(5);
		root2.left = new TreeNode(3);
		root2.right = new TreeNode(10);
		root2.left.left = new TreeNode(1);
		
		System.out.println(isSameTree(root1, root2));
	}
	
	static public boolean isSameTree(TreeNode p, TreeNode q) {
		if(p == null && q == null ) return true;
		if(p == null || q == null) return false;
		if(q.val == p.val) return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
		return false;
    }
}
