package com.dcw.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Combination Sum
 * 
 *  采用回溯法，递归
 *  别忘了去重，2,2,3与3,2,2
 *  
 * @author topdc
 *
 */
public class Solution_39 {
	public List<List<Integer>> ret=new ArrayList<List<Integer>>(); 
	public List<Integer> tmp=new ArrayList<Integer>();
	
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		
		Arrays.sort(candidates);//先升序排列候选数字
		methods(candidates, target,0);
		
		return ret;
        
    }
	
	//index为了防止结果重复
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
