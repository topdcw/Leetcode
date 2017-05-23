package com.dcw.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Valid Parentheses
 * 
 * 先把{}、()、[]映射为1,2、4,5、7,8.（hashmap）
 * 构造一个栈，初始指针为-1；
 * 每次读入一个字符入栈，判断入栈的元素与栈顶元素之差的绝对值是否为1
 * 是的话进行消除操作。i=i-2
 * 否的话继续运行
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
			//入栈操作
			stack[++top]=s.charAt(i);
			
			if(top>0&&Math.abs(charToint.get(stack[top])-charToint.get(stack[top-1]))==1){
				//说明栈中至少存在两个元素
				top=top-2;
			}
		}
		
		return false;
        
    }
}
