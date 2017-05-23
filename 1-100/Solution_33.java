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
        //O(logN)解法
        //先找到旋转点，比如45670123,找到0所在位置
        //利用性质，旋转点左侧的值全都大于右边的值
        int lo=0;
        int hi=nums.length-1;
        while(lo<hi){
        	int mid=(lo+hi)/2;
        	if(nums[mid]>nums[hi])
        		lo= mid+1;
        	else
        		hi=mid;
        }
        
        //lo就是旋转点的位置,先判断target是 属于哪个范围的
        int rot=lo;
        if(nums[nums.length-1]>=target){//在rot和nums.length-1之间寻找
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
