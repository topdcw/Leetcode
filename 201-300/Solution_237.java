package com.dcw.leetcode;

/**
 *  Delete Node in a Linked List
 *  ����Ҫɾ���Ľڵ㼰ֵ��
 *  ˼·�����ýڵ��һ���ڵ��ֵ��ֵ���ýڵ㣬ɾ����һ���ڵ�
 * @author Dong
 *
 */
public class Solution_237 {
	public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
