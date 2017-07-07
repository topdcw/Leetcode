package com.dcw.leetcode;

/**
 * Minimum Depth of Binary Tree   
 * @author topdc
 *
 */
public class Solution_111 {
	public int minDepth(TreeNode root) {
        if(root==null)
        	return 0;
        else{
        	int l=minDepth(root.left);
        	int r=minDepth(root.right);
        	if(l==0)
        		return r+1;
        	else
        		if(r==0)
        			return l+1;
        		else 
        			return l>r?r+1:l+1;
        }
    }
}
