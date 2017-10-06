package com.leetcode.exercise;

 class ListNode1 {
    int val;
    ListNode1 next;
    ListNode1(int x) { val = x; }
}

public class SwapNodesinPairs {
	
	public static void main(String[] args) {
		ListNode1 head = new ListNode1(5);
		ListNode1 node = head;
		int j = 10;
		for(int i = 0 ; i < 5 ; i++){
			node.next = new ListNode1(j++);
			node = node.next;	
		}
		
		ListNode1 result = swapPairs(head);
		while(result != null){
			System.out.println(result.val);
			result = result.next;
		}
	}
	
	static public ListNode1 swapPairs(ListNode1 head) {
        
		ListNode1 dummy = new ListNode1(0);
		dummy.next = head;
		ListNode1 curr = dummy;
		while(curr.next != null && curr.next.next != null){
			ListNode1 first = curr.next;
			ListNode1 second = curr.next.next;
			first.next = second.next;
			curr.next = second;
			curr.next.next = first;
			curr = curr.next.next;
		}
		return dummy.next;
    }
}
