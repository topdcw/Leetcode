package com.dcw.leetcode;

/**
 * Jump Game II
 *采用动态规划----会超时
 *定义数组jumpLength，jumpLength[i]表示从第i个位置到最后一个位置跳的最小次数
 *设目标坐标为target，则从target-1向前计算
 *例如：2、3、1、1、4
 * @author topdc
 *
 */
public class Solution_45 {
	public int count=0;
	public int jump(int[] nums) {
		int target=nums.length-1;//目标位置的坐标
		int []jumpLength=new int[nums.length];
		jumpLength[target]=0;
		for(int i=target-1;i>=0;i--){
			//s.jump(new int[]{5,9,3,2,1,0,2,3,3,1,0,0});
			//计算jumpLength[i]
			jumpLength[i]=-1;//初始为-1
			int min=2147483647;
			for(int j=1;j<=nums[i]&&i+j<=target;j++){
				count++;
				if(jumpLength[i+j]!=-1&&jumpLength[i+j]<min)
					min=jumpLength[i+j];
			}
			if(min!=2147483647)
				jumpLength[i]=1+min;
		}
		for (int i : jumpLength) {
			System.out.println(i);
		}
		return jumpLength[0];
        
    }
}
