package com.dcw.leetcode;

/**
 * Search for a Range
 * 要求O(logN)
 * 思路：二分法,先找到一个符合的，再去另外两个范围找begin和end
 * @author topdc
 *
 */
public class Solution_34 {
	public int[] searchRange(int[] nums, int target) {
		int lo1,lo2;
		int hi1,hi2;
		int index=-1;
		lo1=0;
		hi1=nums.length-1;
		
		//先做第一次二分，看能不能找到target，并记录找到的位置
        while(lo1<=hi1){
        	int mid=(lo1+hi1)/2;
        	if(nums[mid]>target)
        		hi1=mid-1;
        	else if(nums[mid]<target)
        		lo1=mid+1;
        	else{
        		index=mid;
        		break;//找到一个就好
        	}
        }
        if(index==-1){//没找到target,直接返回
            return new int[]{-1,-1};
        }
        int begin,end;
        begin=end=index;
        //根据index做两个划分，lo1到index-1，index+1到hi1.继续使用二分法
        lo2=index+1;
        hi2=hi1;//用hi2表示hi1的位置
        hi1=index-1;
		//lo1到index-1之间的处理,因为是升序排列，所以要么小于target要么等于target
        while(lo1<=hi1){
        	int mid =(lo1+hi1)/2;
        	if(nums[mid]<target)
        		lo1=mid+1;
        	else{
        		begin=mid;
        		hi1=mid-1;//继续往左寻找
        	}
        }
        //index+1到hi2之间的处理,因为是升序排列，所以要么大于于target要么等于target
        while(lo2<=hi2){
        	int mid =(lo2+hi2)/2;
        	if(nums[mid]>target)
        		hi2=mid-1;
        	else{
        		end=mid;
        		lo2=mid+1;//继续往右寻找
        	}
        }
        return new int[]{begin,end};
    }
	
}
