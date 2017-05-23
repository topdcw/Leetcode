package com.dcw.leetcode;

/**
 * Reshape the Matrix  
 * 
 * @author Dong
 *
 */
public class Solution_566 {

	public int[][] matrixReshape(int[][] nums, int r, int c) {
        if(nums.length==0||(r*c)!=(nums.length*nums[0].length))
        	return nums;
        int [][]ret=new int[r][c];
        int m=0,n=0;
        for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				if(n>c-1){//一行完毕。进行换行。
					m+=1;
					n=0;
				}
				ret[m][n]=nums[i][j];
				n++;
			}
		}
        return ret;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
