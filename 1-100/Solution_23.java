package com.dcw.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Merge k Sorted Lists Merge k sorted linked lists and return it as one sorted
 * list. Analyze and describe its complexity. 
 * ����1���������������������ٺ�����һ������ϲ������ν��У�ʱ�临�Ӷ�O(n*k^2)���ᳬʱ
 * ����2����ÿ������ı�ͷԪ��ȡ����������һ��С���ѡ�
 * 		��Ϊk�������ж��ź����ˣ����ÿ��ȡ�Ѷ���Ԫ�ؾ���k�������е���Сֵ�����Խ���ϲ����ϲ������У�
 * 		�ٽ����Ԫ�ص�ָ��ָ�����һ��Ԫ��Ҳ���뵽���У��ٵ����ѣ�ȡ���Ѷ����ϲ������������Դ����ƣ�
 * 		ֱ����Ϊ��ʱ������ϲ���ϡ�
 * @author topdc
 *
 */

public class Solution_23 {

	ListNode ret = new ListNode(-1);//��Ϊ��һ��ͷ�ڵ�
	
	public ListNode mergeKLists(ListNode[] lists) {
		if (lists.length == 0)
			return null;
		if (lists.length == 1)
			return lists[0];
		ArrayList<ListNode> heap=new ArrayList<ListNode>();
		ListNode nowN=ret;
		for(int i=0;i<lists.length;i++){//��ÿ������ı�ͷԪ��ȡ����������һ��С���ѡ�
			if(lists[i]!=null){
				heap.add(lists[i]);
			}
		}
		builder(heap);//����С����
		
		while(!heap.isEmpty()){
			nowN.next=heap.get(0);//���Ѷ�Ԫ��ȡ��
			nowN=nowN.next;
			if(heap.get(0).next!=null){
				heap.set(0,heap.get(0).next);
				minheap(heap,1);//��������
			}
			else{
				heap.set(0, heap.get(heap.size()-1));//�����һ����������һ��
				//heap.remove(heap.get(heap.size()-1));
				heap.remove(heap.size()-1);//�Ƴ����һ��
				
				minheap(heap,1);//��������
			}
			
		}
		
		return ret.next;

	}
	
	public void builder(ArrayList<ListNode> heap){
		int n=heap.size();
		for(int i=n/2;i>0;i--)//�ɵ�����һ����Ҷ�ڵ㿪ʼ���ν���С����
			minheap(heap, i);
	}
	
	public void minheap(ArrayList<ListNode> heap,int i){
		int n = heap.size();
		int left = i*2;
		int right = left+1;
		int min=i;////��Сֵ��λ��
		if(left<=n&&heap.get(left-1).val<heap.get(min-1).val){
			min=left;
		}
		if(right<=n&&heap.get(right-1).val<heap.get(min-1).val){
			min = right;
		}
		if(min!=i){//��Сֵ��������iλ�ã�����
			ListNode tmp=heap.get(min-1);
			heap.set(min-1, heap.get(i-1));
			heap.set(i-1, tmp);
			minheap(heap,min);//�Խ�������ӽڵ㴴��С����
		}
	}
	

}
