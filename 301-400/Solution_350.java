package com.dcw.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Intersection of Two Arrays II
 * 思路：考虑使用键值对map来解决这个问题
 * @author topdc
 *
 */
public class Solution_350 {

	private HashMap<Integer, Integer> hm1=new HashMap<>();
	public int[] intersect(int[] nums1, int[] nums2) {
		List<Integer>list=new ArrayList();
        for(int i=0;i<nums1.length;i++){
        	if(hm1.containsKey(nums1[i]))
        		hm1.put(nums1[i], hm1.get(nums1[i])+1);
        	else
        		hm1.put(nums1[i],1);
        }
        for(int i=0;i<nums2.length;i++){
        	if(hm1.containsKey(nums2[i])){
        		if(hm1.get(nums2[i])!=0){
        			list.add(nums2[i]);
        			hm1.put(nums2[i], hm1.get(nums2[i])-1);
        		}
        	}
        }
        int[]ret=new int[list.size()];
        for(int i=0;i<list.size();i++){
        	ret[i]=list.get(i);
        }
        return ret;
		
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
