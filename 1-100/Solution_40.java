package com.dcw.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Combination Sum II
 * 类型题目39，将method中的index改为i+1;
 * 在回归时，增加一个while，跳过重复的数字。防止结果重复
 * @author topdc
 *
 */



public class Solution_40 {
	public List<List<Integer>> ret=new ArrayList<List<Integer>>(); 
	public List<Integer> tmp=new ArrayList<Integer>();
	
	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
		
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