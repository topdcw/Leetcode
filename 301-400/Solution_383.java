package com.dcw.leetcode;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Ransom Note   
 * 第一种使用hashmap
 * 第二种先转换为字符数组排序后逐位比对。
 * @author Dong
 *
 */
public class Solution_383 {

	public boolean canConstruct(String ransomNote, String magazine) {
       HashMap<Character, Integer>hm=new HashMap<>();
       for(int i=0;i<magazine.length();i++){
    	   char tmp=magazine.charAt(i);
    	   if(hm.containsKey(tmp))
    		   hm.put(tmp,hm.get(tmp)+1);
    	   else
    		   hm.put(tmp, 1);
       }
       for(int i=0;i<ransomNote.length();i++){
    	   char tmp=ransomNote.charAt(i);
    	   if(hm.containsKey(tmp)){
    		   if(hm.get(tmp)>0)
    			   hm.put(tmp,hm.get(tmp)-1);
    		   else
    			   return false;  
    	   }
    	   else
    		   return false;
       }
       return true;
    }
	public boolean canConstruct1(String ransomNote, String magazine) {
		char[]s1=ransomNote.toCharArray();
		char[]s2=magazine.toCharArray();
		Arrays.sort(s1);
		Arrays.sort(s2);
		int i=0,j=0;
		while(i<s1.length&&j<s2.length){
			if(s1[i]<s2[j])
				return false;
			if(s1[i]>s2[j])
				j++;
			else{
				i++;
				j++;
			}
		}
		if(i!=s1.length)
			return false;
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
