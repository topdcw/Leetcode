package com.dcw.leetcode;


/**
 * Next Permutation
 * 
 * ����˼·�������к���ǰѰ�ң��ҵ���һ��nums[i]<nums[i+1]����¼i��λ��
 * ���û�ҵ���˵���ǽ������У������н��з�ת
 * ����ҵ���˵����nums[i]֮��������ǽ������У���nums[i]���������ӽ�������nums[i]��������λ��
 * ���nums[i]��Ľ������з�ת��
 * @author topdc
 *
 */
public class Solution_31 {
	
	public void nextPermutation(int[] nums) {
		int flag = -1;//���ڱ�ʶ���һ��nums[i]<nums[i+1]��i��λ��
		
		for(int i=nums.length-2;i>=0;i--){
			if(nums[i]<nums[i+1]){
				flag=i;
				break;
			}
		}
		if(flag==-1){//˵����54321���Ƶ�����
			reverse(nums,0,nums.length-1);
		}
		else{
			//�ҵ���nums[flag]��ĵ�������һ��������126543����2�����3��156432����5�����6.
			for(int j=nums.length-1;j>flag;j--){
				if(nums[j]>nums[flag]){
					//����
					int tmp =nums[flag];
					nums[flag]=nums[j];
					nums[j]=tmp;
					reverse(nums, flag+1, nums.length-1);
					break;
				}
			}
		}
		
    }
	
	private void reverse(int[]nums,int begin,int end){
		int tmp;
		int middle = (begin+end)/2;
		for(int i=begin;i<=middle;i++){
			tmp =nums[i];
			nums[i]=nums[begin+end-i];
			nums[begin+end-i]=tmp;
		}
	}
}
