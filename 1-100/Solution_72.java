package com.dcw.leetcode;

/**
 * Edit Distance
 * 采用动态规划
 * 定义D(i，j)表示字符串1的前i位与字符串2的前j位需要操作的次数
 * 初始D(i,0)=i   D(0,j)=j
 * @author topdc
 *
 */
public class Solution_72 {
	public int minDistance(String word1, String word2) {
		int m=word1.length()+1;	
		int n=word2.length()+1;
        int [][]data=new int[m][n];
        //初始化
        for(int i=0;i<m;i++)
        	data[i][0]=i;
        for(int j=0;j<n;j++)
        	data[0][j]=j;
        //分三种情况进行计算
        for(int i=1;i<m;i++){
        	for(int j=1;j<n;j++){
        		data[i][j]=data[i-1][j]<data[i][j-1]?data[i-1][j]+1:data[i][j-1]+1;
        		if(word2.charAt(j-1)==word1.charAt(i-1)){
        			data[i][j]=data[i][j]>data[i-1][j-1]?data[i-1][j-1]:data[i][j];
        		}
        		else{
        			data[i][j]=data[i][j]>data[i-1][j-1]?data[i-1][j-1]+1:data[i][j];
        		}
        	}
        }
        	
        return data[m-1][n-1];
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution_72 s=new Solution_72();
		System.out.println(s.minDistance("c", "a"));
	}

}
