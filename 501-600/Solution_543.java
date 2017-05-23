package com.dcw.leetcode;

/**
 * Diameter of Binary Tree
 * �ݹ�ⷨ���������ҽڵ������ȣ�������ӡ�����������ҽڵ�����ֱ����
 * @author topdc
 *
 */
public class Solution_543 {
	public int diameterOfBinaryTree(TreeNode root) {
		if(root==null)
			return 0;
        int left=max_depth(root.left);
        int right=max_depth(root.right);
        int left_d=diameterOfBinaryTree(root.left);
        int right_d=diameterOfBinaryTree(root.right);
        int tmp=left+right>left_d?left+right:left_d;
        return tmp>right_d?tmp:right_d;
		
    }
	//��ڵ����
	private int max_depth(TreeNode root){
		if(root==null)
			return 0;
		int left=0,right=0;
		if(root.left!=null)
			left=max_depth(root.left);
		if(root.right!=null)
			right=max_depth(root.right);
		return left>right?left+1:right+1;
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
