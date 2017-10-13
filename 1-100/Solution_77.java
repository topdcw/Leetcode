package com.dcw.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Combinations
 * Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.
 * 组合问题，使用递归
 * 
 * @author topdc
 *
 */
public class Solution_77 {
	private List<List<Integer>> ret=new ArrayList<List<Integer>>();
	private int n;
	public List<List<Integer>> combine(int n, int k) {
		this.n=n;
		if(n<k)
			return ret;
		
		//转化思想，固定一个。求另外k-1种组合，依次递推,使用递归。
		List<Integer> tmp=new ArrayList<>();
		zuhe(1,k,tmp);
		return ret;
    }
	
	private void zuhe(int from,int k,List<Integer> tmp){
		if(k==0){
			List<Integer> data=new ArrayList<>(tmp);
			ret.add(data);
			return;
		}
		for(int i=from;i<=n-k+1;i++){
			tmp.add(i);
			//另外k-1个数字的组合
			zuhe(i+1,k-1,tmp);
            tmp.remove(tmp.size()-1);//移除最后一个
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
