package com.dcw.leetcode;

/**
 * Path Sum 
 * �ж��Ƿ��и�����Ҷ�ӽڵ��·����·���ϵĺ͵��ڸ�����ֵsum
 * ʹ�õݹ�
 * @author Dong
 *
 */
public class Solution_112 {
	public boolean hasPathSum(TreeNode root, int sum) {
		if(root==null)
			return false;
		int tmp=sum-root.val;
        if(tmp==0){
        	if(root.left==root.right)//����null,����true
        		return true;
        	else
        		return hasPathSum(root.left, tmp)||hasPathSum(root.right, tmp);
        }
        else{//���������������ж�
        	return hasPathSum(root.left, tmp)||hasPathSum(root.right, tmp);
        }

    }
}
