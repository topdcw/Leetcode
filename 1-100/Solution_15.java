package com.dcw.leetcode;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;;

/**
 * 3Sum
 * ת��Ϊ2sum��⣬�����ӶȽ��͵�O(n^2)
 * ���������һ��С��Խ�硣
 * @author topdc
 *
 */
public class Solution_15 {
	List<List<Integer>> ret;
	
	public Solution_15(){
		ret=new ArrayList<List<Integer>>();
	}
	public List<List<Integer>> threeSum(int[] nums) {
		if(nums.length<3)
			return ret;
		
		Arrays.sort(nums);//��������
		//Ѱ��ʱ����ȷ��һ��ֵtmp���ٴ�ʣ��ֵ���ҵ�������ΪĿ��ֵtarget-tmp����������
		//
		int i=0;
		while(i<nums.length-2){//ѭ��������������������
			//while(i>0&&i<nums.length-2&&nums[i]==nums[i-1])
			//	i++;//�ظ��Ĳ��ټ��㡣
			if(i>0&&nums[i]==nums[i-1]){
				i++;//�ظ��Ĳ��ټ��㡣
				continue;
			}
			find_2sum(i+1,nums.length-1,nums,nums[i]);
			i++;
		}
		return ret;
		
    }
	
	
	/**
	 * ��i+1��length-1֮����target���������������������ظ���
	 * ��Ϊ�ǰ������еģ��������ͷѰ�ң����ܻ��ҵ�ԭ���Ѿ��ҵ���Ԫ���飬�����ظ���
	 * @param l
	 * @param r
	 * @param nums
	 * @param target
	 */
	public void find_2sum(int l,int r,int[]nums,int tmp){
		while(l<r){
			if(nums[l]+nums[r]+tmp==0){
				List<Integer> arr=new ArrayList<Integer>();
				arr.add(tmp);
				arr.add(nums[l]);
				arr.add(nums[r]);
				ret.add(arr);
				while(l<r&&nums[l+1]==nums[l])
					l++;
				while(l<r&&nums[r-1]==nums[r])
					r--;
				l++;
				r--;
			}
			else
    			if(nums[l]+nums[r]+tmp>0)
	    			r--;
	        	else
	        		if(nums[l]+nums[r]+tmp<0)
			        	l++;
		}
		
	}
}