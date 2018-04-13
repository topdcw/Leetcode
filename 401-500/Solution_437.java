package com.dcw.leetcode;

// 路径总和 
//思路，以每个字节点为顶点进行遍历
public class Solution_437 {
	private int result=0;
	
	public int pathSum(TreeNode root, int sum) {
		if(root!=null)
    		search(root, sum);
		return result;
        
    }
	
	//递归遍历树
	public void search(TreeNode root,int sum){
	
		//计算结点信息
		count(root,sum);
		if(root.left!=null)
			search(root.left,sum);
		
		if(root.right!=null)
			search(root.right,sum);
		
	}
	
	//以该节点为头节点开始，能否使路径和为sum
	public void count(TreeNode root,int sum){
		int tmp=sum-root.val;
		if(tmp==0)
			result++;
		if(root.left!=null)
			count(root.left,tmp);
		if(root.right!=null)
			count(root.right,tmp);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
