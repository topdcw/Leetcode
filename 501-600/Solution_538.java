package com.dcw.leetcode;

import java.util.ArrayList;

public class Solution_538 {
	ArrayList<Integer> data=new ArrayList<>();
	public TreeNode convertBST(TreeNode root) {
		if(root==null)
			return root;
		search(root);//先记录信息
		Generate(root);//处理
		return root;
        
    }
	
	public void search(TreeNode root){
		if(root.left!=null)
			search(root.left);
		//处理该节点
		data.add(root.val);
		if(root.right!=null)
			search(root.right);
	}
	public void Generate(TreeNode root){
		if(root.left!=null)
			Generate(root.left);
		//处理该节点
		int val=root.val;
		for(int i=data.size()-1;i>=0;i--){
			if(data.get(i)>val)
				root.val+=data.get(i);
			else
				break;
		}
		
		if(root.right!=null)
			Generate(root.right);
	}
	
//	private int sum = 0;
//    
//    public TreeNode convertBST(TreeNode root) {
//        if (null == root) return null;
//        
//        convertBST(root.right);
//         root.val += sum;
//        sum = root.val;
//        convertBST(root.left);
//        return root;
//    }
}
