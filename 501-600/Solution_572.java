package com.dcw.leetcode;

/**
 * Subtree of Another Tree
 * 
 * ͨ����������������Ϊ�ַ�����ʽ�������ҽڵ�Ϊ��ʱ������#�ţ��γɱ��,ʹ��*����Ϊ�����
 * @author topdc
 *
 */
public class Solution_572 {
	StringBuilder sbs=new StringBuilder();
	StringBuilder sbt=new StringBuilder();
	public boolean isSubtree(TreeNode s, TreeNode t) {
        preOrder(s, sbs);
        preOrder(t, sbt);
        System.out.println(sbs.toString());
        System.out.println(sbt.toString());
		return sbs.toString().contains(sbt);
    }
	
	private void preOrder(TreeNode root,StringBuilder sb){
		if(root==null){
			sb.append("*#");
			return;
		}
		sb.append('*').append(root.val);	
		preOrder(root.left, sb);
		preOrder(root.right, sb);
	}
	public static void main(String[] args) {
		
	}

}


