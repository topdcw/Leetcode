package com.dcw.leetcode;

/**
 * Path Sum 
 * 判断是否有个根到叶子节点的路径，路径上的和等于给定的值sum
 * 使用递归
 * @author Dong
 *
 */
public class Solution_112 {
	public boolean hasPathSum(TreeNode root, int sum) {
		if(root==null)
			return false;
		int tmp=sum-root.val;
        if(tmp==0){
        	if(root.left==root.right)//都是null,返回true
        		return true;
        	else
        		return hasPathSum(root.left, tmp)||hasPathSum(root.right, tmp);
        }
        else{//对左右子树进行判定
        	return hasPathSum(root.left, tmp)||hasPathSum(root.right, tmp);
        }

    }
}
