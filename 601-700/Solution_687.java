package com.dcw.leetcode;

import java.util.ArrayList;

//����һ�����������ҵ����·�������·���е�ÿ���ڵ������ֵͬ�� ����·�����Ծ���Ҳ���Բ��������ڵ㡣
public class Solution_687 {
	int flag=1;//����һ��root����������Ϊ0

	public int longestUnivaluePath(TreeNode root) {
		if(root==null)
			return 0;
		int res=0;
        ArrayList<TreeNode> data=new ArrayList<>();
        data.add(root);
        while(!data.isEmpty()){
        	if(data.get(0).left!=null)
        		data.add(data.get(0).left);
        	if(data.get(0).right!=null)
        		data.add(data.get(0).right);
        	int tmp=searchlong(data.get(0));
        	res=tmp>res?tmp:res;
        	data.remove(0);
        	flag=1;
        }
        return res;
    }
	
	public int searchlong(TreeNode root){//�Ӱ����ڵ㿪ʼ�������ֵ
		if(root==null)
			return 0;
		int left=0;
		int right=0;
		if(root.left!=null&&root.right!=null){
			if(root.val==root.left.val&&root.val==root.right.val&&flag==1){
				flag=0;
				return searchlong(root.left)+searchlong(root.right)+2;
			}
			else{
				flag=0;
				if(root.val==root.left.val)
					left=1+searchlong(root.left);
				if(root.val==root.right.val)
					right=1+searchlong(root.right);
			}
		}
		else{
			flag=0;
			if(root.left!=null){
				if(root.val==root.left.val)
					left=1+searchlong(root.left);
			}
				
			if(root.right!=null){
				if(root.val==root.right.val)
					right=1+searchlong(root.right);
			}
		}	
		return left>right?left:right;
	}
}
