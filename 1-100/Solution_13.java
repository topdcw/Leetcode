package com.dcw.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Roman to Integer
 *�ȰѼ��������ַ������ֵ������hashmap��(�ܹ����̲���ʱ��)����ͨ��һ������ȡ�ж�
 *�жϹ������ǰһ�������ڽ���������ʵ�мӷ����磺XI=6.
 *			���ǰһ����С�ڽ���������ʵ�м��������߼�ǰ�ߡ��磺IX=4
 *I = 1;
 *V = 5;
 *X = 10;
 *L = 50;
 *C = 100;
 *D = 500;
 *M = 1000;
 * @author topdc
 *
 */
public class Solution_13 {
	
	public int romanToInt(String s) {
		Map<Character,Integer> hm=new HashMap<Character,Integer>();
		hm.put('I',1);
		hm.put('V',5);
		hm.put('X',10 );
		hm.put('L',50);
		hm.put('C',100 );
		hm.put('D',500 );
		hm.put('M',1000);
		
		int n=s.length();
		int r=0;
		for(int i=0;i<n-1;i++){
			if(hm.get(s.charAt(i))>=hm.get(s.charAt(i+1)))
				r+=hm.get(s.charAt(i));
			else
				r-=hm.get(s.charAt(i));
		}
		r+=hm.get(s.charAt(n-1));
		return r;
    }

}
