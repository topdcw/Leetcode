package com.dcw.leetcode;

/**
 * First Missing Positive
 * ������n���ڵ�n-1��λ���ϣ������ӵ�һ��λ�ÿ�ʼ��
 * ���λ���ϵ���������λ�úţ���ô���ǵ�һ��ȱʧ������
 * @author topdc
 *
 */

public class Solution_41 {

	public int firstMissingPositive(int[] nums) {
		
		int tmp;
		////��С�ڵ���nums.length������nums[i]�ŵ���nums[i]-1��λ����  
		for(int i=0;i<nums.length;i++){
			//���whileѭ���ǳ���Ҫ
			while(nums[i]>0&&nums[i]<=nums.length&&nums[i]!=nums[nums[i]-1]){
				tmp=nums[nums[i]-1];
				nums[nums[i]-1]=nums[i];
				nums[i]=tmp;
			}
		}
		
		for(int i=0;i<nums.length;i++){
			if(nums[i]!=i+1){
				return i+1;
			}
		}
		return nums.length+1;
        
    }
}
