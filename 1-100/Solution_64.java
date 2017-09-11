package com.dcw.leetcode;

/**
 * Minimum Path Sum
 * 每个位置带有权重，求具有最小权重和的路径
 * @author topdc
 *
 */
public class Solution_64 {
	public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=0;
        if(m!=0)
        	n=grid[0].length;
        int [][]data=new int[m][n];
        for(int i=0;i<m;i++){
        	for(int j=0;j<n;j++){
        		if(i-1>=0&&j-1>=0){
        			int up=data[i-1][j]+grid[i][j];
        			int left=data[i][j-1]+grid[i][j];
        			data[i][j]=up<left?up:left;
        		}
        		else if(i-1>=0){
        			data[i][j]=data[i-1][j]+grid[i][j];
        		}
        		else if(j-1>=0){
        			data[i][j]=data[i][j-1]+grid[i][j];
        		}
        		else
        			data[i][j]=grid[i][j];
        	}
        }
		return data[m-1][n-1];
		
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
