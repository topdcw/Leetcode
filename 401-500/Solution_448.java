package com.dcw.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Find All Numbers Disappeared in an Array
 * ÿ�ζ���nums[i],��nums[nums[i]]>0,��nums[nums[i]]ȡ��
 * ������0�ĵط�������ȱ�ٵĵط�
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
