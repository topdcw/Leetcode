package com.dcw.leetcode;

/**
 * Unique Paths   
 * 从一个矩阵的左上角到右下角，总共有多少个路径。每次只能向下或向右移动。
 * 动态规划，因为使用分治法的话子问题有重复,时间复杂度大 。
 * @author topdc
 *
 */
public class Solution_62 {

	public int uniquePaths(int m, int n) {
		//一行一行的来
		int [][]data=new int [m][n];//存储到达改点的路径数
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				if(j-1>=0&&i-1>=0){
					data[i][j]=data[i-1][j]+data[i][j-1];
				}
				else if(j-1>=0){
					data[i][j]=data[i][j-1];
				}
				else if(i-1>=0){
					data[i][j]=data[i-1][j];
				}
				else
					data[i][j]=1;
			}
		}
		return data[m-1][n-1];	
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution_62 s=new Solution_62();
		System.out.println(s.uniquePaths(20, 20));
	}

}
