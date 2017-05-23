package com.dcw.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Combination Sum II
 * ������Ŀ39����method�е�index��Ϊi+1;
 * �ڻع�ʱ������һ��while�������ظ������֡���ֹ����ظ�
 * @author topdc
 *
 */



public class Solution_40 {
	public List<List<Integer>> ret=new ArrayList<List<Integer>>(); 
	public List<Integer> tmp=new ArrayList<Integer>();
	
	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
		
		Arrays.sort(candidates);//���������к�ѡ����
		methods(candidates, target,0);
		
		return ret;
        
    }
	
	//indexΪ�˷�ֹ����ظ�
	public void methods(int[] candidates, int target,int index){
		
		if(target==0){
			List<Integer> res =new ArrayList<Integer>();
			res.addAll(tmp);
			ret.add(res);
		}
		else{
			for(int i=index;i<candidates.length;i++){
				if(target-candidates[i]>=0){
					tmp.add(candidates[i]);
					methods(candidates, target-candidates[i],i+1);
					tmp.remove(tmp.size()-1);
					while((i<candidates.length-1)&&(candidates[i]==candidates[i+1])){
						i++;
					}
				}
				else{
					break;
				}
			}
		}
	}
	
}