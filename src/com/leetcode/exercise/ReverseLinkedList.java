package com.leetcode.exercise;

public class ReverseLinkedList {
	public static void main(String[] args) {
		ListNode l = new ListNode(10);
		l.next = new ListNode(1);
		l.next.next = new ListNode(200);
		ListNode ll = reverseList(l);
		while(ll!=null){
			System.out.println(ll.val);
			ll = ll.next;
		}
	}
	
	static public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head; 
		ListNode dummy = new ListNode(-1);
        ListNode cur = head;
        while(cur != null){
        	ListNode temp = cur.next;
        	cur.next = dummy.next;
        	dummy.next = cur;
        	cur = temp;
        	
        }
        return dummy.next;
        
    }
}
