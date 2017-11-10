package com.dcw.leetcode;

/**
 * Largest Rectangle in Histogram
 * @author dong
 *
 */


public class Solution_84 {

	
	//向左右找比他高的
	public int largestRectangleArea(int[] heights) {
        int ret=0;
        
        for(int i=0;i<heights.length;i++){
        	if(i>0&&heights[i]==heights[i-1])
        		continue;
        	else{
        		int tmp=heights[i]*1;
            	//向左寻找
            	for(int j=i-1;j>=0;j--){
            		if(heights[j]>=heights[i])
            			tmp+=heights[i];
            		else
            			break;
            	}
            	//向右寻找
            	for(int j=i+1;j<heights.length;j++){
            		if(heights[j]>=heights[i])
            			tmp+=heights[i];
            		else
            			break;
            	}
            	ret=tmp>ret?tmp:ret;
        	}
        	
        	
        }
		return ret;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []data=new int[1000000];
		for(int i=0;i<data.length;i++)
			data[i]=1;
		
		Solution_84 s=new Solution_84();
		System.out.println(s.largestRectangleArea(data));
	}

}
