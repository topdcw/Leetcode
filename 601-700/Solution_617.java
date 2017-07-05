package com.dcw.leetcode;

/**
 * Merge Two Binary Trees 
 * method 1,use 递归,把t2整合到t1中去
 * @author topdc
 *
 */
public class Solution_617 {
	public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
	   	if(t1==null)
	   		return t2;
	   	if(t2==null)
	   		return t1;
	   	
	   	t1.val+=t2.val;
	   	t1.left=mergeTrees(t1.left, t2.left);
	   	t1.right=mergeTrees(t1.right, t2.right);
		return t1;
	    
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
