package com.dcw.leetcode;

/**
 * Spiral Matrix II
 * 螺旋数组
 * @author topdc
 *
 */
public class Solution_59 {

	public int[][] generateMatrix(int n) {
        int [][]ret=new int[n][n];
        int mid=n/2;//构成的螺旋的环数
        int right=n-1;//右边界
        int count=1;
        for(int i=0;i<=mid;i++){
        	//先上横
        	for(int j=i;j<=right;j++)
        		ret[i][j]=count++;
        	//右下
        	for(int j=i+1;j<=right;j++)
        		ret[j][right]=count++;
        	//下横
        	for(int j=right-1;j>=i;j--)
        		ret[right][j]=count++;
        	//左上
        	for(int j=right-1;j>i;j--)
        		ret[j][i]=count++;
        	right--;
        }
        return ret;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
