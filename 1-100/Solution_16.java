package com.dcw.leetcode;

import java.util.Arrays;

/**
 * 3Sum Closest
 * 找三个数和最接近target
 * 返回他们的和
 * 转化为2Sum
 * @author topdc
 *
 */
public class Solution_16 {
	int Dvalue=2147483647;//用于记录三个数与target直接的差值
	
	public int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);//先升序排列
		
		int i=0;
		while(i<nums.length-2){//到倒数第三个
			if(i>0&&nums[i]==nums[i-1]){
				i++;//重复的不再计算。
				continue;
			}
			find_2_closest(i+1, nums.length-1, nums, nums[i], target);
			if(Dvalue==0)
				return target;
			i++;
		}
		
		return target+Dvalue;
    }
	
	public void find_2_closest(int l,int r,int[]nums ,int tmp,int target){
		
		while(l<r){
			if(nums[l]+nums[r]+tmp==target){
				Dvalue=0;
				return;
			}
			else
				if(nums[l]+nums[r]+tmp>target){
					if(Math.abs(Dvalue)>Math.abs(nums[l]+nums[r]+tmp-target)){
						//比较绝对值，小的那个更新Dvalue
						Dvalue=nums[l]+nums[r]+tmp-target;
					}
					r--;
				}
				else{
					if(Math.abs(Dvalue)>Math.abs(nums[l]+nums[r]+tmp-target)){
						//比较绝对值，用小的那个更新Dvalue
						Dvalue=nums[l]+nums[r]+tmp-target;
					}
					l++;	
				}
		}		
	}
}

