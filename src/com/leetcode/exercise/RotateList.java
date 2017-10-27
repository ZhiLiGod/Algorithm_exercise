package com.leetcode.exercise;

import org.w3c.dom.NodeList;

public class RotateList {
	public static void main(String[] args) {
		ListNode node = new ListNode(1);
		node.next = new ListNode(2);
		node.next.next = new ListNode(3);
		node.next.next.next = new ListNode(4);
		node.next.next.next.next = new ListNode(5);
		rotateRight(node, 2);
		//ListNode newnode = reverse(node);
		//print(newnode);
	}
	
	static public ListNode rotateRight(ListNode head, int n) {
		if (head==null||head.next==null) return head;
	    ListNode dummy=new ListNode(0);
	    dummy.next=head;
	    ListNode fast=dummy,slow=dummy;

	    int i;
	    for (i=0;fast.next!=null;i++)//Get the total length 
	    	fast=fast.next;
	    
	    for (int j=i-n%i;j>0;j--) //Get the i-n%i th node
	    	slow=slow.next;
	    
	    fast.next=dummy.next; //Do the rotation
	    dummy.next=slow.next;
	    slow.next=null;
	    
	    return dummy.next;
    }
	
	private static ListNode reverse(ListNode head) {  
		if(head == null || head.next == null)  
            return head;  
        ListNode pre = null;
        ListNode cur = head.next;     
        while(head != null)  
        {  
            ListNode temp = head.next;  
            head.next = pre;  
            pre = head;  
            head = temp;  
        }
//        while(pre != null){
//        	System.out.println(pre.val);
//        	pre = pre.next;
//        }    
        return pre;  
    }
	
	private static void print(ListNode head){
		while(head != null){
			System.out.println(head.val);
			head = head.next;
		}
	}
}
