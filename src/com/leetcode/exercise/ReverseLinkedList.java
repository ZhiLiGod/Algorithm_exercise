package com.leetcode.exercise;

public class ReverseLinkedList {
	static ListNode ln = null;
	public static void main(String[] args) {
		ListNode l = new ListNode(10);
		l.next = new ListNode(1);
		l.next.next = new ListNode(200);
//		ListNode ll = reverseList(l);
//		while(ll!=null){
//			System.out.println(ll.val);
//			ll = ll.next;
//		}
		ListNode ll1 = helper(l);
		while(ll1!=null){
			System.out.println(ll1.val);
			ll1 = ll1.next;
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
	
	static public ListNode helper(ListNode head){
		if(head == null || head.next == null) return head; 
		reverseList2(head);
		return ln;
	}
	
	static public ListNode reverseList2(ListNode head){
		if(head.next == null){
			ln = head;
			return head;
		}
		ListNode ln1 = reverseList2(head.next);
		ln1.next = head;
		head.next = null;
		return head;
	}
}
