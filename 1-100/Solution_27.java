package com.dcw.leetcode;

/**
 * Remove Element
 * ����һ��count,��ʼΪ0����ʾ��ǰ��λ��,Ҳ��ʵ�ʸ���
 * ���nums[i]��=valʱ������nums[count]�У�count++;��ʾ�µĿ�λ�á�
 * @author topdc
 *
 */
public class Solution_27 {
	public int removeElement(int[] nums, int val) {
		
		int count=0;
		if(nums.length==0)
			return count;
		
		for(int i=0;i<nums.length;i++){
			if(nums[i]!=val){
				nums[count]=nums[i];
				count++;
			}
		}
		return count;
    }
}
