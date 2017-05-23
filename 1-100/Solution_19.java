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
 * 删除倒数第n个元素,链表的删除处理
 * 可以人为增加头结点来减少边界条件的判断
 * 方法1：先遍历一遍求长度，再计算删除第几个，需要两次搜寻。
 * 方法2：利用两个指针，间隔为n-1。当第2个指向最后一个元素时，第1个就指向倒数第n个元素。一次搜寻即可。
 * 这里采用方法1，时间O(L)
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
    	int order_n=num-n+1;//删除正数第order_n个
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