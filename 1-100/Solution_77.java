package com.dcw.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Combinations
 * Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.
 * ������⣬ʹ�õݹ�
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
		
		//ת��˼�룬�̶�һ����������k-1����ϣ����ε���,ʹ�õݹ顣
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
			//����k-1�����ֵ����
			zuhe(i+1,k-1,tmp);
            tmp.remove(tmp.size()-1);//�Ƴ����һ��
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
