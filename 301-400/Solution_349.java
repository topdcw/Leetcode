package com.dcw.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Intersection of Two Arrays
 *先排序，再比对
 * @author Dong
 *
 */
public class Solution_349 {

	public int[] intersection(int[] nums1, int[] nums2) {
		if(nums1.length==0||nums2.length==0)
			return new int[0];
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list=new ArrayList<>();
        for (int i = 0,j=0; i < nums1.length&&j<nums2.length; ) {
        	if(nums1[i]>nums2[j])
        		j++;
        	else{
        		if(nums1[i]<nums2[j])
        			i++;
        		else{
        			if(i>0){
        				if(nums1[i]!=nums1[i-1])//判断是否与前一个重复
        					list.add(nums1[i]);
        			}
        			else
        				list.add(nums1[i]);
        			i++;
    				j++;
        		}
        	}
		}
        int[]ret=new int[list.size()];
        for (int i = 0; i < ret.length; i++) {
			ret[i]=list.get(i);
		}
        return ret;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
