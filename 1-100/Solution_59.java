package com.dcw.leetcode;

/**
 * Spiral Matrix II
 * ��������
 * @author topdc
 *
 */
public class Solution_59 {

	public int[][] generateMatrix(int n) {
        int [][]ret=new int[n][n];
        int mid=n/2;//���ɵ������Ļ���
        int right=n-1;//�ұ߽�
        int count=1;
        for(int i=0;i<=mid;i++){
        	//���Ϻ�
        	for(int j=i;j<=right;j++)
        		ret[i][j]=count++;
        	//����
        	for(int j=i+1;j<=right;j++)
        		ret[j][right]=count++;
        	//�º�
        	for(int j=right-1;j>=i;j--)
        		ret[right][j]=count++;
        	//����
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
