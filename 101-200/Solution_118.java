package com.dcw.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Pascal's Triangle
 * @author Dong
 *
 */
public class Solution_118 {
	List<List<Integer>> ret= new ArrayList<List<Integer>>();
	public List<List<Integer>> generate(int numRows) {
		for(int i=1;i<=numRows;i++){
			ArrayList<Integer> tmp=new ArrayList<>();
			for(int j=1;j<=i;j++){
				if(j==1||j==i)//ÿһ�еĵ�һ�������һ����1
					tmp.add(1);
				else//��һ��������֮��
					tmp.add(ret.get(i-2).get(j-2)+ret.get(i-2).get(j-1));
					
			}
			ret.add(tmp);
		}
		return ret;
        
    }
}
