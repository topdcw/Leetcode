package com.dcw.leetcode;

/**
 * Write an efficient algorithm that searches for a value in an m x n matrix. 
 * This matrix has the following properties:
 * Integers in each row are sorted from left to right.
 * The first integer of each row is greater than the last integer of the previous row.
 * 思路：借鉴二分查找
 * @author topdc
 *
 */
public class Solution_74 {

	public boolean searchMatrix(int[][] matrix, int target) {
		if(matrix.length==0)
			return false;
		int m=matrix.length;
		int n=matrix[0].length;
		int from=0;
		int to=m*n-1;
		int flag;
		while(from<=to){
			flag=(from+to+1)/2;
			//计算flag在矩阵中的位置
			int i=(flag/n);//所在行
			int j=(flag-i*n);//所在列
			if(matrix[i][j]==target)
				return true;
			else
				if(target>matrix[i][j])
					from=flag+1;
				else
					to=flag-1;
		}
		return false;
		
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
