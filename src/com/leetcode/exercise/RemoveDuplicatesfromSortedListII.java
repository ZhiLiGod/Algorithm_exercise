package com.leetcode.exercise;

public class RemoveDuplicatesfromSortedListII {
	
	public static void main(String[] args) {
		ListNode node = new ListNode(3);
		node.next = new ListNode(3);
		node.next.next = new ListNode(4);
		node.next.next.next = new ListNode(3);
		node.next.next.next.next = new ListNode(6);
		node.next.next.next.next.next = new ListNode(3);
		ListNode res = deleteDuplicates(node);
		while(res != null){
			System.out.println(res.val);
			res = res.next;
		}
	}
	
	static public ListNode deleteDuplicates(ListNode head) {
		if(head == null) return null;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode cur = head;
        ListNode prev = dummy;
        int curNum = cur.val;
        while(cur != null){
        	while(cur.next!=null&&cur.val==cur.next.val){
                cur=cur.next;
            }
            if(prev.next==cur){
                prev=prev.next;
            }
            else{
                prev.next=cur.next;
            }
            cur=cur.next;
        }
        return dummy.next;
    }
}
