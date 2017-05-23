package com.dcw.leetcode;

/**
 * Subtree of Another Tree
 * 
 * 通过遍历两个树，存为字符串形式，若左右节点为空时，插入#号，形成标记,使用*号做为间隔。
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


