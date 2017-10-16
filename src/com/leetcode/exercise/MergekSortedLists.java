package com.leetcode.exercise;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class MergekSortedLists {
	public static void main(String[] args) {
		ListNode l1 = new ListNode(100000);
		ListNode l2 = new ListNode(3000);
		ListNode l3 = new ListNode(20000);
		l1.next = new ListNode(10);
		l2.next = new ListNode(5);
		l3.next = new ListNode(100);
		ListNode[] larr = {l1, l2, l3};
		ListNode res = mergeKLists(larr);
		while(res.next != null){
			System.out.println(res.val);
			res = res.next;
		}
	}
	
	static public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0 || lists == null){
        	return null;
        }
        int size = lists.length;
        Queue<ListNode> heap = new PriorityQueue<ListNode>(size, new ListNodeComparator());
        for(int i = 0 ; i < size ; i++){
        	if(lists[i] != null){
        		heap.offer(lists[i]);
        	}
        }
        
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        while(!heap.isEmpty()){
        	ListNode n = heap.poll();
        	cur.next = n;
        	cur = n;
        	if(n.next != null){
        		heap.offer(n.next);
        	}
        }
        return dummy.next;
	}
	
	static public class ListNodeComparator implements Comparator<ListNode>{

		@Override
		public int compare(ListNode o1, ListNode o2) {
			assert o1 != null && o2 != null;
			return o1.val - o2.val;
		}
		
	}
}
