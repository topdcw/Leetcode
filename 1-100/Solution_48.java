package com.dcw.leetcode;

/**
 * Rotate Image
 * ��n*n����˳ʱ����ת90��
 * ˼·������ά����ֲ㣬ÿһ����һ�������Σ��Ը�������ʵʩ��ת
 * @author topdc
 *
 */
public class Solution_48 {
    public void rotate(int[][] matrix) {
    	int length=matrix.length;//�����������Ҳ������
    	int n=(length/2)-1;//����ά�����Ϊn+1�������Σ�(0,0)(1,1)...(n,n)��ÿ�������ε����Ͻ�����
    	
    	for(int i=0;i<=n;i++){//��ÿ�������ν�����ת����
    		func(matrix,i,length-2*i);
    	}
    	
    }
    
    private void func(int [][]nums,int begin,int length){//�����������������α߳�
    	
    	int []data=new int[length-1];
    	
    	
    	for(int i=0;i<length-1;i++){//�ƶ�length-1��
    		data[i]=nums[begin+i][begin+length-1];//��¼�Ҳ�����
    		//�ϵ���,���Ͻ����꣨begin+i��begin+length-1��
    		nums[begin+i][begin+length-1]=nums[begin][begin+i];
    		
    		//���ϣ����½����꣨begin+length-1,begin��
    		nums[begin][begin+i]=nums[begin+length-1-i][begin];
    		
    		//�µ������½�����Ϊ��begin+length-1��begin+length-1����
    		nums[begin+length-1-i][begin]=nums[begin+length-1][begin+length-1-i];
    		
    		//�ҵ���
    		nums[begin+length-1][begin+length-1-i]=data[i];
    	}  	
    	
    }
    
    public static void main(String[] args) {
    	int[][] matrix=new int[10][10];
    	System.out.println(matrix.length);
	}
}
