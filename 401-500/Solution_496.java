package com.dcw.leetcode;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * Next Greater Element I
 *  π”√hashmap∫Õstack
 * @author Dong
 *
 */
public class Solution_496 {

	public int[] nextGreaterElement(int[] findNums, int[] nums) {
        int ret[]=new int[findNums.length];
        LinkedList<Integer> stack=new LinkedList<>();
        HashMap<Integer, Integer> hm=new HashMap<>();
        for (int i = nums.length-1; i >=0; i--) {
			while((!stack.isEmpty())&&stack.peek()<nums[i]){
				stack.pop();
			}
			hm.put(nums[i], stack.isEmpty()?-1:stack.peek());
			stack.push(nums[i]);
		}
        for (int i = 0; i < findNums.length; i++) {
			ret[i]=hm.get(findNums[i]);
		}
        
        return ret;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
