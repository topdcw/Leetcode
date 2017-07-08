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
				if(j==1||j==i)//每一行的第一个和最后一个是1
					tmp.add(1);
				else//上一行两个数之和
					tmp.add(ret.get(i-2).get(j-2)+ret.get(i-2).get(j-1));
					
			}
			ret.add(tmp);
		}
		return ret;
        
    }
}
