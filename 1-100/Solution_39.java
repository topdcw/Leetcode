package com.dcw.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Combination Sum
 * 
 *  ���û��ݷ����ݹ�
 *  ������ȥ�أ�2,2,3��3,2,2
 *  
 * @author topdc
 *
 */
public class Solution_39 {
	public List<List<Integer>> ret=new ArrayList<List<Integer>>(); 
	public List<Integer> tmp=new ArrayList<Integer>();
	
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		
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
					methods(candidates, target-candidates[i],i);
					tmp.remove(tmp.size()-1);
				
				}
				else{
					break;
				}
			}
		}
	}
	
}
