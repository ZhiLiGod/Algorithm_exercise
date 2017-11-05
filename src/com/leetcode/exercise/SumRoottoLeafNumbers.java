package com.leetcode.exercise;

import java.util.ArrayList;
import java.util.List;

public class SumRoottoLeafNumbers {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.right = new TreeNode(5);
		root.left.left = new TreeNode(4);
		System.out.println(sumNumbers(root));
	}
	
	static public int sumNumbers(TreeNode root) {
		if(root == null) return 0;
        List<String> l = new ArrayList<String>();
        helper(root, "", l);
        int res = 0;
        System.out.println(l);
        for(int i = 0 ; i < l.size() ; i++){
        	res += Integer.parseInt(l.get(i));
        }
        return helper1(root, 0);
        //return res;
    }
	
	static public void helper(TreeNode node, String s, List<String> l){
		if(node == null) return;
		s += node.val;
		if(node.left == null && node.right == null){
			l.add(s);
		}else{
			helper(node.left, s, l);
			helper(node.right, s, l);
		}
		s = s.substring(0, s.length()-1);
	}
	
	static public int helper1(TreeNode node, int tmp){
		if(node == null) return 0;
		int sum = node.val + tmp*10;
		if(node.left == null && node.right == null){
			return sum;
		}
		return helper1(node.left, sum) + helper1(node.right, sum);
	}
}
