package com.dcw.leetcode;

/**
 * Unique Paths II
 * ´øÓÐÕÏ°­Îï
 * @author topdc
 *
 */
public class Solution_63 {

	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=0;
        if(m!=0)
        	n=obstacleGrid[0].length;
        int [][]data=new int[m][n];
        for(int i=0;i<m;i++){
        	for(int j=0;j<n;j++){
        		if(i-1>=0&&j-1>=0){
        			data[i][j]=0;
        			if(obstacleGrid[i][j]!=1){
        				if(obstacleGrid[i-1][j]!=1)
        					data[i][j]+=data[i-1][j];
        				if(obstacleGrid[i][j-1]!=1)
        					data[i][j]+=data[i][j-1];
        			}
        			
        		}
        		else if(i-1>=0){
        			data[i][j]=0;
        			if(obstacleGrid[i][j]!=1){
        				if(obstacleGrid[i-1][j]!=1)
            				data[i][j]+=data[i-1][j];
        			}
        			
        		}
        		else if(j-1>=0){
        			data[i][j]=0;
        			if(obstacleGrid[i][j]!=1){
        				if(obstacleGrid[i][j-1]!=1)
        					data[i][j]+=data[i][j-1];
        			}
        			
        		}
        		else if(obstacleGrid[i][j]!=1)
        				data[i][j]=1;
        		else
        			data[i][j]=0;
        	}
        }
        return data[m-1][n-1];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
