package com.dcw.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Binary Tree Level Order Traversal II 
 * 按层遍历返回，返回每一层的数字 
 * 利用队列
 * @author topdc
 *
 */
public class Solution_107 {
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> ret=new ArrayList<List<Integer>>();
		LinkedList<TreeNode> lklist=new LinkedList<>();
		if(root==null)
			return ret;
		//先把第一个节点入队列
		lklist.add(root);
		int count=1;//记录队列个数
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
			count=lklist.size();//更新count
			ret.add(list);
		}
		//上面计算的是从第一层到最后一层的顺序，题目要求从底层到第一层，所以需要逆序
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
