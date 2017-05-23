package com.dcw.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Find All Numbers Disappeared in an Array
 * 每次对于nums[i],若nums[nums[i]]>0,对nums[nums[i]]取反
 * 最后大于0的地方，就是缺少的地方
 * @author Dong
 *
 */
public class Solution_448 {

	public List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> ret=new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			int m=Math.abs(nums[i])-1;
			if(nums[m]>0){
				nums[m]=-nums[m];
			}
		}
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]>0)
				ret.add(i+1);
		}
		return ret;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
