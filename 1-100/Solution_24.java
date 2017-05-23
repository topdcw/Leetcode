package com.dcw.leetcode;


/**
 * Swap Nodes in Pairs  
 * 
 * @author topdc
 *
 */
public class Solution_24 {

	public ListNode swapPairs(ListNode head) {
		//先人为设计个一个头结点指向第一个节点，方便后续交换。
		ListNode headfirst =new ListNode(-1);
		headfirst.next=head;
		
		ListNode pre,begin,end;//表示连续的三个节点
		pre=headfirst;
		begin=headfirst.next;
		while(begin!=null){//先判断begin是不是空，再判断end是不是空
			end=begin.next;
			if(end!=null){//交换,把end节点插入到begin节点前
				begin.next=end.next;
				end.next=begin;
				pre.next=end;
				//进入下一轮操作的准备工作
				pre=begin;
				begin=begin.next;
			}
			else
				break;
			
		}
		
		
		return headfirst.next;
        
    }
}
