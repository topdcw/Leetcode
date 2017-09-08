package com.dcw.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Permutation Sequence
 * 
 * Given n and k, return the kth permutation sequence.
 * 所有排列的第K个字典序排列。
 * @author topdc
 *
 */
public class Solution_60{
	public String getPermutation(int n, int k) {
		k--;//to translate index from 0 rather than 1
		List<Integer> list =new ArrayList<>();
		StringBuilder ret =new StringBuilder();
		for(int i=1;i<=n;i++)
			list.add(i);
		int sum=1;
		for(int i=1;i<=n-1;i++)//n-1的阶乘
			sum*=i;
		int round=n-1;
		while(round>=0){
			ret.append(list.remove(k/sum));//更新结果列表
			k=k%sum;//new k
			if(round!=0)
				sum/=round;//new sum
			round--;
		}
		return ret.toString();
		
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
