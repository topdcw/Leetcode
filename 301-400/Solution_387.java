package com.dcw.leetcode;

import java.util.HashMap;

/**
 * First Unique Character in a String
 * �ҵ���һ�����ظ���ĸ��������������λ��
 * ʹ��hashmap,����hash��˼��
 * @author Dong
 *
 */
public class Solution_387 {
	public int firstUniqChar(String s) {
        //�ȴ���hashmap
		HashMap<Character, Integer> hm=new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if(hm.containsKey(s.charAt(i))){
				hm.put(s.charAt(i), 2);//�ظ���2
			}
			else
				hm.put(s.charAt(i), 1);
		}
		for (int i = 0; i < s.length(); i++) {
			if(hm.get(s.charAt(i))<2)
				return i;
		}
		return -1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
