package com.dcw.leetcode;

/**\
 * Max Consecutive Ones
 * 
 * @author Dong
 *
 */
public class Solution_485 {

	public int findMaxConsecutiveOnes(int[] nums) {
        int ret=0;
        int newcount=0;
        for (int i = 0; i < nums.length; i++) {
			if(nums[i]==1){
				newcount++;
				ret=newcount>ret?newcount:ret;
			}
			else{//Åöµ½ÁË0
				newcount=0;
			}	
		}
        return ret;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
