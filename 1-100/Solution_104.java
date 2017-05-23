package com.dcw.leetcode;
/**
 * Maximum Depth of Binary Tree
 * ��������������ȣ����õݹ顣
 * @author Dong
 *
 */
public class Solution_104 {
	public int maxDepth(TreeNode root) {
		if(root==null)
			return 0;
		int left=0;
		int right=0;
		if(root.left!=null)
			left=maxDepth(root.left);
		if(root.right!=null)
			right=maxDepth(root.right);
		
		return left>right?left+1:right+1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
