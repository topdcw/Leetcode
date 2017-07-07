package com.dcw.leetcode;

/**
 * Balanced Binary Tree
 * 判断是不是二叉平衡树，左右子树高度差不能大于1
 * 思路：在进行求高度的递归中完成了平衡性的判断
 * @author topdc
 *
 */
public class Solution_110 {
	boolean ret=true;
	public boolean isBalanced(TreeNode root) {
        
		if(root==null)
			return true;
		int h=height(root);
		return ret;
    }
	
	private int height(TreeNode root){
		if(root!=null){
			int l= height(root.left);
			int r= height(root.right);
			if(Math.abs(l-r)>1){
				ret=false;
				
			}
			return l>r?l+1:r+1;
		}
		else{
			return 0;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
