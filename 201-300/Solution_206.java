package com.dcw.leetcode;

/**
 * Reverse Linked List   
 * 思路，向第一个节点前插入后续（now）节点
 * @author topdc
 *
 */
public class Solution_206 {

	 public ListNode reverseList(ListNode head) {
		if(head==null)
			return null;
		if(head.next==null)
			return head;
		ListNode now=head.next;
		ListNode first=head;//原来链表的第一个元素
		while(now!=null){
			ListNode tmp=now.next;
			first.next=tmp;
			now.next=head;
			head=now;
			now=tmp;
		}
		
		return head;   
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
