package com.dcw.leetcode;

/**
 * Remove Duplicates from Sorted Array
 * ��Ȼ������õģ��ʹ�ͷ��ʼ������count���ڼ���,��ʼΪ0,��ʾ��һ����λ�á�
 * ���nums[i]��nums[i+1]����ͬ����nums[i]����nums[count]��λ��,count++��
 * ����nums[nums.length-1]����nums[count]λ���ϡ�count++��
 * @author topdc
 *
 */
public class Solution_26 {

	public int removeDuplicates(int[] nums) {
		int count=0;
		if(nums.length==0)
			return count;
		
		for(int i =0 ;i<nums.length-1;i++){
			if(nums[i]!=nums[i+1]){
				nums[count]=nums[i];
				count++;
			}			
		}
		nums[count]=nums[nums.length-1];
		count++;
		return count;
        
    }
}

