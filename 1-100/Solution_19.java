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
 * Remove Nth Node From End of List
 * Given linked list: 1->2->3->4->5, and n = 2.
 * After removing the second node from the end, the linked list becomes 1->2->3->5.
 * 
 * ɾ��������n��Ԫ��,�����ɾ������
 * ������Ϊ����ͷ��������ٱ߽��������ж�
 * ����1���ȱ���һ���󳤶ȣ��ټ���ɾ���ڼ�������Ҫ������Ѱ��
 * ����2����������ָ�룬���Ϊn-1������2��ָ�����һ��Ԫ��ʱ����1����ָ������n��Ԫ�ء�һ����Ѱ���ɡ�
 * ������÷���1��ʱ��O(L)
 * 
 * @author topdc
 *
 */
public class Solution_19 {
    public Solution_19_ListNode removeNthFromEnd(Solution_19_ListNode head, int n) {
    	
    	Solution_19_ListNode current_LN=head;
    	int num=0;
    	while(current_LN!=null){
    		num++;
    		current_LN=current_LN.next;
    	}
    	int order_n=num-n+1;//ɾ��������order_n��
    	if(order_n==1){
    		return head.next;
    	}
    	current_LN=head;
    	int i=1;
    	while(i<order_n-1){
    		current_LN=current_LN.next;
    		i++;
    	}
    	current_LN.next=current_LN.next.next;
    	
    	return head;

        
    }
}