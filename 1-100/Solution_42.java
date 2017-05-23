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
				//�ҵ��������е��У������������
				//1����i���߶ȸߵ������һ����
				//2�������Ķ���i��㰫����i����Զ���Ҹ߶���ߵ��Ǹ���
				int j= maxposition(height, i);
				if(j==i)//��ʾiΪ ���һ���ڵ��ˡ�
					return ret;
//				System.out.println("����m");
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
