package com.dcw.leetcode;

/**
 * Reverse Nodes in k-Group
 * ÿk������Ϊһ�飬��������з�ת����󲻹�k���Ľڵ㲻���в�����
 * @author topdc
 *
 */
public class Solution_25 {

	public ListNode reverseKGroup(ListNode head, int k) {
		
		if(head==null||k==1)//���ж�
			return head;
		
		//��Ϊ����һ��ͷ�ڵ㣬��������Ĳ��������
		ListNode headfirst = new ListNode(-1);
		headfirst.next=head;
		
		ListNode pre,begin,last,now,tmp;
		begin=now=head;
		pre=headfirst;

		int count=0;
		//now�ڵ����ڱ���ʱʹ�á�
		//k���ڵ��жϣ�����Ҫ��pre��begin��last��tmp�ĸ�ֵ ��preָk���ڵ�֮ǰ���Ǹ��ڵ㣬
		//beginָδ�仯ǰk���ڵ�ĵ�һ���ڵ�,last�����һ����tmpΪbegin�ڵ�����һ��
		while(now!=null){
			count++;
			System.out.println(count);
			if(count==k){
				count=0;//count��0
				last=now;
				while(begin.next!=last){
					tmp=begin.next;
					begin.next=tmp.next;
					tmp.next=pre.next;
					pre.next=tmp;
				}
				//����last�ڵ�
				begin.next=last.next;
				last.next=pre.next;
				pre.next=last;
				//������ϣ�����pre��now��begin
				pre=begin;//begin��Ŀǰk���ڵ�����һ��
				now=begin=begin.next;//����now��begin��ָ����һ��k���ڵ�ĵ�һ��
								
			}
			else{
				now=now.next;
			}
		}
		
		return headfirst.next;
	}
}
