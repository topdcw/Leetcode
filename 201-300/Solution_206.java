package com.dcw.leetcode;

/**
 * Reverse Linked List   
 * ˼·�����һ���ڵ�ǰ���������now���ڵ�
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
		ListNode first=head;//ԭ������ĵ�һ��Ԫ��
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
