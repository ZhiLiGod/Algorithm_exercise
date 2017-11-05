package com.leetcode.exercise;

public class MinimumDepthofBinaryTree {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(20);
		root.left = new TreeNode(10);
		root.right = new TreeNode(40);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(15);
		root.left.left.left = new TreeNode(1);
//		root.left.left.right = new TreeNode(2);
		root.right.left = new TreeNode(33);
//		root.right.right = new TreeNode(4);
//		root.right.right.right = new TreeNode(1);
		System.out.println(minDepth(root));
	}
	
	//static int depth = 1;
	//static int max = Integer.MAX_VALUE;
	static public int minDepth(TreeNode root) {
		if(root == null) return 0;
		int depth = 1;
		int[] max = new int[1];
		max[0] = Integer.MAX_VALUE;
        helper(root, depth, max);
        return max[0];
    }
	
	static public void helper(TreeNode node, int depth, int[] max){
		if(node == null)  {
			return;
		}
		if(node.right == null && node.left == null){
			max[0] = Math.min(max[0], depth);
		}else{
			helper(node.left, depth+1, max);
			helper(node.right, depth+1, max);
		}
		depth -= 1;
	}
}
