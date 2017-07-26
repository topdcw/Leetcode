package com.dcw.leetcode;

/**
 * Rotate Array
 * Rotate an array of n elements to the right by k steps.
 * ����k����λ�������Ĳ������������ǰ�档
 * ���磺1234567  3  =�� 5671234
 * Ҳ����˵��k=nums.lengthʱ�������κ��ƶ���
 * k>nums.length��Ч��k=k%nums.length;
 * ʹ��������ת��
 * @author dong
 *
 */
public class Solution_189 {
	public void rotate(int[] nums, int k) {
		k=k%nums.length;
		//������ת
		fanzhuan(nums, 0, nums.length-k-1);
		fanzhuan(nums,nums.length-k,nums.length-1);
		fanzhuan(nums,0,nums.length-1);
		
		
    }
	
	private void fanzhuan(int[]nums,int from,int to){
		int tmp;
		while(from<to){
			tmp=nums[from];
			nums[from++]=nums[to];
			nums[to--]=tmp;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
