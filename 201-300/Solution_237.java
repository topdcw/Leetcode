package com.dcw.leetcode;

/**
 *  Delete Node in a Linked List
 *  给出要删除的节点及值。
 *  思路，将该节点后一个节点的值赋值给该节点，删除后一个节点
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
