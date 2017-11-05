package com.leetcode.exercise;

import java.util.ArrayList;
import java.util.List;

public class PathSumII {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(4);
		root.right = new TreeNode(8);
		root.left.left = new TreeNode(11);
		root.left.left.left = new TreeNode(7);
		root.left.left.right = new TreeNode(2);
		root.right.left = new TreeNode(13);
		root.right.right = new TreeNode(4);
		root.right.right.right = new TreeNode(1);
		System.out.println(pathSum(root, 22));
	}
	
	static public List<List<Integer>> pathSum(TreeNode root, int sum) {
		List<List<Integer>> lists = new ArrayList<List<Integer>>();
		List<Integer> list = new ArrayList<Integer>();
		pathSum(root, sum, list, lists);
		return lists;
    }
	
	static void pathSum(TreeNode root, int sum, List<Integer> sol, List<List<Integer>> res) {
        if (root == null) {
            return;
        }
        
        sol.add(root.val);
        
        if (root.left == null && root.right == null && sum == root.val) {
            res.add(new ArrayList<Integer>(sol));
        } else {
            pathSum(root.left, sum - root.val, sol, res);
            pathSum(root.right, sum - root.val, sol, res);
        }
        
        sol.remove(sol.size() - 1);
    }
}
