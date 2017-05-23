package com.dcw.leetcode;


/**
 * Implement strStr()
 * 求子串的位置，如果不是子串，返回-1，如果needle是空串，返回0
 * 使用KMP算法,主串不回溯。
 * @author topdc
 *
 */
public class Solution_28 {
	public int strStr(String haystack, String needle) {
		//needle长度为0，为1，及大于haystack长度的情况
		if(needle.length()==0)
		    return 0;
		if(needle.length()==1){
			for(int i=0;i<haystack.length();i++){
				if(haystack.charAt(i)==needle.charAt(0))//找到第一次出现的位置返回
					return i;
			}
			return -1;
		}
		if(needle.length()>haystack.length()){
			return -1;
		}
		//needle长度>=2的情况
		int[] index = new int[needle.length()];//用于记录不匹配时，下一个用来匹配的位置。
		buildindex(index,needle);
		
		//串匹配。主串不回溯
		int i,j;
		i=j=0;
		int l1=haystack.length();
		int l2=needle.length();
		while(i<l1&&j<l2){
			while(j!=-1){
				if(haystack.charAt(i)==needle.charAt(j)){
					i++;
					j++;
					break;
				}
				else{
					j=index[j];
				}
			}
			if(j==-1){
				i++;
				j=0;
			}			
		}
		if(j==l2){//说明匹配成功
			return i-l2;
		}
		else
			return -1;
	}

	private void buildindex(int[] index,String needle){
		
		index[0]=-1;//表示不匹配的话，主串需要后移。
		index[1]=0;
		for(int i=2;i<index.length;i++){
			int j=index[i-1];
			while(j!=-1){
				if(needle.charAt(i-1)==needle.charAt(j)){
					index[i]=j+1;
					break;
				}
				else{
					j=index[j];
				}
			}
			if(j==-1)
				index[i]=0;
		}	
		
	}
}

