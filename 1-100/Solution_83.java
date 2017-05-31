package com.dcw.leetcode;

/**
 * Remove Duplicates from Sorted List
 * ɾ���������ظ���Ԫ��
 * @author topdc
 *
 */
public class Solution_83 {
	public ListNode deleteDuplicates(ListNode head) {
        if(head==null)
        	return head;
        ListNode now=head;
        ListNode later=now.next;
        while(later!=null){
        	if(now.val==later.val){
        		now.next=later.next;
        		later=now.next;
        	}
        	else{
        		now=later;
        		later=now.next;
        	}
        }
        return head;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
