package com.dcw.leetcode;

/**
 * Minimum Absolute Difference in BST
 * ÿ���ڵ����������ڵ����������С�ڵ�ֱ��ȥ�ýڵ�Ĳ�ľ���ֵ��ȡ��С���Ǹ�����ÿ���ڵ�ֱ���㣬���θ���
 * ʹ�õݹ�
 * @author Dong
 *
 */
public class Solution_530 {
	int ret=Integer.MAX_VALUE;
	public int getMinimumDifference(TreeNode root) {
		 dfs(root);
		return ret;
    }
	
	private void dfs(TreeNode root){
		if(root!=null){
			int num=calculteNodenum(root);
			ret=ret<num?ret:num;
			dfs(root.left);
			dfs(root.right);
		}
		
	}
	private int calculteNodenum(TreeNode root){
		int l=Integer.MAX_VALUE,r=Integer.MAX_VALUE;
		TreeNode m=root.left;
		TreeNode n=root.right;
		if(m!=null){
			while(m.right!=null){
				m=m.right;
			}
			l=Math.abs(m.val-root.val);
		}
		if(n!=null){
			while(n.left!=null){
				n=n.left;
			}
			r=Math.abs(n.val-root.val);
		}
		return l<r?l:r;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
