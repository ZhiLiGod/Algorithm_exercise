package com.leetcode.exercise;

import java.util.ArrayList;
import java.util.List;

public class MaximumDepthofBinaryTree {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(50);
		root.left = new TreeNode(30);
		root.left.left = new TreeNode(10);
		root.left.right = new TreeNode(40);
		root.left.left.right = new TreeNode(15);
		root.left.left.right.right = new TreeNode(18);
		root.right = new TreeNode(90);
		System.out.println(maxDepth(root));
	}
	
	static int max = 0;
	
	static public int maxDepth(TreeNode root) {
		if(root == null) return 0;
		int result = 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
		System.out.println(result);
        return result;
    }

}
