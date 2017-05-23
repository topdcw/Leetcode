package com.dcw.leetcode;

import java.util.HashMap;

/**
 * Number of Boomerangs   
 * 
 * @author topdc
 *
 */
public class Solution_447 {

	public int numberOfBoomerangs(int[][] points) {
		int n=points.length;
		int ret=0;
		//就是一个一个算
		for(int i=0;i<n;i++){
			HashMap< Integer, Integer>hm=new HashMap<>();
			for(int j=0;j<n;j++){
				int dis=(points[i][0]-points[j][0])*(points[i][0]-points[j][0])+(points[i][1]-points[j][1])*(points[i][1]-points[j][1]);
				if(hm.containsKey(dis)){//说明之前计算的距离与刚计算的距离有相同的
					ret+=hm.get(dis)*2;//value值表示有几个距地i个点距离相同的点，在构成结果时，因为可以交换，所以乘以2
					hm.put(dis, hm.get(dis)+1);
				}
				else{
					hm.put(dis, 1);
				}	
			}
		}
		
		
		return ret;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
