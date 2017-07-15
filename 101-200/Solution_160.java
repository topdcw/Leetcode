package com.dcw.leetcode;

import java.util.HashSet;

/**
 * Intersection of Two Linked Lists  
 * 返回两个链表的交叉点
 * Your code should preferably run in O(n) time and use only O(1) memory. 
 * 使用hash
 * @author dong
 *
 */
public class Solution_160 {
	 public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		 HashSet<ListNode> hs =new HashSet<>();
		 while(headA!=null){
			 ListNode tmp= headA;
			 hs.add(tmp);
			 headA=headA.next;
		 }
		 while(headB!=null){
			 if(hs.contains(headB))
				 return headB;
			 headB=headB.next;
		 }
		return null;
	        
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<ListNode> hs =new HashSet<>();
		ListNode tmp =new ListNode(1);
		hs.add(tmp);
		tmp=new ListNode(2);
		for (ListNode listNode : hs) {
			System.out.println(listNode.val);
		}
	}

}
