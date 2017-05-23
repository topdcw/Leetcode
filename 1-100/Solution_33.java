package com.dcw.leetcode;


/**
 * Search in Rotated Sorted Array
 * 
 * @author topdc
 *
 */
public class Solution_33 {
	public int search(int[] nums, int target) {
        int index =-1;
        //O(logN)�ⷨ
        //���ҵ���ת�㣬����45670123,�ҵ�0����λ��
        //�������ʣ���ת������ֵȫ�������ұߵ�ֵ
        int lo=0;
        int hi=nums.length-1;
        while(lo<hi){
        	int mid=(lo+hi)/2;
        	if(nums[mid]>nums[hi])
        		lo= mid+1;
        	else
        		hi=mid;
        }
        
        //lo������ת���λ��,���ж�target�� �����ĸ���Χ��
        int rot=lo;
        if(nums[nums.length-1]>=target){//��rot��nums.length-1֮��Ѱ��
        	hi=nums.length-1;
        	lo=rot;
        	while(lo<=hi){
        		int mid=(lo+hi)/2;
        		if(nums[mid]<target)
        			lo=mid+1;
        		else if(nums[mid]>target)
        			hi=mid-1;
        		else{
        			index = mid;
        			break;
        		}
        	}
        }
        else{
        	hi=rot-1;
        	lo=0;
        	while(lo<=hi){
        		int mid=(lo+hi)/2;
        		if(nums[mid]<target)
        			lo=mid+1;
        		else if(nums[mid]>target)
        			hi=mid-1;
        		else{
        			index = mid;
        			break;
        		}
        	}
        }
        return index;
        
    }
}
