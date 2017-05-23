package com.dcw.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Merge k Sorted Lists Merge k sorted linked lists and return it as one sorted
 * list. Analyze and describe its complexity. 
 * 方案1：依次两个链表，新链表再和另外一个链表合并，依次进行，时间复杂度O(n*k^2)，会超时
 * 方案2：将每个链表的表头元素取出来，建立一个小顶堆。
 * 		因为k个链表中都排好序了，因此每次取堆顶的元素就是k个链表中的最小值，可以将其合并到合并链表中，
 * 		再将这个元素的指针指向的下一个元素也加入到堆中，再调整堆，取出堆顶，合并链表。。。。以此类推，
 * 		直到堆为空时，链表合并完毕。
 * @author topdc
 *
 */

public class Solution_23 {

	ListNode ret = new ListNode(-1);//人为加一个头节点
	
	public ListNode mergeKLists(ListNode[] lists) {
		if (lists.length == 0)
			return null;
		if (lists.length == 1)
			return lists[0];
		ArrayList<ListNode> heap=new ArrayList<ListNode>();
		ListNode nowN=ret;
		for(int i=0;i<lists.length;i++){//将每个链表的表头元素取出来，建立一个小顶堆。
			if(lists[i]!=null){
				heap.add(lists[i]);
			}
		}
		builder(heap);//创建小根堆
		
		while(!heap.isEmpty()){
			nowN.next=heap.get(0);//将堆顶元素取出
			nowN=nowN.next;
			if(heap.get(0).next!=null){
				heap.set(0,heap.get(0).next);
				minheap(heap,1);//调整根堆
			}
			else{
				heap.set(0, heap.get(heap.size()-1));//将最后一个调整到第一个
				//heap.remove(heap.get(heap.size()-1));
				heap.remove(heap.size()-1);//移除最后一个
				
				minheap(heap,1);//调整根堆
			}
			
		}
		
		return ret.next;

	}
	
	public void builder(ArrayList<ListNode> heap){
		int n=heap.size();
		for(int i=n/2;i>0;i--)//由倒数第一个非叶节点开始依次建立小根堆
			minheap(heap, i);
	}
	
	public void minheap(ArrayList<ListNode> heap,int i){
		int n = heap.size();
		int left = i*2;
		int right = left+1;
		int min=i;////最小值的位置
		if(left<=n&&heap.get(left-1).val<heap.get(min-1).val){
			min=left;
		}
		if(right<=n&&heap.get(right-1).val<heap.get(min-1).val){
			min = right;
		}
		if(min!=i){//最小值不出现在i位置，交换
			ListNode tmp=heap.get(min-1);
			heap.set(min-1, heap.get(i-1));
			heap.set(i-1, tmp);
			minheap(heap,min);//对交换后的子节点创建小根堆
		}
	}
	

}
