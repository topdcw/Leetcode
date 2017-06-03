package com.dcw.leetcode;

import java.util.Arrays;
/**
 * Longest Harmonious Subsequence
 * 先进行排序，然后从第一个出发，计算两个不同数的间隔，
 * 如果等于1，则ret等于这 两种数个数的和。
 * @author topdc
 *
 */
public class Solution_594 {
	public int findLHS(int[] nums) {
		if(nums.length==0)
			return 0;
        Arrays.sort(nums);
        int ret=0;
        //初始都是第一个数字
        int last=nums[0],now=nums[0];//记录上次数字，和现在数字
        int lastnum=0,nownum=1;//记录上次数字个数，和现在数字个数
        for (int i = 1; i < nums.length; i++) {
			if(nums[i]==nums[i-1])
				nownum++;
			else{
				if(now-last==1){//如果两个数之差为1，进行更新
					if(lastnum+nownum>ret)
						ret=lastnum+nownum;
				}
				last=now;		//更新last
				now=nums[i];	//更新now
				lastnum=nownum;
				nownum=1;
			}
		}
        if(now-last==1){//针对最后一个数字的处理
			if(lastnum+nownum>ret)
				ret=lastnum+nownum;
		}
        return ret;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
