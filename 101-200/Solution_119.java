package com.dcw.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Pascal's Triangle II
 * @author topdc
 *
 */
public class Solution_119 {

	public List<Integer> getRow(int rowIndex) {
		List<List<Integer>> ret= new ArrayList<List<Integer>>();
		for(int i=1;i<=rowIndex+1;i++){
			ArrayList<Integer> tmp=new ArrayList<>();
			for(int j=1;j<=i;j++){
				if(j==1||j==i)//ÿһ�еĵ�һ�������һ����1
					tmp.add(1);
				else//��һ��������֮��
					tmp.add(ret.get(i-2).get(j-2)+ret.get(i-2).get(j-1));
					
			}
			ret.add(tmp);
		}

		return ret.get(rowIndex);
    }
}
