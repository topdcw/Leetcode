package com.dcw.leetcode;


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

/**
 * Merge Two Sorted Lists
 * 
 * ��Ϊ����������
 * @author topdc
 *
 */
public class Solution_21 {
	public Solution_19_ListNode mergeTwoLists(Solution_19_ListNode l1, Solution_19_ListNode l2) {
		
		if(l1==null)
			return l2;
		if(l2==null)
			return l1;
		
		//l1,l2����Ϊnull
		//��Ϊ����һ���ڵ㣬ָ��l1��ͷ��
		Solution_19_ListNode headNode=new Solution_19_ListNode(0);
		headNode.next=l1;
		Solution_19_ListNode pre_p=headNode;
		Solution_19_ListNode now_p=pre_p.next;//ָ��Ŀǰ�ڵ�
		Solution_19_ListNode tmp;
		while(l2!=null&&now_p!=null){
			if(l2.val<=now_p.val){
				tmp=l2;
				l2=l2.next;
				pre_p.next=tmp;
				tmp.next=now_p;
				pre_p=tmp;
			}
			else{
				pre_p=pre_p.next;
				now_p=pre_p.next;
			}
		}
		if(l2==null)
			return headNode.next;
		else
			pre_p.next=l2;
		return headNode.next;
    }
}
