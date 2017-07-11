package com.dcw.leetcode;

/**
 * Linked List Cycle
 *判断一个链表是否成环。
 *使用两个指针。一个步进为1，一个步进为2，如果出现循环，则两个指针终究会相遇、
 * @author Dong
 *
 */
public class Solution_141 {
	public boolean hasCycle(ListNode head) {
		ListNode L1,L2;
		if(head==null||head.next==null)
			return false;
		L1=head;
		L2=head.next;
		while(L1!=L2){
			if(L1==null)
				return false;
			else{
				L1=L1.next;
			}
			if(L2==null)
				return false;
			else{
				if(L2.next==null)
					return false;
				else
					L2=L2.next.next;
			}
		}
		return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
