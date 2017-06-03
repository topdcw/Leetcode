package com.dcw.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Binary Tree Level Order Traversal II 
 * ����������أ�����ÿһ������� 
 * ���ö���
 * @author topdc
 *
 */
public class Solution_107 {
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> ret=new ArrayList<List<Integer>>();
		LinkedList<TreeNode> lklist=new LinkedList<>();
		if(root==null)
			return ret;
		//�Ȱѵ�һ���ڵ������
		lklist.add(root);
		int count=1;//��¼���и���
		while(!lklist.isEmpty()){
			List<Integer> list=new ArrayList<>();
			for(int i=1;i<=count;i++){
				TreeNode tmp=lklist.poll();
				list.add(tmp.val);
				if(tmp.left!=null)
					lklist.add(tmp.left);
				if(tmp.right!=null)
					lklist.add(tmp.right);
			}
			count=lklist.size();//����count
			ret.add(list);
		}
		//���������Ǵӵ�һ�㵽���һ���˳����ĿҪ��ӵײ㵽��һ�㣬������Ҫ����
		List<List<Integer>> realret=new ArrayList<List<Integer>>();
		for (int i = ret.size()-1;i>=0; i--) {
			realret.add(ret.get(i));
		}
		return realret;
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
