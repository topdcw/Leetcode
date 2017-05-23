package com.dcw.leetcode;

/**
 * Reverse Nodes in k-Group
 * 每k个数分为一组，将改组进行翻转。最后不够k个的节点不进行操作。
 * @author topdc
 *
 */
public class Solution_25 {

	public ListNode reverseKGroup(ListNode head, int k) {
		
		if(head==null||k==1)//空判断
			return head;
		
		//人为增加一个头节点，方便后续的插入操作。
		ListNode headfirst = new ListNode(-1);
		headfirst.next=head;
		
		ListNode pre,begin,last,now,tmp;
		begin=now=head;
		pre=headfirst;

		int count=0;
		//now节点用于遍历时使用。
		//k个节点判断，共需要，pre，begin，last，tmp四个值 ，pre指k个节点之前的那个节点，
		//begin指未变化前k个节点的第一个节点,last是最后一个，tmp为begin节点后面的一个
		while(now!=null){
			count++;
			System.out.println(count);
			if(count==k){
				count=0;//count置0
				last=now;
				while(begin.next!=last){
					tmp=begin.next;
					begin.next=tmp.next;
					tmp.next=pre.next;
					pre.next=tmp;
				}
				//处理last节点
				begin.next=last.next;
				last.next=pre.next;
				pre.next=last;
				//处理完毕，更新pre，now，begin
				pre=begin;//begin是目前k个节点的最后一个
				now=begin=begin.next;//更新now，begin，指向下一组k个节点的第一个
								
			}
			else{
				now=now.next;
			}
		}
		
		return headfirst.next;
	}
}
