package com.dcw.leetcode;

/**
 * Sum of Left Leaves
 * 使用递归,依次判断左子节点是否为叶节点
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
			if(left.left==null&&left.right==null)//左子节点是叶结点
				ret+=left.val;
			else 
				preOrder(left);	
		}
		
		preOrder(root.right);
	}
}
