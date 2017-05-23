package com.dcw.leetcode;

import java.util.Arrays;

/**
 * 3Sum Closest
 * ������������ӽ�target
 * �������ǵĺ�
 * ת��Ϊ2Sum
 * @author topdc
 *
 */
public class Solution_16 {
	int Dvalue=2147483647;//���ڼ�¼��������targetֱ�ӵĲ�ֵ
	
	public int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);//����������
		
		int i=0;
		while(i<nums.length-2){//������������
			if(i>0&&nums[i]==nums[i-1]){
				i++;//�ظ��Ĳ��ټ��㡣
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
						//�ȽϾ���ֵ��С���Ǹ�����Dvalue
						Dvalue=nums[l]+nums[r]+tmp-target;
					}
					r--;
				}
				else{
					if(Math.abs(Dvalue)>Math.abs(nums[l]+nums[r]+tmp-target)){
						//�ȽϾ���ֵ����С���Ǹ�����Dvalue
						Dvalue=nums[l]+nums[r]+tmp-target;
					}
					l++;	
				}
		}		
	}
}

