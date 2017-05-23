package com.dcw.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Letter Combinations of a Phone Number
 * 
 * 采用递归实现
 * @author topdc
 *
 */
public class Solution_17 {
	
	private List<String> lis=new ArrayList<String>();
	private List<List<Character>> digitalData=new ArrayList<List<Character>>();
	//相关map信息初始化
	public Solution_17(){
		List<Character> L0=new ArrayList<Character>();
		List<Character> L1=new ArrayList<Character>();
		List<Character> L2=new ArrayList<Character>();
		L2.add('a');L2.add('b');L2.add('c');
		List<Character> L3=new ArrayList<Character>();
		L3.add('d');L3.add('e');L3.add('f');
		List<Character> L4=new ArrayList<Character>();
		L4.add('g');L4.add('h');L4.add('i');
		List<Character> L5=new ArrayList<Character>();
		L5.add('j');L5.add('k');L5.add('l');
		List<Character> L6=new ArrayList<Character>();
		L6.add('m');L6.add('n');L6.add('o');
		List<Character> L7=new ArrayList<Character>();
		L7.add('p');L7.add('q');L7.add('r');L7.add('s');
		List<Character> L8=new ArrayList<Character>();
		L8.add('t');L8.add('u');L8.add('v');
		List<Character> L9=new ArrayList<Character>();
		L9.add('w');L9.add('x');L9.add('y');L9.add('z');
		
		digitalData.add(L0);digitalData.add(L1);digitalData.add(L2);digitalData.add(L3);
		digitalData.add(L4);digitalData.add(L5);digitalData.add(L6);digitalData.add(L7);
		digitalData.add(L8);digitalData.add(L9);
	}
	
	public List<String> letterCombinations(String digits) {
		if(digits.length()==0){
			return lis;
		}
		addToList("", digits);		
		return lis;
        
    }
	public void addToList(String s,String digits){
		if(digits.length()==1){
			int k=digits.charAt(0)-'0';
			for(int i=0;i<digitalData.get(k).size();i++){
				lis.add(new String(s+digitalData.get(k).get(i)));
			}
		}
		else{
			int k=digits.charAt(0)-'0';//第一个数字是多少
			for(int i=0;i<digitalData.get(k).size();i++){
				addToList(s+digitalData.get(k).get(i),digits.substring(1));
			}
		}
		
	}
	
}
