package com.dcw.leetcode;

/**
 * Merge Sorted Array
 * 合并两个排好序的数组，默认数组nums1的长度>=两个数组实际数字数量的和
 * 将nums1和nums从末尾开始进行大小比较并进行插入操作
 * @author topdc
 *
 */
public class Solution_88 {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int i=m-1;
		int j=n-1;
		int k=m+n-1;
		while(i>=0&&j>=0){//将大的数望末尾插入
			if(nums1[i]>nums2[j])
				nums1[k--]=nums1[i--];
			else
				nums1[k--]=nums2[j--];
		}
		//若j还没有插完
		while(j>=0){
			nums1[k--]=nums2[j--];
		}
    }
}
