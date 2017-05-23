package com.dcw.leetcode;


/**
 * Trapping Rain Water
 * 
 * @author topdc
 *
 */
public class Solution_42 {
	public int trap(int[] height) {
		
		int ret=0;
		for(int i=0;i<height.length;i++){
			if(height[i]>0){
				//找到后续所有点中，有两种情况：
				//1：比i结点高度高的最近的一个；
				//2：后续的都比i结点矮，离i点最远，且高度最高的那个。
				int j= maxposition(height, i);
				if(j==i)//表示i为 最后一个节点了。
					return ret;
//				System.out.println("函数m");
				int min=(height[i]<=height[j]?height[i]:height[j]);
				for(int k=i+1;k<j;k++){
					ret=ret+min-height[k];
				}
				i=j-1;
			}
		}
		
		return ret;
    }
	
	public int maxposition(int []height,int from){
		int r=from;
		int max=0;
		for(int i=from+1;i<height.length;i++){
			if(height[i]>=height[from]){
				return i;
			}
			else{
				if(height[i]>=max){
					max=height[i];
					r=i;
				}
			}
		}
		return r;
	}
}
