package com.dcw.leetcode;

import java.util.HashSet;

/**
 * Contains Duplicate
 * 
 * @author topdc
 *
 */
public class Solution_217 {
	public boolean containsDuplicate(int[] nums) {
		HashSet<Integer> hs=new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			if(hs.contains(nums[i]))
				return true;
			hs.add(nums[i]);
		}
		return false;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
