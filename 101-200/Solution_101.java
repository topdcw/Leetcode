package com.dcw.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Symmetric Tree 
 * ˼·��ʹ�õݹ��㷨�����������ĶԳ���ת��Ϊ�������Գ��Ե��ж�
 * ��������ת��Ϊ�����⡣
 * @author topdc
 *
 */
public class Solution_101 {
	List<Integer> list=new ArrayList<>();
	public boolean isSymmetric(TreeNode root) {
		if(root==null)
			return true;
		else
			return subIsSymmetric(root.left, root.right);
        
    }
	private boolean subIsSymmetric(TreeNode left,TreeNode right){//���������Գ��Ե��ж�
		if(left==null||right==null)
			return left==right;//����һ����Ϊ���򲻶Գ�
		if(left.val!=right.val)
			return false;
		return subIsSymmetric(left.left, right.right)&&subIsSymmetric(left.right, right.left);//��Ӧ������Ҳ��Ҫ�Գ�
	}
}
