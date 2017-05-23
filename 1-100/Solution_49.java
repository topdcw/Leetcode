package com.dcw.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//leetcode�ύʱ���԰�importɾ��
/**
 * Group Anagrams
 * ��ÿ��������󣬸��������ֵ���ҵ���ϣ������Ӧ���б�����ӽ�ȥ
 * @author topdc
 *
 */
public class Solution_49 {
	private List<List<String>> ret=new ArrayList<List<String>>();
	public List<List<String>> groupAnagrams(String[] strs) {
		Map<String, List<String>> m= new HashMap<String,List<String>>();//����String��List<String>����
		
		for (String str : strs) {
			//��StrsԪ��strȡ����������ֵsΪkey
			char[]chs=str.toCharArray();
			Arrays.sort(chs);
			String s=new String(chs);
			
			List<String> list=m.get(s);//���ж�s�ڲ���m�д���
			if(list==null){//�����ھ���sΪkey��������list
				list=new ArrayList<String>();
				m.put(s, list);
			}
			//��strװ��list��
			list.add(str);
		}
		
		//����m����list����ret��
		for(String str:m.keySet()){//�õ�keyset���ϣ��Ӷ��õ�value
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
