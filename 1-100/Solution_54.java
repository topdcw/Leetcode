package com.dcw.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Spiral Matrix 
 * �����������飬˼·��һȦһȦ����,ע���������������
 * @author topdc
 *
 */
public class Solution_54 {
	public List<Integer> spiralOrder(int[][] matrix) {
			
		List<Integer> ret =new ArrayList<Integer>();
		if(matrix.length==0)
			return ret;
		int m=matrix.length;
		int n=matrix[0].length;
		int mid=(m-1)/2>(n-1)/2?(n-1)/2:(m-1)/2;
		for(int i=0;i<=mid;i++){//�ܹ�����mid+1��
			
			for(int j=i;j<n;j++){//����
				ret.add(matrix[i][j]);
			}
			for(int j=i+1;j<m;j++){//����
				ret.add(matrix[j][n-1]);
			}
			for(int j=n-2;j>=i&&i<m-1;j--){//����
				ret.add(matrix[m-1][j]);
			}
			for(int j=m-2;j>i&&i<n-1;j--){//����
				ret.add(matrix[j][i]);
			}
			m--;
			n--;
		}
		
		return ret;
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
