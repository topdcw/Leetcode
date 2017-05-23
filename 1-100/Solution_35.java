package com.dcw.leetcode;

/**
 * Search Insert Position
 * ʹ�ö���
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
		//��ֹ������lo>hi����lo����λ�þ�����Ҫ�����λ��
		return lo;
    }
}
