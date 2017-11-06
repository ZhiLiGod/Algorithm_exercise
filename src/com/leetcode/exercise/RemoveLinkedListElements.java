package com.leetcode.exercise;

public class RemoveLinkedListElements {
	public static void main(String[] args) {
		ListNode node = new ListNode(2);
		node.next = new ListNode(4);
		node.next.next = new ListNode(6);
		node.next.next.next = new ListNode(8);
		ListNode res = removeElements(node, 6);
		while(res != null){
			System.out.println(res.val);
			res = res.next;
		}
	}
	
	static public ListNode removeElements(ListNode head, int val) {
        if(head == null) return null;
        ListNode dummy = new ListNode(-1);
        dummy.next = head; 
        ListNode prev = dummy;
        while(head != null){
        	if(head.val == val){
        		prev.next = head.next; 
        	}else {
        		prev = prev.next;
        	}
        	head = head.next;
        }
        return dummy.next;
    }
	
}
