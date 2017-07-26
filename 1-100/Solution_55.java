package com.dcw.leetcode;

/**
 * Jump Game \
 * �жϵ�һ���ڵ��ܷ񵽴����һ���ڵ�
 * ˼·�������һ���ڵ���ǰ���㣬��ÿ���ڵ㸳���ܷ񵽴��յ��flag
 * @author dong
 *
 */
public class Solution_55 {
	
	public boolean canJump(int[] nums) {
        boolean []flag=new boolean[nums.length];//�ܷ񵽴��յ�ı�־
        flag[nums.length-1]=true;
        int max=nums.length-1;//��Զ�ܵ����յ�ĵ������
        for(int i=nums.length-2;i>=0;i--){
        	int len=nums[i];
        	if(i+len>=max){//�ж��ܷ񵽴���Զ��
        		flag[i]=true;
        		max=i;//����max
        	}
        	else
        		flag[i]=false;

        }
        return flag[0];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
