package com.dcw.leetcode;

/**
 * Balanced Binary Tree
 * �ж��ǲ��Ƕ���ƽ���������������߶Ȳ�ܴ���1
 * ˼·���ڽ�����߶ȵĵݹ��������ƽ���Ե��ж�
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
