package com.dcw.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Minimum Window Substring
 *维护一个字典
 * @author dong
 *
 */
public class Solution_76 {

	public String minWindow(String s, String t) {
        
		if(s.length()<t.length())
			return "";
		HashMap<Character, Integer> tdata=new HashMap<>();
		for(int i=0;i<t.length();i++){
			if(tdata.containsKey(t.charAt(i))){
				tdata.put(t.charAt(i), tdata.get(t.charAt(i))+1);
			}
			else
				tdata.put(t.charAt(i), 1);
		}
		HashMap<Character, Integer> sdata=new HashMap<>();
		
		int start=0;
		int from=-1,to=s.length();
		int minLength=s.length();
		int found=0;//记录找到对应字符的个数
		for(int i=0;i<s.length();i++){
			//每来一个字符进行+1
			if(sdata.containsKey(s.charAt(i))){
				sdata.put(s.charAt(i), sdata.get(s.charAt(i))+1);
			}
			else
				sdata.put(s.charAt(i), 1);
			// 如果加1后这个字符的数量不超过目标串中该字符的数量，则找到了一个匹配字符
			if(sdata.get(s.charAt(i))<=(tdata.get(s.charAt(i))==null?0:tdata.get(s.charAt(i))))
				found++;
			 // 如果找到的匹配字符数等于目标串长度，说明找到了一个符合要求的子串 
			if(found==t.length()){
				// 将开头没用的都跳过，没用是指该字符出现次数超过了目标串中出现的次数，并把它们出现次数都减1
				while(start<i&&sdata.get(s.charAt(start))>(tdata.get(s.charAt(start))==null?0:tdata.get(s.charAt(start)))){
					sdata.put(s.charAt(start), sdata.get(s.charAt(start))-1);
					start++;
				}
				
				// 这时候start指向该子串开头的字母，判断该子串长度
				if(i-start<minLength){
					minLength=i-start;
					from=start;
					to=i+1;
				}	
				// 把开头的这个匹配字符跳过，并将匹配字符数减1
				sdata.put(s.charAt(start), sdata.get(s.charAt(start))-1);
                found--;
                // 子串起始位置加1，我们开始看下一个子串了
                start++;
			}
			
		}
		return from==-1?"":s.substring(from, to);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1234".substring(0, 1));
		Solution_76 s=new Solution_76();
		System.out.println(s.minWindow("ADOBECODEBANC", "ABC"));
	}

}
