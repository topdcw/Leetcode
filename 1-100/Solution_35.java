package com.dcw.leetcode;

/**
 * Search Insert Position
 * 使用二分
 * @author topdc
 *
 */
public class Solution_35 {

	public int searchInsert(int[] nums, int target) {
	
		if(nums.length==0)
			return 0;
		int lo=0;
		int hi=nums.length-1;
		int index=0;
		while(lo<=hi){
			int mid=(lo+hi)/2;
			if(nums[mid]>target)
				hi=mid-1;
			else if(nums[mid]<target)
				lo=mid+1;
			else{
				index=mid;
				return index;
			}
		}
		//终止条件是lo>hi，故lo所在位置就是需要插入的位置
		return lo;
    }
}
