package com.dcw.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Minimum Window Substring
 *ά��һ���ֵ�
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
		int found=0;//��¼�ҵ���Ӧ�ַ��ĸ���
		for(int i=0;i<s.length();i++){
			//ÿ��һ���ַ�����+1
			if(sdata.containsKey(s.charAt(i))){
				sdata.put(s.charAt(i), sdata.get(s.charAt(i))+1);
			}
			else
				sdata.put(s.charAt(i), 1);
			// �����1������ַ�������������Ŀ�괮�и��ַ������������ҵ���һ��ƥ���ַ�
			if(sdata.get(s.charAt(i))<=(tdata.get(s.charAt(i))==null?0:tdata.get(s.charAt(i))))
				found++;
			 // ����ҵ���ƥ���ַ�������Ŀ�괮���ȣ�˵���ҵ���һ������Ҫ����Ӵ� 
			if(found==t.length()){
				// ����ͷû�õĶ�������û����ָ���ַ����ִ���������Ŀ�괮�г��ֵĴ������������ǳ��ִ�������1
				while(start<i&&sdata.get(s.charAt(start))>(tdata.get(s.charAt(start))==null?0:tdata.get(s.charAt(start)))){
					sdata.put(s.charAt(start), sdata.get(s.charAt(start))-1);
					start++;
				}
				
				// ��ʱ��startָ����Ӵ���ͷ����ĸ���жϸ��Ӵ�����
				if(i-start<minLength){
					minLength=i-start;
					from=start;
					to=i+1;
				}	
				// �ѿ�ͷ�����ƥ���ַ�����������ƥ���ַ�����1
				sdata.put(s.charAt(start), sdata.get(s.charAt(start))-1);
                found--;
                // �Ӵ���ʼλ�ü�1�����ǿ�ʼ����һ���Ӵ���
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
