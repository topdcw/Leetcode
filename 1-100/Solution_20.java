package com.dcw.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Valid Parentheses
 * 
 * �Ȱ�{}��()��[]ӳ��Ϊ1,2��4,5��7,8.��hashmap��
 * ����һ��ջ����ʼָ��Ϊ-1��
 * ÿ�ζ���һ���ַ���ջ���ж���ջ��Ԫ����ջ��Ԫ��֮��ľ���ֵ�Ƿ�Ϊ1
 * �ǵĻ���������������i=i-2
 * ��Ļ���������
 * @author topdc
 *
 */
public class Solution_20 {
	public boolean isValid(String s) {
		Map<Character, Integer> charToint=new HashMap<Character, Integer>();
		charToint.put('{', 1);
		charToint.put('}', 2);
		charToint.put('(', 4);
		charToint.put(')', 5);
		charToint.put('[', 7);
		charToint.put(']', 8);
		char[] stack=new char[s.length()];
		int top=-1;
		
		for(int i=0;i<s.length();i++){
			//��ջ����
			stack[++top]=s.charAt(i);
			
			if(top>0&&Math.abs(charToint.get(stack[top])-charToint.get(stack[top-1]))==1){
				//˵��ջ�����ٴ�������Ԫ��
				top=top-2;
			}
		}
		
		return false;
        
    }
}
