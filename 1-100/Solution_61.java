package com.dcw.leetcode;

/**
 * rotate list
 * 右侧部分向前旋转k的位置
 * Given 1->2->3->4->5->NULL and k = 2,
 * return 4->5->1->2->3->NULL.
 * @author topdc
 *
 */
public class Solution_61 {

	public ListNode rotateRight(ListNode head, int k) {
		if(head==null)
			return head;
        int len=0;
        ListNode tmp=head;
        while(tmp!=null){
        	len++;
        	tmp=tmp.next;
        }
        k=k%len;//k可能会大于len
        if(k==0)
        	return head;
        else{
        	int t=len-k;
        	ListNode begin=null;
        	ListNode now=null;
        	ListNode tmp2=head;
        	for(int i=2;i<=t;i++){
        		tmp2=tmp2.next;
        	}
        	begin=now=tmp2.next;
        	while(now!=null){
        		if(now.next==null){
        			now.next=head;
        			break;
        		}
        		now=now.next;
        			
        	}
        	tmp2.next=null;
        	return begin;
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
