package com.leetcode.exercise;

public class DeleteNodeinaLinkedList {
	public static void main(String[] args) {
		ListNode node = new ListNode(10);
		node.next = new ListNode(20);
		node.next.next = new ListNode(30);
		node.next.next.next = new ListNode(40);
		node.next.next.next.next = new ListNode(50);
		deleteNode(node, 50);
	}
	
	static public void deleteNode(ListNode node, int target) {
		ListNode dummy = new ListNode(-1);
		dummy.next = node;
        while(node != null && node.next != null){
        	if(node.next.val == target){
        		node.next = node.next.next;
        	}
        	node = node.next;
        }
        while(dummy != null){
        	System.out.println(dummy.val);
        	dummy = dummy.next;
        }
    }
}
