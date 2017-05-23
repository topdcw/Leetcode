package com.dcw.leetcode;


/**
 * Swap Nodes in Pairs  
 * 
 * @author topdc
 *
 */
public class Solution_24 {

	public ListNode swapPairs(ListNode head) {
		//����Ϊ��Ƹ�һ��ͷ���ָ���һ���ڵ㣬�������������
		ListNode headfirst =new ListNode(-1);
		headfirst.next=head;
		
		ListNode pre,begin,end;//��ʾ�����������ڵ�
		pre=headfirst;
		begin=headfirst.next;
		while(begin!=null){//���ж�begin�ǲ��ǿգ����ж�end�ǲ��ǿ�
			end=begin.next;
			if(end!=null){//����,��end�ڵ���뵽begin�ڵ�ǰ
				begin.next=end.next;
				end.next=begin;
				pre.next=end;
				//������һ�ֲ�����׼������
				pre=begin;
				begin=begin.next;
			}
			else
				break;
			
		}
		
		
		return headfirst.next;
        
    }
}
