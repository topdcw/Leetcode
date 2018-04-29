package com.dcw.leetcode;
import java.util.Arrays;

//˼·��Ѱ���뵱ǰi�����j�������j��������ȥ�ж�����һ��i�����j

public class Solution_475 {
	public int findRadius(int[] houses, int[] heaters) {
		Arrays.sort(houses);
		Arrays.sort(heaters);
        int len=Integer.MAX_VALUE;
        int res=0;
        for(int i=0,j=0;i<houses.length&&j<heaters.length;){
        	int tmp=Math.abs(houses[i]-heaters[j]);//����tmp��С��j
        	if(tmp<=len){
        		len=tmp;
        		if(j!=heaters.length-1)//j�������һ��
        			j++;
        		else{//j�����һ�����ж�һ�Σ�i��һ��1
        			i++;
        			res=len>res?len:res;
            		len=Integer.MAX_VALUE;
        		}
        			
        	}
        	else{//˵����һ��j���ڵ�ǰi����Сֵ��j����1��i��1��������һ���ж�
        		j--;
        		i++;
        		res=len>res?len:res;
        		len=Integer.MAX_VALUE;
        	}
        }
		
		//����
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
