package com.dcw.leetcode;

/**
 * Jump Game \
 * 判断第一个节点能否到达最后一个节点
 * 思路：从最后一个节点向前计算，给每个节点赋予能否到达终点的flag
 * @author dong
 *
 */
public class Solution_55 {
	
	public boolean canJump(int[] nums) {
        boolean []flag=new boolean[nums.length];//能否到达终点的标志
        flag[nums.length-1]=true;
        int max=nums.length-1;//最远能到达终点的点的坐标
        for(int i=nums.length-2;i>=0;i--){
        	int len=nums[i];
        	if(i+len>=max){//判断能否到达最远点
        		flag[i]=true;
        		max=i;//更新max
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
