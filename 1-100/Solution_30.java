package com.dcw.leetcode;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Substring with Concatenation of All Words
 * ����һ���ַ���S��һ���ַ�������words��words�е��ַ������ȶ���ȣ�words�ַ��������ظ���
 * �ҳ�S�����е��Ӵ�ǡ�ð���words�������ַ�����һ�Σ������Ӵ�����ʼλ��
 * 
 * ����˼·������hashmap���� words���ַ�������hashmap�У���string��value����value��string�ĸ���
 * 
 * @author topdc
 *
 */
public class Solution_30 {
	public List<Integer> findSubstring(String s, String[] words) {
		List<Integer> list = new ArrayList<Integer>();
		if(words.length==0||s.length()<words[0].length()*words.length)
			return list;
		
		//��words�еĴ�����hashmap��
		HashMap<String, Integer> L =new HashMap<String,Integer>();
		for(int i=0;i<words.length;i++){
			if(L.containsKey(words[i]))
				L.put(words[i], L.get(words[i])+1);
			else
				L.put(words[i], 1);
		}
		int len=words[0].length();//words��һ�����ĳ���
		int end=s.length()-len*words.length;//�����ܵ�λ��
		
		for(int i=0;i<=end;i++){
			HashMap<String, Integer> copy= new HashMap<String, Integer>(L);//����Ľ�Hashmap L����һ��
			int count=0;
			int from =i;
			String str=s.substring(from,from+len);
			while(copy.containsKey(str)&&copy.get(str)>0){
				copy.put(str, copy.get(str)-1);//��value-1
				from = from+len;
				count++;
				if(from+len>s.length())
					break;//��ֹԽ��
				str=s.substring(from,from+len);
			}

			
			if(count==words.length){
				list.add(i);
			}
			
		}
		return list;
        
    }
}
