package com.dcw.leetcode;


/**
 * Next Permutation
 * 
 * 解题思路：从数列后向前寻找，找到第一个nums[i]<nums[i+1]，记录i的位置
 * 如果没找到，说明是降序排列，将数列进行翻转
 * 如果找到，说明，nums[i]之后的数字是降序排列，将nums[i]与其后面最接近并大于nums[i]的数互换位置
 * 最后将nums[i]后的降序序列翻转。
 * @author topdc
 *
 */
public class Solution_31 {
	
	public void nextPermutation(int[] nums) {
		int flag = -1;//用于标识最后一个nums[i]<nums[i+1]，i的位置
		
		for(int i=nums.length-2;i>=0;i--){
			if(nums[i]<nums[i+1]){
				flag=i;
				break;
			}
		}
		if(flag==-1){//说明是54321类似的排列
			reverse(nums,0,nums.length-1);
		}
		else{
			//找到比nums[flag]大的倒着数第一个数，如126543，比2大的是3。156432，比5大的是6.
			for(int j=nums.length-1;j>flag;j--){
				if(nums[j]>nums[flag]){
					//交换
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
