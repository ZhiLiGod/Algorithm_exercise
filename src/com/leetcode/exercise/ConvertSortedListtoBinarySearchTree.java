package com.leetcode.exercise;

import java.util.ArrayList;
import java.util.List;

public class ConvertSortedListtoBinarySearchTree {
	public static void main(String[] args) {
		ListNode node = new ListNode(2);
		node.next = new ListNode(4);
		node.next.next = new ListNode(6);
		node.next.next.next = new ListNode(8);
		System.out.println(sortedListToBST(node));
	}
	
	static public TreeNode sortedListToBST(ListNode head) {
        List<Integer> l = new ArrayList<Integer>();
        while(head != null){
        	l.add(head.val);
        	head = head.next;
        }
        
        return helper(l, 0, l.size()-1);
    }
	
	static public TreeNode helper(List<Integer> l, int low, int high){
		if(low > high) return null;
		int mid = (low + high)/2;
		TreeNode node = new TreeNode(l.get(mid));
		node.left = helper(l, low, mid-1);
		node.right = helper(l, mid+1, high);
		return node;
	}
	
	
}
