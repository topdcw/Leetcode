package com.dcw.leetcode;

/**
 * Two Sum II - Input array is sorted
 * @author Dong
 *
 */
public class Solution_167 {
	public int[] twoSum(int[] numbers, int target) {
        int from=0;
        int to=numbers.length-1;
        while(from<to){
        	if(numbers[from]+numbers[to]==target){
        		return new int[]{from+1,to+1};
        	}
        	if(numbers[from]+numbers[to]>target){
        		to--;
        	}
        	else
        		from++;
        }
        return null;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
