package com.dcw.leetcode;
import java.util.Arrays;

//思路：寻找离当前i最近的j。从这个j出发，再去判断离下一个i最近的j

public class Solution_475 {
	public int findRadius(int[] houses, int[] heaters) {
		Arrays.sort(houses);
		Arrays.sort(heaters);
        int len=Integer.MAX_VALUE;
        int res=0;
        for(int i=0,j=0;i<houses.length&&j<heaters.length;){
        	int tmp=Math.abs(houses[i]-heaters[j]);//找令tmp最小的j
        	if(tmp<=len){
        		len=tmp;
        		if(j!=heaters.length-1)//j不是最后一个
        			j++;
        		else{//j是最后一个，判断一次，i进一次1
        			i++;
        			res=len>res?len:res;
            		len=Integer.MAX_VALUE;
        		}
        			
        	}
        	else{//说明上一个j对于当前i是最小值，j回退1，i进1，进入下一个判断
        		j--;
        		i++;
        		res=len>res?len:res;
        		len=Integer.MAX_VALUE;
        	}
        }
		
		//暴力
//		int res=0;
//		for(int i=0;i<houses.length;i++){
//			int min=Integer.MAX_VALUE;
//			for(int j=0;j<heaters.length;j++){
//				int tmp=Math.abs(heaters[j]-houses[i]);
//				min=tmp<min?tmp:min;
//			}
//			res=min>res?min:res;
//		}
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
