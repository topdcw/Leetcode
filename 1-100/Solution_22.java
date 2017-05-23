package com.dcw.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Generate Parentheses
 * 采用栈实现
 * 卡特兰数
 * @author topdc
 *
 */
public class Solution_22 {
	int []count = new int[2];//用于 表示栈外（和）的个数，count[0]是（的个数，count[1]是）的个数
	List<Character> list = new ArrayList<Character>();
	int num;
	List<String> ret = new ArrayList<String>();
	public List<String> generateParenthesis(int n) {
		count[0]=count[1]=n;
		num = n;
		
		return ret;
    }
	
	//采用递归实现，如果count[0]大于0，）入栈，如果count[1]>count[0],(入栈
	public void katelan(){
		if(count[0]>0){
			//入栈
			list.add('(');
			count[0]--;
			katelan();//递归调用
			//出栈
			list.remove(list.size()-1);
			count[0]++;
		}
		if(count[1]>count[0]){
			list.add(')');
			count[1]--;
			katelan();//递归调用
			//出栈
			list.remove(list.size()-1);
			count[1]++;
		}
		if(list.size()==2*num){
			System.out.println(list.toString());
			ret.add(list.toString());
		}
	}
}
