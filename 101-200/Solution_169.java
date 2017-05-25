package com.dcw.leetcode;

import java.util.HashMap;

/**
 * Majority Element
 * @author Dong
 *
 */
public class Solution_169 {

	public int majorityElement(int[] nums) {
        int max=nums.length/2;
        HashMap<Integer, Integer> hm =new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
			if(hm.containsKey(nums[i]))
				hm.put(nums[i], hm.get(nums[i])+1);
			else
				hm.put(nums[i], 1);
		}
        for (int i = 0; i < nums.length; i++) {
			if(hm.get(nums[i])>max)
				return nums[i];
		}
        return -1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
