package com.dcw.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *  4Sum问题
 *  转化为3sum问题
 *  进而转化为2sum问题
 *  O(n^3)
 * @author topdc
 *
 */
public class Solution_18 {
	
	List<List<Integer>> lis=new ArrayList<List<Integer>>();
	
	public List<List<Integer>> fourSum(int[] nums, int target) {
		
		Arrays.sort(nums);//先按升序排列
		if(nums.length<4)
			return lis;
		int i=0;
		while(i<nums.length-3){//到倒数第四个截止
			if(i>0&&nums[i]==nums[i-1]){
				i++;
				continue;
			}
			_3sum(i+1,nums.length-1,nums[i],nums,target);
			i++;
		}
		
		return lis;
    }
	public void _3sum(int l,int r,int tmp1,int []nums,int target){
		
		int j=l;
		while(j<nums.length-2){
			if(j>l&&nums[j]==nums[j-1]){
				j++;
				continue;
			}
			_2sum(j+1,nums.length-1,tmp1,nums[j],nums,target);
			j++;
		}
		
	}
	
	public void _2sum(int l,int r,int tmp1,int tmp2,int[]nums,int target){
		
		while(l<r){
			if(nums[l]+nums[r]+tmp1+tmp2==target){
				List<Integer> L=new ArrayList<Integer>();
				L.add(tmp1);
				L.add(tmp2);
				L.add(nums[l]);
				L.add(nums[r]);
				lis.add(L);
				while(l<r&&nums[r-1]==nums[r])//防止重复计算
					r--;
				while(l<r&&nums[l+1]==nums[l])
					l++;
				r--;
				l++;				
			}
			else
				if(nums[l]+nums[r]+tmp1+tmp2>target)
					r--;
				else
					l++;
		}
	}

}
