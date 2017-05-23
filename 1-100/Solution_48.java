package com.dcw.leetcode;

/**
 * Rotate Image
 * 将n*n数组顺时针旋转90度
 * 思路，将二维数组分层，每一层是一个正方形，对该正方形实施旋转
 * @author topdc
 *
 */
public class Solution_48 {
    public void rotate(int[][] matrix) {
    	int length=matrix.length;//数组的行数，也是列数
    	int n=(length/2)-1;//将二维数组分为n+1个正方形，(0,0)(1,1)...(n,n)是每个正方形的左上角坐标
    	
    	for(int i=0;i<=n;i++){//对每个正方形进行旋转计算
    		func(matrix,i,length-2*i);
    	}
    	
    }
    
    private void func(int [][]nums,int begin,int length){//第三个参数是正方形边长
    	
    	int []data=new int[length-1];
    	
    	
    	for(int i=0;i<length-1;i++){//移动length-1个
    		data[i]=nums[begin+i][begin+length-1];//记录右侧数据
    		//上到右,右上交坐标（begin+i，begin+length-1）
    		nums[begin+i][begin+length-1]=nums[begin][begin+i];
    		
    		//左到上，左下角坐标（begin+length-1,begin）
    		nums[begin][begin+i]=nums[begin+length-1-i][begin];
    		
    		//下到左，右下角坐标为（begin+length-1，begin+length-1）。
    		nums[begin+length-1-i][begin]=nums[begin+length-1][begin+length-1-i];
    		
    		//右到下
    		nums[begin+length-1][begin+length-1-i]=data[i];
    	}  	
    	
    }
    
    public static void main(String[] args) {
    	int[][] matrix=new int[10][10];
    	System.out.println(matrix.length);
	}
}
