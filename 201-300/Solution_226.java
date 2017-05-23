package com.dcw.leetcode;

/**
 * Invert Binary Tree
 *µ›πÈ µœ÷
 * @author Dong
 *
 */
public class Solution_226 {

	public TreeNode invertTree(TreeNode root) {
        
		fanzhuan(root);
		return root;
    }
	private void fanzhuan(TreeNode root){
		if(root==null)
			return;
		if(root.left!=null)
			fanzhuan(root.left);
		if(root.right!=null)
			fanzhuan(root.right);
		TreeNode tmp=root.left;
		root.left=root.right;
		root.right=tmp;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
