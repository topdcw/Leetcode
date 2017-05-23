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
		//����һ��һ����
		for(int i=0;i<n;i++){
			HashMap< Integer, Integer>hm=new HashMap<>();
			for(int j=0;j<n;j++){
				int dis=(points[i][0]-points[j][0])*(points[i][0]-points[j][0])+(points[i][1]-points[j][1])*(points[i][1]-points[j][1]);
				if(hm.containsKey(dis)){//˵��֮ǰ����ľ�����ռ���ľ�������ͬ��
					ret+=hm.get(dis)*2;//valueֵ��ʾ�м������i���������ͬ�ĵ㣬�ڹ��ɽ��ʱ����Ϊ���Խ��������Գ���2
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
