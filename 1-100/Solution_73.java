package com.dcw.leetcode;

/**
 * Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in place.
 * 
 * @author topdc
 *
 */
public class Solution_73 {

	public void setZeroes(int[][] matrix) {
        if(matrix.length==0)
        	return;
        int m=matrix.length;//��
        int n=matrix[0].length;//��
        int []data1=new int[m];//��ʾ�����Ƿ�����
        int []data2=new int[n];//��ʾ�����Ƿ�����
        for(int i=0;i<m;i++){
        	for(int j=0;j<n;j++){
        		if(matrix[i][j]==0){
        			data1[i]=1;
        			data2[j]=1;
        		}
        			
        	}
        }
        for(int i=0;i<m;i++){
        	if(data1[i]==1){
        		for(int j=0;j<n;j++)
        			matrix[i][j]=0;
        	}
        }
        for(int i=0;i<n;i++){
        	if(data2[i]==1){
        		for(int j=0;j<m;j++)
        			matrix[j][i]=0;
        	}
        }
    }
	public static void main(String[] args) {
		
	}
}
