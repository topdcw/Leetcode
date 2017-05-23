package com.dcw.leetcode;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;

/**
 * Relative Ranks   
 * 使用LinkedHashMap和数组排序相结合
 * @author Dong
 *
 */
public class Solution_506 {
	
	public String[] findRelativeRanks(int[] nums) {
		LinkedHashMap<Integer, String>hm=new LinkedHashMap<>();
		for (int i : nums) {
			hm.put(i, null);
		}
		Arrays.sort(nums);
		String []ret=new String[nums.length];
		//根据nums排序结果，在LinkedHashMap中赋值
		if(nums.length>=1)//", "Silver Medal" and "Bronze Medal".
			hm.put(nums[nums.length-1-0], "Gold Medal");
		if(nums.length>=2)
			hm.put(nums[nums.length-1-1], "Silver Medal");
		if(nums.length>=3)
			hm.put(nums[nums.length-1-2], "Bronze Medal");
		for(int i=3;i<nums.length;i++)
			hm.put(nums[nums.length-1-i], (i+1)+"");
		Collection<String>c=hm.values();
		int i=0;
		for (String string : c) {
			ret[i++]=string;
		}
		
		return ret;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution_506 s=new Solution_506();
		String[]ss=s.findRelativeRanks(new int[]{10,3,8,9,4});
		for (String string : ss) {
			System.out.println(string);
		}
	}

}
