package com.dcw.leetcode;

/**
 * Sum of Left Leaves
 * ʹ�õݹ�,�����ж����ӽڵ��Ƿ�ΪҶ�ڵ�
 * @author Dong
 *
 */
public class Solution_404 {
	private int ret=0;
	public int sumOfLeftLeaves(TreeNode root) {
		preOrder(root);
		return ret;
        
    }
	private void preOrder(TreeNode root) {
		if(root==null)
			return;
		TreeNode left=root.left;
		if(left!=null){
			if(left.left==null&&left.right==null)//���ӽڵ���Ҷ���
				ret+=left.val;
			else 
				preOrder(left);	
		}
		
		preOrder(root.right);
	}
}
