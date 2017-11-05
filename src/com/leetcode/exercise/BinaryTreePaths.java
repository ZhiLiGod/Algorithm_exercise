package com.leetcode.exercise;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.right = new TreeNode(5);
		root.left.left = new TreeNode(4);
		System.out.println(binaryTreePaths(root));
	}
	
	static public List<String> binaryTreePaths(TreeNode root) {
		if(root == null) return new ArrayList<String>();
        List<String> list = new ArrayList<String>();
        helper(list, root, "");
        return list;
    }
	
	static public void helper(List<String> list, TreeNode node, String s){
		if(node == null) return;
		s += node.val + "->";
		if(node.left == null && node.right == null) {
			s = s.substring(0, s.length()-2);
			list.add(s);
		}
		else {
			helper(list, node.left, s);
			helper(list, node.right, s);
		}
		
		s = s.substring(0, s.length()-1);
	}
}
