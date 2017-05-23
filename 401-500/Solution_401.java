package com.dcw.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Binary Watch
 * 思路：求出所有的组合，计算时间，加入到list中
 * @author topdc
 *
 */
public class Solution_401 {
	List<String> ret =new ArrayList<String>();
	public List<String> readBinaryWatch(int num) {
		int []nums=new int[10];
		zuhe(nums, 0, num);
		return ret;
        
    }
	
	//使用递归求组合
	public void zuhe(int[]nums,int from,int target){
		
		if(target==0){
			String s=calculateTime(nums);
			if(s!=null)
				ret.add(s);
		}
		for (int i = from; i < nums.length; i++) {
			nums[i]=1;
			zuhe(nums, i+1, target-1);
			nums[i]=0;
		}
	}
	private String calculateTime(int[]nums){
		int hour=0;
		int min=0;
		for (int i = 0; i <=3; i++) {
			if(nums[i]!=0){
				if((hour+=Math.pow(2, i))>11){
					return null;
				}
			}
		}
		for(int i=4;i<nums.length;i++){
			if(nums[i]!=0){
				if((min+=Math.pow(2, i-4))>59){
					return null;
				}
			}
		}
		
		if(min<10){
			String r=""+hour+':'+'0'+min;
			return r;
		}
			
		else{
			String r=""+hour+':'+min;
			return r;
		}		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution_401 s=new Solution_401();
		List<String> l=s.readBinaryWatch(3);
		for (String string : l) {
			System.out.println(string);
		}
		
	}

}
