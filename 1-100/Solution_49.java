package com.dcw.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//leetcode提交时可以把import删掉
/**
 * Group Anagrams
 * 将每个词排序后，根据这个键值，找到哈希表中相应的列表，并添加进去
 * @author topdc
 *
 */
public class Solution_49 {
	private List<List<String>> ret=new ArrayList<List<String>>();
	public List<List<String>> groupAnagrams(String[] strs) {
		Map<String, List<String>> m= new HashMap<String,List<String>>();//构建String，List<String>键对
		
		for (String str : strs) {
			//将Strs元素str取出，排序后的值s为key
			char[]chs=str.toCharArray();
			Arrays.sort(chs);
			String s=new String(chs);
			
			List<String> list=m.get(s);//先判断s在不在m中存在
			if(list==null){//不存在就以s为key，并创建list
				list=new ArrayList<String>();
				m.put(s, list);
			}
			//将str装进list中
			list.add(str);
		}
		
		//遍历m，将list存入ret中
		for(String str:m.keySet()){//得到keyset集合，从而得到value
			ret.add(m.get(str));
		}
		
		return ret;
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> m= new HashMap<String,Integer>();
		String s1=new String("111");
		String s2="111";
		System.out.println(s1==s2);
		m.put(s1, 1);
		System.out.println(m.containsKey(s2));
	}

}
