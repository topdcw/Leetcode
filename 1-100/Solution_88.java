package com.dcw.leetcode;

/**
 * Merge Sorted Array
 * �ϲ������ź�������飬Ĭ������nums1�ĳ���>=��������ʵ�����������ĺ�
 * ��nums1��nums��ĩβ��ʼ���д�С�Ƚϲ����в������
 * @author topdc
 *
 */
public class Solution_88 {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int i=m-1;
		int j=n-1;
		int k=m+n-1;
		while(i>=0&&j>=0){//���������ĩβ����
			if(nums1[i]>nums2[j])
				nums1[k--]=nums1[i--];
			else
				nums1[k--]=nums2[j--];
		}
		//��j��û�в���
		while(j>=0){
			nums1[k--]=nums2[j--];
		}
    }
}
