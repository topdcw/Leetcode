package com.dcw.leetcode;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Simplify Path
 * 简化路径，使用栈实现
 * 格式 X/作为一个结构进行处理
 * @author topdc
 *
 */
public class Solution_71 {

	public String simplifyPath(String path) {
		if(path.length()==0||path.length()==1)
			return path;
		if(path.charAt(path.length()-1)!='/')//保证最后一个是/
			path+="/";
		LinkedList<Character> data=new LinkedList<>();
		data.add(path.charAt(0));
		int i=1;
		while(i<path.length()){
			char ch=path.charAt(i);
			if(ch=='.'){
				if(data.peekLast()=='.'&&data.get(data.size()-2)=='/'&&path.charAt(i+1)=='/'){//出栈
					data.pollLast();//将.出栈
					if(data.size()!=1)//看/是不是最后一个
						data.pollLast();//将/出栈
					while(data.peekLast()!='/')
						data.pollLast();
					i+=2;
				}
				else{
					data.add(ch);
					i++;
				}
				
			}
			else{
				if(ch=='/'){
					if(data.peekLast()=='.'&&data.get(data.size()-2)=='/')
						data.pollLast();
					else
						if(data.peekLast()!='/')
							data.add(ch);							
					i++;
				}
				else{
					data.add(ch);
					i++;
				}		
			}
		}
		if(data.size()!=1)//看/是不是最后一个
			data.pollLast();//将/出栈
		StringBuilder ret=new StringBuilder();
		for (Character ch : data) {
			ret.append(ch);
		}
		return ret.toString();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution_71 s=new Solution_71();
		System.out.println(s.simplifyPath("/a/./b/../../c/"));
		System.out.println(s.simplifyPath("/..."));
	}

}
