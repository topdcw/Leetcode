package com.dcw.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Subsets II
 * Given a collection of integers 
 * that might contain duplicates, nums, return all possible subsets (the power set).
 * ˼·1�������ɣ���ȥ��
 * ˼·2�������ɹ�����ȥ��
 * ����˼·2
 * @author dong
 *
 */
public class Solution_90 {

	private List<List<Integer>> ret=new ArrayList<List<Integer>>();
	public List<List<Integer>> subsetsWithDup(int[] nums) {
        ret.add(new ArrayList<>());//�ռ�Ҳ���Ӽ�
        if(nums.length==0)
        	return ret;
        Arrays.sort(nums);//��֤�����ݵ����򣬱����ж��ظ�
        for(int i=0;i<nums.length;i++){
        	ArrayList<Integer> tmp=new ArrayList<>();
        	zuhe(tmp,nums,0,i+1);
        }
        return ret;
		
    }
	
	private void zuhe(ArrayList<Integer> tmp,int nums[],int from,int n){
		if(n==0){
			int flag=0;
			for(int i=ret.size()-1;i>=0;i--){
				flag=0;//������0
				List<Integer> data=ret.get(i);
				//��Ϊ�ǳ��ȵ������Ӽ�������Ҫô���ڣ�Ҫô����
				if(tmp.size()>data.size()){
					ret.add(new ArrayList<>(tmp));
					break;
				}
				else{
					for (int j = 0; j < data.size(); j++) {
						if(data.get(j)!=tmp.get(j)){
							flag=1;
							break;
						}
					}
					if(flag==0)
						break;
				}
			}
			if(flag==1)
				ret.add(new ArrayList<>(tmp));
			
		}
		else{
			for(int i=from;i<nums.length-n+1;i++){
				tmp.add(nums[i]);
				zuhe(tmp, nums, i+1, n-1);
				tmp.remove(tmp.size()-1);
			}
			
			
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
