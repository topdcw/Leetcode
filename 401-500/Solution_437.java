package com.dcw.leetcode;

// ·���ܺ� 
//˼·����ÿ���ֽڵ�Ϊ������б���
public class Solution_437 {
	private int result=0;
	
	public int pathSum(TreeNode root, int sum) {
		if(root!=null)
    		search(root, sum);
		return result;
        
    }
	
	//�ݹ������
	public void search(TreeNode root,int sum){
	
		//��������Ϣ
		count(root,sum);
		if(root.left!=null)
			search(root.left,sum);
		
		if(root.right!=null)
			search(root.right,sum);
		
	}
	
	//�Ըýڵ�Ϊͷ�ڵ㿪ʼ���ܷ�ʹ·����Ϊsum
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
