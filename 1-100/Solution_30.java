package com.dcw.leetcode;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Substring with Concatenation of All Words
 * 给定一个字符串S和一个字符串数组words，words中的字符串长度都相等，words字符串可以重复，
 * 找出S中所有的子串恰好包含words中所有字符串各一次，返回子串的起始位置
 * 
 * 解题思路：利用hashmap，将 words中字符串存入hashmap中，《string，value》，value是string的个数
 * 
 * @author topdc
 *
 */
public class Solution_30 {
	public List<Integer> findSubstring(String s, String[] words) {
		List<Integer> list = new ArrayList<Integer>();
		if(words.length==0||s.length()<words[0].length()*words.length)
			return list;
		
		//将words中的串存入hashmap中
		HashMap<String, Integer> L =new HashMap<String,Integer>();
		for(int i=0;i<words.length;i++){
			if(L.containsKey(words[i]))
				L.put(words[i], L.get(words[i])+1);
			else
				L.put(words[i], 1);
		}
		int len=words[0].length();//words中一个串的长度
		int end=s.length()-len*words.length;//最后可能的位置
		
		for(int i=0;i<=end;i++){
			HashMap<String, Integer> copy= new HashMap<String, Integer>(L);//巧妙的将Hashmap L复制一份
			int count=0;
			int from =i;
			String str=s.substring(from,from+len);
			while(copy.containsKey(str)&&copy.get(str)>0){
				copy.put(str, copy.get(str)-1);//将value-1
				from = from+len;
				count++;
				if(from+len>s.length())
					break;//防止越界
				str=s.substring(from,from+len);
			}

			
			if(count==words.length){
				list.add(i);
			}
			
		}
		return list;
        
    }
}
